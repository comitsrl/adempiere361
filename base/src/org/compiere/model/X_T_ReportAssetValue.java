/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for T_ReportAssetValue
 *  @author Adempiere (generated) 
 *  @version Release 3.5.3a - $Id$ */
public class X_T_ReportAssetValue extends PO implements I_T_ReportAssetValue, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20081221L;

    /** Standard Constructor */
    public X_T_ReportAssetValue (Properties ctx, int T_ReportAssetValue_ID, String trxName)
    {
      super (ctx, T_ReportAssetValue_ID, trxName);
      /** if (T_ReportAssetValue_ID == 0)
        {
			setAD_PInstance_ID (0);
        } */
    }

    /** Load Constructor */
    public X_T_ReportAssetValue (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_T_ReportAssetValue[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_PInstance getAD_PInstance()
    {
		return (I_AD_PInstance)MTable.get(getCtx(), I_AD_PInstance.Table_Name)
			.getPO(getAD_PInstance_ID(), get_TrxName());	}

	/** Set Process Instance.
		@param AD_PInstance_ID 
		Instance of the process
	  */
	public void setAD_PInstance_ID (int AD_PInstance_ID)
	{
		if (AD_PInstance_ID < 1)
			 throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
		set_Value (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
	}

	/** Get Process Instance.
		@return Instance of the process
	  */
	public int getAD_PInstance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Accumulated_Depr.
		@param A_Accumulated_Depr A_Accumulated_Depr	  */
	public void setA_Accumulated_Depr (BigDecimal A_Accumulated_Depr)
	{
		set_Value (COLUMNNAME_A_Accumulated_Depr, A_Accumulated_Depr);
	}

	/** Get A_Accumulated_Depr.
		@return A_Accumulated_Depr	  */
	public BigDecimal getA_Accumulated_Depr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Accumulated_Depr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_ValidCombination getA_Asset_A()
    {
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_Name)
			.getPO(getA_Asset_Acct(), get_TrxName());	}

	/** Set Asset Acct.
		@param A_Asset_Acct Asset Acct	  */
	public void setA_Asset_Acct (int A_Asset_Acct)
	{
		set_Value (COLUMNNAME_A_Asset_Acct, Integer.valueOf(A_Asset_Acct));
	}

	/** Get Asset Acct.
		@return Asset Acct	  */
	public int getA_Asset_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_A_Asset_Class getA_Asset_Class()
    {
		return (I_A_Asset_Class)MTable.get(getCtx(), I_A_Asset_Class.Table_Name)
			.getPO(getA_Asset_Class_ID(), get_TrxName());	}

	/** Set Asset class.
		@param A_Asset_Class_ID Asset class	  */
	public void setA_Asset_Class_ID (int A_Asset_Class_ID)
	{
		if (A_Asset_Class_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_Class_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_Class_ID, Integer.valueOf(A_Asset_Class_ID));
	}

	/** Get Asset class.
		@return Asset class	  */
	public int getA_Asset_Class_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Class_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Asset_Cost.
		@param A_Asset_Cost A_Asset_Cost	  */
	public void setA_Asset_Cost (BigDecimal A_Asset_Cost)
	{
		set_Value (COLUMNNAME_A_Asset_Cost, A_Asset_Cost);
	}

	/** Get A_Asset_Cost.
		@return A_Asset_Cost	  */
	public BigDecimal getA_Asset_Cost () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Asset_Cost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_A_Asset getA_Asset()
    {
		return (I_A_Asset)MTable.get(getCtx(), I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remaining Amt.
		@param A_Asset_Remaining Remaining Amt	  */
	public void setA_Asset_Remaining (BigDecimal A_Asset_Remaining)
	{
		set_Value (COLUMNNAME_A_Asset_Remaining, A_Asset_Remaining);
	}

	/** Get Remaining Amt.
		@return Remaining Amt	  */
	public BigDecimal getA_Asset_Remaining () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Asset_Remaining);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Type.
		@param A_SourceType Source Type	  */
	public void setA_SourceType (String A_SourceType)
	{
		set_Value (COLUMNNAME_A_SourceType, A_SourceType);
	}

	/** Get Source Type.
		@return Source Type	  */
	public String getA_SourceType () 
	{
		return (String)get_Value(COLUMNNAME_A_SourceType);
	}

	/** Set In Service Date.
		@param AssetServiceDate 
		Date when Asset was put into service
	  */
	public void setAssetServiceDate (Timestamp AssetServiceDate)
	{
		set_Value (COLUMNNAME_AssetServiceDate, AssetServiceDate);
	}

	/** Get In Service Date.
		@return Date when Asset was put into service
	  */
	public Timestamp getAssetServiceDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetServiceDate);
	}

	public I_C_AcctSchema getC_AcctSchema()
    {
		return (I_C_AcctSchema)MTable.get(getCtx(), I_C_AcctSchema.Table_Name)
			.getPO(getC_AcctSchema_ID(), get_TrxName());	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID 
		Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1) 
			set_Value (COLUMNNAME_C_AcctSchema_ID, null);
		else 
			set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_Location()
    {
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_Name)
			.getPO(getC_Location_ID(), get_TrxName());	}

	/** Set Address.
		@param C_Location_ID 
		Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1) 
			set_Value (COLUMNNAME_C_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Cofinantare_Donatie.
		@param Cofinantare_Donatie Cofinantare_Donatie	  */
	public void setCofinantare_Donatie (BigDecimal Cofinantare_Donatie)
	{
		set_Value (COLUMNNAME_Cofinantare_Donatie, Cofinantare_Donatie);
	}

	/** Get Cofinantare_Donatie.
		@return Cofinantare_Donatie	  */
	public BigDecimal getCofinantare_Donatie () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cofinantare_Donatie);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cofinantare_Subventie.
		@param Cofinantare_Subventie Cofinantare_Subventie	  */
	public void setCofinantare_Subventie (BigDecimal Cofinantare_Subventie)
	{
		set_Value (COLUMNNAME_Cofinantare_Subventie, Cofinantare_Subventie);
	}

	/** Get Cofinantare_Subventie.
		@return Cofinantare_Subventie	  */
	public BigDecimal getCofinantare_Subventie () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cofinantare_Subventie);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Expense.
		@param Expense Expense	  */
	public void setExpense (BigDecimal Expense)
	{
		set_Value (COLUMNNAME_Expense, Expense);
	}

	/** Get Expense.
		@return Expense	  */
	public BigDecimal getExpense () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Expense);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FullyDepreciatedDate.
		@param FullyDepreciatedDate FullyDepreciatedDate	  */
	public void setFullyDepreciatedDate (Timestamp FullyDepreciatedDate)
	{
		set_Value (COLUMNNAME_FullyDepreciatedDate, FullyDepreciatedDate);
	}

	/** Get FullyDepreciatedDate.
		@return FullyDepreciatedDate	  */
	public Timestamp getFullyDepreciatedDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_FullyDepreciatedDate);
	}

	/** Set Cota de amortizare.
		@param GZ_Cota_Expense Cota de amortizare	  */
	public void setGZ_Cota_Expense (BigDecimal GZ_Cota_Expense)
	{
		set_Value (COLUMNNAME_GZ_Cota_Expense, GZ_Cota_Expense);
	}

	/** Get Cota de amortizare.
		@return Cota de amortizare	  */
	public BigDecimal getGZ_Cota_Expense () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GZ_Cota_Expense);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Inventory No.
		@param InventoryNo Inventory No	  */
	public void setInventoryNo (String InventoryNo)
	{
		set_Value (COLUMNNAME_InventoryNo, InventoryNo);
	}

	/** Get Inventory No.
		@return Inventory No	  */
	public String getInventoryNo () 
	{
		return (String)get_Value(COLUMNNAME_InventoryNo);
	}

	/** Set Level no.
		@param LevelNo Level no	  */
	public void setLevelNo (int LevelNo)
	{
		set_Value (COLUMNNAME_LevelNo, Integer.valueOf(LevelNo));
	}

	/** Get Level no.
		@return Level no	  */
	public int getLevelNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LevelNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Usable Life - Years.
		@param UseLifeYears 
		Years of the usable life of the asset
	  */
	public void setUseLifeYears (int UseLifeYears)
	{
		set_Value (COLUMNNAME_UseLifeYears, Integer.valueOf(UseLifeYears));
	}

	/** Get Usable Life - Years.
		@return Years of the usable life of the asset
	  */
	public int getUseLifeYears () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeYears);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}