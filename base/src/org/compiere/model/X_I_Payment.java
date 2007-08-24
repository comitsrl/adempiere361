/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.util.*;
import java.sql.*;
import java.math.*;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import org.compiere.util.*;

/** Generated Model for I_Payment
 *  @author Adempiere (generated) 
 *  @version Release 3.3.0 - $Id$ */
public class X_I_Payment extends PO implements I_I_Payment, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_I_Payment (Properties ctx, int I_Payment_ID, String trxName)
    {
      super (ctx, I_Payment_ID, trxName);
      /** if (I_Payment_ID == 0)        {			setI_IsImported (false);
			setI_Payment_ID (0);
} */
    }

    /** Load Constructor */
    public X_I_Payment (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_I_Payment[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Account City.
		@param A_City 
		City or the Credit Card or Account Holder
	  */
	public void setA_City (String A_City)
	{
		if (A_City != null && A_City.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			A_City = A_City.substring(0, 59);
		}
		set_Value (COLUMNNAME_A_City, A_City);
	}

	/** Get Account City.
		@return City or the Credit Card or Account Holder
	  */
	public String getA_City () 
	{
		return (String)get_Value(COLUMNNAME_A_City);
	}

	/** Set Account Country.
		@param A_Country 
		Country
	  */
	public void setA_Country (String A_Country)
	{
		if (A_Country != null && A_Country.length() > 40)
		{
			log.warning("Length > 40 - truncated");
			A_Country = A_Country.substring(0, 39);
		}
		set_Value (COLUMNNAME_A_Country, A_Country);
	}

	/** Get Account Country.
		@return Country
	  */
	public String getA_Country () 
	{
		return (String)get_Value(COLUMNNAME_A_Country);
	}

	/** Set Account EMail.
		@param A_EMail 
		Email Address
	  */
	public void setA_EMail (String A_EMail)
	{
		if (A_EMail != null && A_EMail.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			A_EMail = A_EMail.substring(0, 59);
		}
		set_Value (COLUMNNAME_A_EMail, A_EMail);
	}

	/** Get Account EMail.
		@return Email Address
	  */
	public String getA_EMail () 
	{
		return (String)get_Value(COLUMNNAME_A_EMail);
	}

	/** Set Driver License.
		@param A_Ident_DL 
		Payment Identification - Driver License
	  */
	public void setA_Ident_DL (String A_Ident_DL)
	{
		if (A_Ident_DL != null && A_Ident_DL.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			A_Ident_DL = A_Ident_DL.substring(0, 19);
		}
		set_Value (COLUMNNAME_A_Ident_DL, A_Ident_DL);
	}

	/** Get Driver License.
		@return Payment Identification - Driver License
	  */
	public String getA_Ident_DL () 
	{
		return (String)get_Value(COLUMNNAME_A_Ident_DL);
	}

	/** Set Social Security No.
		@param A_Ident_SSN 
		Payment Identification - Social Security No
	  */
	public void setA_Ident_SSN (String A_Ident_SSN)
	{
		if (A_Ident_SSN != null && A_Ident_SSN.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			A_Ident_SSN = A_Ident_SSN.substring(0, 19);
		}
		set_Value (COLUMNNAME_A_Ident_SSN, A_Ident_SSN);
	}

	/** Get Social Security No.
		@return Payment Identification - Social Security No
	  */
	public String getA_Ident_SSN () 
	{
		return (String)get_Value(COLUMNNAME_A_Ident_SSN);
	}

	/** Set Account Name.
		@param A_Name 
		Name on Credit Card or Account holder
	  */
	public void setA_Name (String A_Name)
	{
		if (A_Name != null && A_Name.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			A_Name = A_Name.substring(0, 59);
		}
		set_Value (COLUMNNAME_A_Name, A_Name);
	}

	/** Get Account Name.
		@return Name on Credit Card or Account holder
	  */
	public String getA_Name () 
	{
		return (String)get_Value(COLUMNNAME_A_Name);
	}

	/** Set Account State.
		@param A_State 
		State of the Credit Card or Account holder
	  */
	public void setA_State (String A_State)
	{
		if (A_State != null && A_State.length() > 40)
		{
			log.warning("Length > 40 - truncated");
			A_State = A_State.substring(0, 39);
		}
		set_Value (COLUMNNAME_A_State, A_State);
	}

	/** Get Account State.
		@return State of the Credit Card or Account holder
	  */
	public String getA_State () 
	{
		return (String)get_Value(COLUMNNAME_A_State);
	}

	/** Set Account Street.
		@param A_Street 
		Street address of the Credit Card or Account holder
	  */
	public void setA_Street (String A_Street)
	{
		if (A_Street != null && A_Street.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			A_Street = A_Street.substring(0, 59);
		}
		set_Value (COLUMNNAME_A_Street, A_Street);
	}

	/** Get Account Street.
		@return Street address of the Credit Card or Account holder
	  */
	public String getA_Street () 
	{
		return (String)get_Value(COLUMNNAME_A_Street);
	}

	/** Set Account Zip/Postal.
		@param A_Zip 
		Zip Code of the Credit Card or Account Holder
	  */
	public void setA_Zip (String A_Zip)
	{
		if (A_Zip != null && A_Zip.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			A_Zip = A_Zip.substring(0, 19);
		}
		set_Value (COLUMNNAME_A_Zip, A_Zip);
	}

	/** Get Account Zip/Postal.
		@return Zip Code of the Credit Card or Account Holder
	  */
	public String getA_Zip () 
	{
		return (String)get_Value(COLUMNNAME_A_Zip);
	}

	/** Set Account No.
		@param AccountNo 
		Account Number
	  */
	public void setAccountNo (String AccountNo)
	{
		if (AccountNo != null && AccountNo.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			AccountNo = AccountNo.substring(0, 19);
		}
		set_Value (COLUMNNAME_AccountNo, AccountNo);
	}

	/** Get Account No.
		@return Account Number
	  */
	public String getAccountNo () 
	{
		return (String)get_Value(COLUMNNAME_AccountNo);
	}

	/** Set Business Partner Key.
		@param BPartnerValue 
		Key of the Business Partner
	  */
	public void setBPartnerValue (String BPartnerValue)
	{
		if (BPartnerValue != null && BPartnerValue.length() > 40)
		{
			log.warning("Length > 40 - truncated");
			BPartnerValue = BPartnerValue.substring(0, 39);
		}
		set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
	}

	/** Get Business Partner Key.
		@return Key of the Business Partner
	  */
	public String getBPartnerValue () 
	{
		return (String)get_Value(COLUMNNAME_BPartnerValue);
	}

	/** Set Bank Account No.
		@param BankAccountNo 
		Bank Account Number
	  */
	public void setBankAccountNo (String BankAccountNo)
	{
		if (BankAccountNo != null && BankAccountNo.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			BankAccountNo = BankAccountNo.substring(0, 19);
		}
		set_Value (COLUMNNAME_BankAccountNo, BankAccountNo);
	}

	/** Get Bank Account No.
		@return Bank Account Number
	  */
	public String getBankAccountNo () 
	{
		return (String)get_Value(COLUMNNAME_BankAccountNo);
	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID <= 0) 		set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
		set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_BankAccount getI_C_BankAccount() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_BankAccount.Table_Name);
        I_C_BankAccount result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_BankAccount)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_BankAccount_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Bank Account.
		@param C_BankAccount_ID 
		Account at the Bank
	  */
	public void setC_BankAccount_ID (int C_BankAccount_ID)
	{
		if (C_BankAccount_ID <= 0) 		set_Value (COLUMNNAME_C_BankAccount_ID, null);
 else 
		set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
	}

	/** Get Bank Account.
		@return Account at the Bank
	  */
	public int getC_BankAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Charge getI_C_Charge() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_Charge.Table_Name);
        I_C_Charge result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Charge)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Charge_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Charge.
		@param C_Charge_ID 
		Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID)
	{
		if (C_Charge_ID <= 0) 		set_Value (COLUMNNAME_C_Charge_ID, null);
 else 
		set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
	}

	/** Get Charge.
		@return Additional document charges
	  */
	public int getC_Charge_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Currency getI_C_Currency() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_Currency.Table_Name);
        I_C_Currency result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Currency)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Currency_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID <= 0) 		set_Value (COLUMNNAME_C_Currency_ID, null);
 else 
		set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_DocType getI_C_DocType() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_DocType.Table_Name);
        I_C_DocType result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_DocType)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_DocType_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID <= 0) 		set_Value (COLUMNNAME_C_DocType_ID, null);
 else 
		set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Invoice.
		@param C_Invoice_ID 
		Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID <= 0) 		set_Value (COLUMNNAME_C_Invoice_ID, null);
 else 
		set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Payment.
		@param C_Payment_ID 
		Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID <= 0) 		set_Value (COLUMNNAME_C_Payment_ID, null);
 else 
		set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Charge amount.
		@param ChargeAmt 
		Charge Amount
	  */
	public void setChargeAmt (BigDecimal ChargeAmt)
	{
		set_Value (COLUMNNAME_ChargeAmt, ChargeAmt);
	}

	/** Get Charge amount.
		@return Charge Amount
	  */
	public BigDecimal getChargeAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ChargeAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Charge Name.
		@param ChargeName 
		Name of the Charge
	  */
	public void setChargeName (String ChargeName)
	{
		if (ChargeName != null && ChargeName.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			ChargeName = ChargeName.substring(0, 59);
		}
		set_Value (COLUMNNAME_ChargeName, ChargeName);
	}

	/** Get Charge Name.
		@return Name of the Charge
	  */
	public String getChargeName () 
	{
		return (String)get_Value(COLUMNNAME_ChargeName);
	}

	/** Set Check No.
		@param CheckNo 
		Check Number
	  */
	public void setCheckNo (String CheckNo)
	{
		if (CheckNo != null && CheckNo.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			CheckNo = CheckNo.substring(0, 19);
		}
		set_Value (COLUMNNAME_CheckNo, CheckNo);
	}

	/** Get Check No.
		@return Check Number
	  */
	public String getCheckNo () 
	{
		return (String)get_Value(COLUMNNAME_CheckNo);
	}

	/** Set Exp. Month.
		@param CreditCardExpMM 
		Expiry Month
	  */
	public void setCreditCardExpMM (int CreditCardExpMM)
	{
		set_Value (COLUMNNAME_CreditCardExpMM, Integer.valueOf(CreditCardExpMM));
	}

	/** Get Exp. Month.
		@return Expiry Month
	  */
	public int getCreditCardExpMM () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpMM);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Exp. Year.
		@param CreditCardExpYY 
		Expiry Year
	  */
	public void setCreditCardExpYY (int CreditCardExpYY)
	{
		set_Value (COLUMNNAME_CreditCardExpYY, Integer.valueOf(CreditCardExpYY));
	}

	/** Get Exp. Year.
		@return Expiry Year
	  */
	public int getCreditCardExpYY () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CreditCardExpYY);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Number.
		@param CreditCardNumber 
		Credit Card Number 
	  */
	public void setCreditCardNumber (String CreditCardNumber)
	{
		if (CreditCardNumber != null && CreditCardNumber.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			CreditCardNumber = CreditCardNumber.substring(0, 19);
		}
		set_Value (COLUMNNAME_CreditCardNumber, CreditCardNumber);
	}

	/** Get Number.
		@return Credit Card Number 
	  */
	public String getCreditCardNumber () 
	{
		return (String)get_Value(COLUMNNAME_CreditCardNumber);
	}

