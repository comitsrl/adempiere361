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
import org.compiere.util.KeyNamePair;

/** Generated Model for A_Asset_Split
 *  @author Adempiere (generated) 
 *  @version Release 3.5.3a - $Id$ */
public class X_A_Asset_Split extends PO implements I_A_Asset_Split, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20081221L;

    /** Standard Constructor */
    public X_A_Asset_Split (Properties ctx, int A_Asset_Split_ID, String trxName)
    {
      super (ctx, A_Asset_Split_ID, trxName);
      /** if (A_Asset_Split_ID == 0)
        {
			setA_Asset_Acct_ID (0);
			setA_Asset_ID (0);
			setA_Asset_Split_ID (0);
			setA_Depreciation_Workfile_ID (0);
			setA_QTY_Current (Env.ZERO);
// @SQL=SELECT A_QTY_Current FROM A_Depreciation_Workfile WHERE A_Depreciation_Workfile.A_Asset_ID=@A_Asset_ID@ and A_Depreciation_Workfile.PostingType='@PostingType@'
			setA_Split_Type (null);
			setA_Transfer_Balance_IS (false);
			setC_Period_ID (0);
// @Date@
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
// @Date@
			setPostingType (null);
// A
			setProcessed (false);
			setProcessing (false);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Split (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_A_Asset_Split[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set A_Amount_Split.
		@param A_Amount_Split A_Amount_Split	  */
	public void setA_Amount_Split (BigDecimal A_Amount_Split)
	{
		set_Value (COLUMNNAME_A_Amount_Split, A_Amount_Split);
	}

	/** Get A_Amount_Split.
		@return A_Amount_Split	  */
	public BigDecimal getA_Amount_Split () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Amount_Split);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set A_Asset_Acct_ID.
		@param A_Asset_Acct_ID A_Asset_Acct_ID	  */
	public void setA_Asset_Acct_ID (int A_Asset_Acct_ID)
	{
		if (A_Asset_Acct_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Acct_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_Acct_ID, Integer.valueOf(A_Asset_Acct_ID));
	}

	/** Get A_Asset_Acct_ID.
		@return A_Asset_Acct_ID	  */
	public int getA_Asset_Acct_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Acct_ID);
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

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
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

	/** Set A_Asset_ID_To.
		@param A_Asset_ID_To A_Asset_ID_To	  */
	public void setA_Asset_ID_To (int A_Asset_ID_To)
	{
		set_Value (COLUMNNAME_A_Asset_ID_To, Integer.valueOf(A_Asset_ID_To));
	}

	/** Get A_Asset_ID_To.
		@return A_Asset_ID_To	  */
	public int getA_Asset_ID_To () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID_To);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Asset_Split_ID.
		@param A_Asset_Split_ID A_Asset_Split_ID	  */
	public void setA_Asset_Split_ID (int A_Asset_Split_ID)
	{
		if (A_Asset_Split_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Split_ID is mandatory.");
		set_Value (COLUMNNAME_A_Asset_Split_ID, Integer.valueOf(A_Asset_Split_ID));
	}

	/** Get A_Asset_Split_ID.
		@return A_Asset_Split_ID	  */
	public int getA_Asset_Split_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Split_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Split_ID()));
    }

	/** Set A_Depreciation_Workfile_ID.
		@param A_Depreciation_Workfile_ID A_Depreciation_Workfile_ID	  */
	public void setA_Depreciation_Workfile_ID (int A_Depreciation_Workfile_ID)
	{
		if (A_Depreciation_Workfile_ID < 1)
			 throw new IllegalArgumentException ("A_Depreciation_Workfile_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Depreciation_Workfile_ID, Integer.valueOf(A_Depreciation_Workfile_ID));
	}

	/** Get A_Depreciation_Workfile_ID.
		@return A_Depreciation_Workfile_ID	  */
	public int getA_Depreciation_Workfile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Depreciation_Workfile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Percent_Original.
		@param A_Percent_Original A_Percent_Original	  */
	public void setA_Percent_Original (BigDecimal A_Percent_Original)
	{
		set_Value (COLUMNNAME_A_Percent_Original, A_Percent_Original);
	}

	/** Get A_Percent_Original.
		@return A_Percent_Original	  */
	public BigDecimal getA_Percent_Original () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Percent_Original);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set A_Percent_Split.
		@param A_Percent_Split A_Percent_Split	  */
	public void setA_Percent_Split (BigDecimal A_Percent_Split)
	{
		set_Value (COLUMNNAME_A_Percent_Split, A_Percent_Split);
	}

	/** Get A_Percent_Split.
		@return A_Percent_Split	  */
	public BigDecimal getA_Percent_Split () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Percent_Split);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current Qty.
		@param A_QTY_Current Current Qty	  */
	public void setA_QTY_Current (BigDecimal A_QTY_Current)
	{
		if (A_QTY_Current == null)
			throw new IllegalArgumentException ("A_QTY_Current is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_QTY_Current, A_QTY_Current);
	}

	/** Get Current Qty.
		@return Current Qty	  */
	public BigDecimal getA_QTY_Current () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_QTY_Current);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set A_QTY_Split.
		@param A_QTY_Split A_QTY_Split	  */
	public void setA_QTY_Split (BigDecimal A_QTY_Split)
	{
		set_Value (COLUMNNAME_A_QTY_Split, A_QTY_Split);
	}

	/** Get A_QTY_Split.
		@return A_QTY_Split	  */
	public BigDecimal getA_QTY_Split () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_QTY_Split);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** A_Split_Type AD_Reference_ID=1000020 */
	public static final int A_SPLIT_TYPE_AD_Reference_ID=1000020;
	/** Percentage = PER */
	public static final String A_SPLIT_TYPE_Percentage = "PER";
	/** Amount = AMT */
	public static final String A_SPLIT_TYPE_Amount = "AMT";
	/** Quantity = QTY */
	public static final String A_SPLIT_TYPE_Quantity = "QTY";
	/** Set A_Split_Type.
		@param A_Split_Type A_Split_Type	  */
	public void setA_Split_Type (String A_Split_Type)
	{

		set_Value (COLUMNNAME_A_Split_Type, A_Split_Type);
	}

	/** Get A_Split_Type.
		@return A_Split_Type	  */
	public String getA_Split_Type () 
	{
		return (String)get_Value(COLUMNNAME_A_Split_Type);
	}

	/** Set A_Transfer_Balance_IS.
		@param A_Transfer_Balance_IS A_Transfer_Balance_IS	  */
	public void setA_Transfer_Balance_IS (boolean A_Transfer_Balance_IS)
	{
		set_Value (COLUMNNAME_A_Transfer_Balance_IS, Boolean.valueOf(A_Transfer_Balance_IS));
	}

	/** Get A_Transfer_Balance_IS.
		@return A_Transfer_Balance_IS	  */
	public boolean isA_Transfer_Balance_IS () 
	{
		Object oo = get_Value(COLUMNNAME_A_Transfer_Balance_IS);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1)
			 throw new IllegalArgumentException ("C_Period_ID is mandatory.");
		set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		if (DateAcct == null)
			throw new IllegalArgumentException ("DateAcct is mandatory.");
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set PostingType.
		@param PostingType 
		The type of posted amount for the transaction
	  */
	public void setPostingType (String PostingType)
	{
		if (PostingType == null)
			throw new IllegalArgumentException ("PostingType is mandatory.");
		set_ValueNoCheck (COLUMNNAME_PostingType, PostingType);
	}

	/** Get PostingType.
		@return The type of posted amount for the transaction
	  */
	public String getPostingType () 
	{
		return (String)get_Value(COLUMNNAME_PostingType);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}