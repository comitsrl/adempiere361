/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.acct;

import java.lang.reflect.Constructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.exceptions.DBException;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MTable;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.util.ValueNamePair;

/**
 * This class contains methods to manage the posting of financial document. Most of the code is adapted from the legacy code in Doc.java
 * @author Jorg Janke
 * @author hengsin
 *
 */
public class DocManager {

	private final static CLogger s_log = CLogger.getCLogger(DocManager.class);

	/** AD_Table_ID's of documents          */
	private static int[]  documentsTableID = null;

	/** Table Names of documents          */
	private static String[]  documentsTableName = null;

	/*
	 * Array of tables with Post column
	 */
	public static int[] getDocumentsTableID() {
		fillDocumentsTableArrays();
		return documentsTableID;
	}

	public static String[] getDocumentsTableName() {
		fillDocumentsTableArrays();
		return documentsTableName;
	}

	private static void fillDocumentsTableArrays() {
		if (documentsTableID == null) {
			String sql = "SELECT t.AD_Table_ID, t.TableName " +
					"FROM AD_Table t, AD_Column c " +
					"WHERE t.AD_Table_ID=c.AD_Table_ID AND " +
					"c.ColumnName='Posted' AND " +
					"IsView='N' " +
					"ORDER BY t.AD_Table_ID";
			ArrayList<Integer> tableIDs = new ArrayList<Integer>();
			ArrayList<String> tableNames = new ArrayList<String>();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				rs = pstmt.executeQuery();
				while (rs.next())
				{
					tableIDs.add(rs.getInt(1));
					tableNames.add(rs.getString(2));
				}
			}
			catch (SQLException e)
			{
				throw new DBException(e, sql);
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null; pstmt = null;
			}
			//	Convert to array
			documentsTableID = new int[tableIDs.size()];
			documentsTableName = new String[tableIDs.size()];
			for (int i = 0; i < documentsTableID.length; i++)
			{
				documentsTableID[i] = tableIDs.get(i);
				documentsTableName[i] = tableNames.get(i);
			}
		}
	}

	/**
	 *  Create Posting document
	 *	@param as accounting schema
	 *  @param AD_Table_ID Table ID of Documents
	 *  @param Record_ID record ID to load
	 *  @param trxName transaction name
	 *  @return Document or null
	 */
	public static Doc getDocument(MAcctSchema as, int AD_Table_ID, int Record_ID, String trxName)
	{
		String TableName = null;
		for (int i = 0; i < DocManager.getDocumentsTableID().length; i++)
		{
			if (DocManager.getDocumentsTableID()[i] == AD_Table_ID)
			{
				TableName = DocManager.getDocumentsTableName()[i];
				break;
			}
		}
		if (TableName == null)
		{
			s_log.severe("Not found AD_Table_ID=" + AD_Table_ID);
			return null;
		}
		//
		Doc doc = null;
		StringBuffer sql = new StringBuffer("SELECT * FROM ")
			.append(TableName)
			.append(" WHERE ").append(TableName).append("_ID=? AND Processed='Y'");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), trxName);
			pstmt.setInt (1, Record_ID);
			rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				doc = getDocument (as, AD_Table_ID, rs, trxName);
			}
			else
				s_log.severe("Not Found: " + TableName + "_ID=" + Record_ID);
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql.toString(), e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; 
			pstmt = null;
		}
		return doc;
	}

	/**
	 *  Create Posting document
	 *	@param as accounting schema
	 *  @param AD_Table_ID Table ID of Documents
	 *  @param rs ResultSet
	 *  @param trxName transaction name
	 *  @return Document
	 * @throws AdempiereUserError
	 */
	public static Doc getDocument(MAcctSchema as, int AD_Table_ID, ResultSet rs, String trxName)
	{
		Doc doc = null;
		
		/* Classname of the Doc class follows this convention:
		 * if the prefix (letters before the first underscore _) is 1 character, then the class is Doc_TableWithoutPrefixWithoutUnderscores
		 * otherwise Doc_WholeTableWithoutUnderscores
		 * i.e. following this query
              SELECT t.ad_table_id, tablename, 
              	CASE 
              		WHEN instr(tablename, '_') = 2 
              		THEN 'Doc_' || substr(tablename, 3) 
              		WHEN instr(tablename, '_') > 2 
              		THEN 'Doc_' || 
              		ELSE '' 
              	REPLACE
              		(
              			tablename, '_', ''
              		)
              	END AS classname 
              FROM ad_table t, ad_column C 
              WHERE t.ad_table_id = C.ad_table_id AND
              	C.columnname = 'Posted' AND
              	isview = 'N' 
              ORDER BY 1
		 * This is:
		 * 224		GL_Journal			Doc_GLJournal
		 * 259		C_Order				Doc_Order
		 * 318		C_Invoice			Doc_Invoice
		 * 319		M_InOut				Doc_InOut
		 * 321		M_Inventory			Doc_Inventory
		 * 323		M_Movement			Doc_Movement
		 * 325		M_Production		Doc_Production
		 * 335		C_Payment			Doc_Payment
		 * 392		C_BankStatement		Doc_BankStatement
		 * 407		C_Cash				Doc_Cash
		 * 472		M_MatchInv			Doc_MatchInv
		 * 473		M_MatchPO			Doc_MatchPO
		 * 623		C_ProjectIssue		Doc_ProjectIssue
		 * 702		M_Requisition		Doc_Requisition
		 * 735		C_AllocationHdr		Doc_AllocationHdr
		 * 53027	PP_Order			Doc_PPOrder
		 * 53035	PP_Cost_Collector	Doc_PPCostCollector
		 * 53037	DD_Order			Doc_DDOrder
		 * 53092	HR_Process			Doc_HRProcess
		 */
		
		String tableName = MTable.getTableName(Env.getCtx(), AD_Table_ID);
		String packageName = "org.compiere.acct";
		String className = null;

		int firstUnderscore = tableName.indexOf("_");
		if (firstUnderscore == 1)
			className = packageName + ".Doc_" + tableName.substring(2).replaceAll("_", "");
		else
			className = packageName + ".Doc_" + tableName.replaceAll("_", "");
		
		try
		{
			Class<?> cClass = Class.forName(className);
			Constructor<?> cnstr = cClass.getConstructor(new Class[] {MAcctSchema.class, ResultSet.class, String.class});
			doc = (Doc) cnstr.newInstance(as, rs, trxName);
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, "Doc Class invalid: " + className + " (" + e.toString() + ")");
			return null;
		}

		if (doc == null)
			s_log.log(Level.SEVERE, "Unknown AD_Table_ID=" + AD_Table_ID);
		return doc;
	}

	/**
	 *  Post Document
	 * 	@param ass accounting schema
	 * 	@param AD_Table_ID	Transaction table
	 *  @param Record_ID    Record ID of this document
	 *  @param force        force posting
	 *  @param repost		Repost document
	 *  @param trxName		transaction
	 *  @return null if the document was posted or error message
	 */
	public static String postDocument(MAcctSchema[] ass,
		int AD_Table_ID, int Record_ID, boolean force, boolean repost, String trxName) {

		String tableName = null;
		for (int i = 0; i < getDocumentsTableID().length; i++)
		{
			if (getDocumentsTableID()[i] == AD_Table_ID)
			{
				tableName = getDocumentsTableName()[i];
				break;
			}
		}
		if (tableName == null)
		{
			s_log.severe("Table not a financial document. AD_Table_ID=" + AD_Table_ID);
			return "Table not a financial document. AD_Table_ID="+AD_Table_ID;
		}

		StringBuffer sql = new StringBuffer("SELECT * FROM ")
		.append(tableName)
		.append(" WHERE ").append(tableName).append("_ID=? AND Processed='Y'");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), trxName);
			pstmt.setInt (1, Record_ID);
			rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				return postDocument(ass, AD_Table_ID, rs, force, repost, trxName);
			}
			else
			{
				s_log.severe("Not Found: " + tableName + "_ID=" + Record_ID);
				return "NoDoc";
			}
		}
		catch (Exception e)
		{
			if (e instanceof RuntimeException)
				throw (RuntimeException)e;
			else
				throw new AdempiereException(e);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}

	/**
	 *  Post Document
	 * 	@param ass accounting schema
	 * 	@param AD_Table_ID	Transaction table
	 *  @param rs			Result set
	 *  @param force        force posting
	 *  @param repost		Repost document
	 *  @param trxName		transaction
	 *  @return null if the document was posted or error message
	 */
	public static String postDocument(MAcctSchema[] ass,
		int AD_Table_ID, ResultSet rs, boolean force, boolean repost, String trxName) {
		String localTrxName = null;
		if (trxName == null)
		{
			localTrxName = Trx.createTrxName("Post");
			trxName = localTrxName;
		}
		
		Trx trx = Trx.get(trxName, true);
		String error = null;
		try
		{
			String status = "";
			for(MAcctSchema as : ass)
			{
				Doc doc = Doc.get (as, AD_Table_ID, rs, trxName);
				if (doc != null)
				{
					Savepoint savepoint = trx.setSavepoint(null);
					error = doc.post (force, repost);	//	repost
					status = doc.getPostStatus();
					if (error != null && error.trim().length() > 0)
					{
						trx.rollback(savepoint);
						break;
					}
					else
					{
						try {
							trx.releaseSavepoint(savepoint);
						} catch (Exception e) {}
					}
				}
				else
				{
					return "NoDoc";
				}
			}

			MTable table = MTable.get(Env.getCtx(), AD_Table_ID);
			int Record_ID = rs.getInt(table.getKeyColumns()[0]);
			//  Commit Doc
			if (!save(trxName, AD_Table_ID, Record_ID, status))
			{
				ValueNamePair dbError = CLogger.retrieveError();
				// log.log(Level.SEVERE, "(doc not saved) ... rolling back");
				if (localTrxName != null) {
					if (trx != null)
						trx.rollback();
				}
				if (dbError != null)
					error = dbError.getValue();
				else
					error = "SaveError";
			}
			if (localTrxName != null) {
				if (trx != null)
					trx.commit();
			}
		}
		catch (Exception e)
		{
			if (localTrxName != null) {
				if (trx != null)
					trx.rollback();
			}
			if (e instanceof RuntimeException)
				throw (RuntimeException) e;
			else
				throw new AdempiereException(e);
		}
		finally
		{
			if (localTrxName != null)
			{
				if (trx != null)
					trx.close();
			}
		}
		return error;
	}

	/**************************************************************************
	 *  Save to Disk - set posted flag
	 *  @param trxName transaction name
	 *  @return true if saved
	 */
	private final static boolean save (String trxName, int AD_Table_ID, int Record_ID, String status)
	{
		MTable table = MTable.get(Env.getCtx(), AD_Table_ID);
		StringBuffer sql = new StringBuffer("UPDATE ");
		sql.append(table.getTableName()).append(" SET Posted='").append(status)
			.append("',Processing='N' ")
			.append("WHERE ")
			.append(table.getTableName()).append("_ID=").append(Record_ID);
		CLogger.resetLast();
		int no = DB.executeUpdate(sql.toString(), trxName);
		return no == 1;
	}   //  save
}