/** CreditCardType AD_Reference_ID=149 */
public static final int CREDITCARDTYPE_AD_Reference_ID=149;/** Amex = A */
public static final String CREDITCARDTYPE_Amex = "A";/** ATM = C */
public static final String CREDITCARDTYPE_ATM = "C";/** Diners = D */
public static final String CREDITCARDTYPE_Diners = "D";/** MasterCard = M */
public static final String CREDITCARDTYPE_MasterCard = "M";/** Discover = N */
public static final String CREDITCARDTYPE_Discover = "N";/** Purchase Card = P */
public static final String CREDITCARDTYPE_PurchaseCard = "P";/** Visa = V */
public static final String CREDITCARDTYPE_Visa = "V";
	/** Set Credit Card.
		@param CreditCardType 
		Credit Card (Visa, MC, AmEx)
	  */
	public void setCreditCardType (String CreditCardType)
	{
if (CreditCardType == null || CreditCardType.equals("A") || CreditCardType.equals("C") || CreditCardType.equals("D") || CreditCardType.equals("M") || CreditCardType.equals("N") || CreditCardType.equals("P") || CreditCardType.equals("V")); else throw new IllegalArgumentException ("CreditCardType Invalid value - " + CreditCardType + " - Reference_ID=149 - A - C - D - M - N - P - V");		if (CreditCardType != null && CreditCardType.length() > 1)
		{
			log.warning("Length > 1 - truncated");
			CreditCardType = CreditCardType.substring(0, 0);
		}
		set_Value (COLUMNNAME_CreditCardType, CreditCardType);
	}

	/** Get Credit Card.
		@return Credit Card (Visa, MC, AmEx)
	  */
	public String getCreditCardType () 
	{
		return (String)get_Value(COLUMNNAME_CreditCardType);
	}

	/** Set Verification Code.
		@param CreditCardVV 
		Credit Card Verification code on credit card
	  */
	public void setCreditCardVV (String CreditCardVV)
	{
		if (CreditCardVV != null && CreditCardVV.length() > 4)
		{
			log.warning("Length > 4 - truncated");
			CreditCardVV = CreditCardVV.substring(0, 3);
		}
		set_Value (COLUMNNAME_CreditCardVV, CreditCardVV);
	}

	/** Get Verification Code.
		@return Credit Card Verification code on credit card
	  */
	public String getCreditCardVV () 
	{
		return (String)get_Value(COLUMNNAME_CreditCardVV);
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

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
	}

	/** Set Discount Amount.
		@param DiscountAmt 
		Calculated amount of discount
	  */
	public void setDiscountAmt (BigDecimal DiscountAmt)
	{
		set_Value (COLUMNNAME_DiscountAmt, DiscountAmt);
	}

	/** Get Discount Amount.
		@return Calculated amount of discount
	  */
	public BigDecimal getDiscountAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DiscountAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Document Type Name.
		@param DocTypeName 
		Name of the Document Type
	  */
	public void setDocTypeName (String DocTypeName)
	{
		if (DocTypeName != null && DocTypeName.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			DocTypeName = DocTypeName.substring(0, 59);
		}
		set_Value (COLUMNNAME_DocTypeName, DocTypeName);
	}

	/** Get Document Type Name.
		@return Name of the Document Type
	  */
	public String getDocTypeName () 
	{
		return (String)get_Value(COLUMNNAME_DocTypeName);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		if (DocumentNo != null && DocumentNo.length() > 30)
		{
			log.warning("Length > 30 - truncated");
			DocumentNo = DocumentNo.substring(0, 29);
		}
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set ISO Currency Code.
		@param ISO_Code 
		Three letter ISO 4217 Code of the Currency
	  */
	public void setISO_Code (String ISO_Code)
	{
		if (ISO_Code != null && ISO_Code.length() > 3)
		{
			log.warning("Length > 3 - truncated");
			ISO_Code = ISO_Code.substring(0, 2);
		}
		set_Value (COLUMNNAME_ISO_Code, ISO_Code);
	}

	/** Get ISO Currency Code.
		@return Three letter ISO 4217 Code of the Currency
	  */
	public String getISO_Code () 
	{
		return (String)get_Value(COLUMNNAME_ISO_Code);
	}

	/** Set Import Error Message.
		@param I_ErrorMsg 
		Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		if (I_ErrorMsg != null && I_ErrorMsg.length() > 2000)
		{
			log.warning("Length > 2000 - truncated");
			I_ErrorMsg = I_ErrorMsg.substring(0, 1999);
		}
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg () 
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set Imported.
		@param I_IsImported 
		Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported () 
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Import Payment.
		@param I_Payment_ID 
		Import Payment
	  */
	public void setI_Payment_ID (int I_Payment_ID)
	{
		if (I_Payment_ID < 1)
			 throw new IllegalArgumentException ("I_Payment_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_I_Payment_ID, Integer.valueOf(I_Payment_ID));
	}

	/** Get Import Payment.
		@return Import Payment
	  */
	public int getI_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Invoice Document No.
		@param InvoiceDocumentNo 
		Document Number of the Invoice
	  */
	public void setInvoiceDocumentNo (String InvoiceDocumentNo)
	{
		if (InvoiceDocumentNo != null && InvoiceDocumentNo.length() > 30)
		{
			log.warning("Length > 30 - truncated");
			InvoiceDocumentNo = InvoiceDocumentNo.substring(0, 29);
		}
		set_Value (COLUMNNAME_InvoiceDocumentNo, InvoiceDocumentNo);
	}

	/** Get Invoice Document No.
		@return Document Number of the Invoice
	  */
	public String getInvoiceDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_InvoiceDocumentNo);
	}

	/** Set Approved.
		@param IsApproved 
		Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved () 
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Delayed Capture.
		@param IsDelayedCapture 
		Charge after Shipment
	  */
	public void setIsDelayedCapture (boolean IsDelayedCapture)
	{
		set_Value (COLUMNNAME_IsDelayedCapture, Boolean.valueOf(IsDelayedCapture));
	}

	/** Get Delayed Capture.
		@return Charge after Shipment
	  */
	public boolean isDelayedCapture () 
	{
		Object oo = get_Value(COLUMNNAME_IsDelayedCapture);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Over/Under Payment.
		@param IsOverUnderPayment 
		Over-Payment (unallocated) or Under-Payment (partial payment)
	  */
	public void setIsOverUnderPayment (boolean IsOverUnderPayment)
	{
		set_Value (COLUMNNAME_IsOverUnderPayment, Boolean.valueOf(IsOverUnderPayment));
	}

	/** Get Over/Under Payment.
		@return Over-Payment (unallocated) or Under-Payment (partial payment)
	  */
	public boolean isOverUnderPayment () 
	{
		Object oo = get_Value(COLUMNNAME_IsOverUnderPayment);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Receipt.
		@param IsReceipt 
		This is a sales transaction (receipt)
	  */
	public void setIsReceipt (boolean IsReceipt)
	{
		set_Value (COLUMNNAME_IsReceipt, Boolean.valueOf(IsReceipt));
	}

	/** Get Receipt.
		@return This is a sales transaction (receipt)
	  */
	public boolean isReceipt () 
	{
		Object oo = get_Value(COLUMNNAME_IsReceipt);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Self-Service.
		@param IsSelfService 
		This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public void setIsSelfService (boolean IsSelfService)
	{
		set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
	}

	/** Get Self-Service.
		@return This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService () 
	{
		Object oo = get_Value(COLUMNNAME_IsSelfService);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Micr.
		@param Micr 
		Combination of routing no, account and check no
	  */
	public void setMicr (String Micr)
	{
		if (Micr != null && Micr.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			Micr = Micr.substring(0, 19);
		}
		set_Value (COLUMNNAME_Micr, Micr);
	}

	/** Get Micr.
		@return Combination of routing no, account and check no
	  */
	public String getMicr () 
	{
		return (String)get_Value(COLUMNNAME_Micr);
	}

	/** Set Original Transaction ID.
		@param Orig_TrxID 
		Original Transaction ID
	  */
	public void setOrig_TrxID (String Orig_TrxID)
	{
		if (Orig_TrxID != null && Orig_TrxID.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			Orig_TrxID = Orig_TrxID.substring(0, 19);
		}
		set_Value (COLUMNNAME_Orig_TrxID, Orig_TrxID);
	}

	/** Get Original Transaction ID.
		@return Original Transaction ID
	  */
	public String getOrig_TrxID () 
	{
		return (String)get_Value(COLUMNNAME_Orig_TrxID);
	}

	/** Set Over/Under Payment.
		@param OverUnderAmt 
		Over-Payment (unallocated) or Under-Payment (partial payment) Amount
	  */
	public void setOverUnderAmt (BigDecimal OverUnderAmt)
	{
		set_Value (COLUMNNAME_OverUnderAmt, OverUnderAmt);
	}

	/** Get Over/Under Payment.
		@return Over-Payment (unallocated) or Under-Payment (partial payment) Amount
	  */
	public BigDecimal getOverUnderAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverUnderAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PO Number.
		@param PONum 
		Purchase Order Number
	  */
	public void setPONum (String PONum)
	{
		if (PONum != null && PONum.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			PONum = PONum.substring(0, 59);
		}
		set_Value (COLUMNNAME_PONum, PONum);
	}

	/** Get PO Number.
		@return Purchase Order Number
	  */
	public String getPONum () 
	{
		return (String)get_Value(COLUMNNAME_PONum);
	}

	/** Set Payment amount.
		@param PayAmt 
		Amount being paid
	  */
	public void setPayAmt (BigDecimal PayAmt)
	{
		set_Value (COLUMNNAME_PayAmt, PayAmt);
	}

	/** Get Payment amount.
		@return Amount being paid
	  */
	public BigDecimal getPayAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PayAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Authorization Code.
		@param R_AuthCode 
		Authorization Code returned
	  */
	public void setR_AuthCode (String R_AuthCode)
	{
		if (R_AuthCode != null && R_AuthCode.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			R_AuthCode = R_AuthCode.substring(0, 19);
		}
		set_Value (COLUMNNAME_R_AuthCode, R_AuthCode);
	}

	/** Get Authorization Code.
		@return Authorization Code returned
	  */
	public String getR_AuthCode () 
	{
		return (String)get_Value(COLUMNNAME_R_AuthCode);
	}

	/** Set Info.
		@param R_Info 
		Response info
	  */
	public void setR_Info (String R_Info)
	{
		if (R_Info != null && R_Info.length() > 2000)
		{
			log.warning("Length > 2000 - truncated");
			R_Info = R_Info.substring(0, 1999);
		}
		set_Value (COLUMNNAME_R_Info, R_Info);
	}

	/** Get Info.
		@return Response info
	  */
	public String getR_Info () 
	{
		return (String)get_Value(COLUMNNAME_R_Info);
	}

	/** Set Reference.
		@param R_PnRef 
		Payment reference
	  */
	public void setR_PnRef (String R_PnRef)
	{
		if (R_PnRef != null && R_PnRef.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			R_PnRef = R_PnRef.substring(0, 19);
		}
		set_Value (COLUMNNAME_R_PnRef, R_PnRef);
	}

	/** Get Reference.
		@return Payment reference
	  */
	public String getR_PnRef () 
	{
		return (String)get_Value(COLUMNNAME_R_PnRef);
	}

	/** Set Response Message.
		@param R_RespMsg 
		Response message
	  */
	public void setR_RespMsg (String R_RespMsg)
	{
		if (R_RespMsg != null && R_RespMsg.length() > 60)
		{
			log.warning("Length > 60 - truncated");
			R_RespMsg = R_RespMsg.substring(0, 59);
		}
		set_Value (COLUMNNAME_R_RespMsg, R_RespMsg);
	}

	/** Get Response Message.
		@return Response message
	  */
	public String getR_RespMsg () 
	{
		return (String)get_Value(COLUMNNAME_R_RespMsg);
	}

	/** Set Result.
		@param R_Result 
		Result of transmission
	  */
	public void setR_Result (String R_Result)
	{
		if (R_Result != null && R_Result.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			R_Result = R_Result.substring(0, 19);
		}
		set_Value (COLUMNNAME_R_Result, R_Result);
	}

	/** Get Result.
		@return Result of transmission
	  */
	public String getR_Result () 
	{
		return (String)get_Value(COLUMNNAME_R_Result);
	}

	/** Set Routing No.
		@param RoutingNo 
		Bank Routing Number
	  */
	public void setRoutingNo (String RoutingNo)
	{
		if (RoutingNo != null && RoutingNo.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			RoutingNo = RoutingNo.substring(0, 19);
		}
		set_Value (COLUMNNAME_RoutingNo, RoutingNo);
	}

	/** Get Routing No.
		@return Bank Routing Number
	  */
	public String getRoutingNo () 
	{
		return (String)get_Value(COLUMNNAME_RoutingNo);
	}

	/** Set Swipe.
		@param Swipe 
		Track 1 and 2 of the Credit Card
	  */
	public void setSwipe (String Swipe)
	{
		if (Swipe != null && Swipe.length() > 80)
		{
			log.warning("Length > 80 - truncated");
			Swipe = Swipe.substring(0, 79);
		}
		set_Value (COLUMNNAME_Swipe, Swipe);
	}

	/** Get Swipe.
		@return Track 1 and 2 of the Credit Card
	  */
	public String getSwipe () 
	{
		return (String)get_Value(COLUMNNAME_Swipe);
	}

	/** Set Tax Amount.
		@param TaxAmt 
		Tax Amount for a document
	  */
	public void setTaxAmt (BigDecimal TaxAmt)
	{
		set_Value (COLUMNNAME_TaxAmt, TaxAmt);
	}

	/** Get Tax Amount.
		@return Tax Amount for a document
	  */
	public BigDecimal getTaxAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TaxAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

/** TenderType AD_Reference_ID=214 */
public static final int TENDERTYPE_AD_Reference_ID=214;/** Direct Deposit = A */
public static final String TENDERTYPE_DirectDeposit = "A";/** Credit Card = C */
public static final String TENDERTYPE_CreditCard = "C";/** Direct Debit = D */
public static final String TENDERTYPE_DirectDebit = "D";/** Check = K */
public static final String TENDERTYPE_Check = "K";
	/** Set Tender type.
		@param TenderType 
		Method of Payment
	  */
	public void setTenderType (String TenderType)
	{
if (TenderType == null || TenderType.equals("A") || TenderType.equals("C") || TenderType.equals("D") || TenderType.equals("K")); else throw new IllegalArgumentException ("TenderType Invalid value - " + TenderType + " - Reference_ID=214 - A - C - D - K");		if (TenderType != null && TenderType.length() > 1)
		{
			log.warning("Length > 1 - truncated");
			TenderType = TenderType.substring(0, 0);
		}
		set_Value (COLUMNNAME_TenderType, TenderType);
	}

	/** Get Tender type.
		@return Method of Payment
	  */
	public String getTenderType () 
	{
		return (String)get_Value(COLUMNNAME_TenderType);
	}

/** TrxType AD_Reference_ID=215 */
public static final int TRXTYPE_AD_Reference_ID=215;/** Authorization = A */
public static final String TRXTYPE_Authorization = "A";/** Credit (Payment) = C */
public static final String TRXTYPE_CreditPayment = "C";/** Delayed Capture = D */
public static final String TRXTYPE_DelayedCapture = "D";/** Voice Authorization = F */
public static final String TRXTYPE_VoiceAuthorization = "F";/** Sales = S */
public static final String TRXTYPE_Sales = "S";/** Void = V */
public static final String TRXTYPE_Void = "V";
	/** Set Transaction Type.
		@param TrxType 
		Type of credit card transaction
	  */
	public void setTrxType (String TrxType)
	{
if (TrxType == null || TrxType.equals("A") || TrxType.equals("C") || TrxType.equals("D") || TrxType.equals("F") || TrxType.equals("S") || TrxType.equals("V")); else throw new IllegalArgumentException ("TrxType Invalid value - " + TrxType + " - Reference_ID=215 - A - C - D - F - S - V");		if (TrxType != null && TrxType.length() > 1)
		{
			log.warning("Length > 1 - truncated");
			TrxType = TrxType.substring(0, 0);
		}
		set_Value (COLUMNNAME_TrxType, TrxType);
	}

	/** Get Transaction Type.
		@return Type of credit card transaction
	  */
	public String getTrxType () 
	{
		return (String)get_Value(COLUMNNAME_TrxType);
	}

	/** Set Voice authorization code.
		@param VoiceAuthCode 
		Voice Authorization Code from credit card company
	  */
	public void setVoiceAuthCode (String VoiceAuthCode)
	{
		if (VoiceAuthCode != null && VoiceAuthCode.length() > 20)
		{
			log.warning("Length > 20 - truncated");
			VoiceAuthCode = VoiceAuthCode.substring(0, 19);
		}
		set_Value (COLUMNNAME_VoiceAuthCode, VoiceAuthCode);
	}

	/** Get Voice authorization code.
		@return Voice Authorization Code from credit card company
	  */
	public String getVoiceAuthCode () 
	{
		return (String)get_Value(COLUMNNAME_VoiceAuthCode);
	}

	/** Set Write-off Amount.
		@param WriteOffAmt 
		Amount to write-off
	  */
	public void setWriteOffAmt (BigDecimal WriteOffAmt)
	{
		set_Value (COLUMNNAME_WriteOffAmt, WriteOffAmt);
	}

	/** Get Write-off Amount.
		@return Amount to write-off
	  */
	public BigDecimal getWriteOffAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_WriteOffAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}