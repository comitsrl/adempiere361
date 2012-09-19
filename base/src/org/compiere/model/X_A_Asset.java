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

/** Generated Model for A_Asset
 *  @author Adempiere (generated) 
 *  @version Release 3.5.3a - $Id$ */
public class X_A_Asset extends PO implements I_A_Asset, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20081221L;

    /** Standard Constructor */
    public X_A_Asset (Properties ctx, int A_Asset_ID, String trxName)
    {
      super (ctx, A_Asset_ID, trxName);
      /** if (A_Asset_ID == 0)
        {
			setA_Asset_Action (null);
// 'MD'
			setA_Asset_Group_ID (0);
			setA_Asset_ID (0);
			setA_Asset_Status (null);
// 'NW'
			setA_Asset_Type (null);
// MFX
			setA_Asset_Type_ID (0);
// 1
			setGZ_Index (0);
// 0
			setIsDepreciated (false);
			setIsDisposed (false);
			setIsFullyDepreciated (false);
// N
			setIsInPosession (false);
			setIsOwned (false);
			setM_AttributeSetInstance_ID (0);
			setName (null);
			setProcessed (false);
// 'N'
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_A_Asset (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_A_Asset[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_User getAD_User()
    {
		return (I_AD_User)MTable.get(getCtx(), I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < ((accessLevel.intValue() & 4) > 0 ? 0 : 1)) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** A_Asset_Action AD_Reference_ID=1000046 */
	public static final int A_ASSET_ACTION_AD_Reference_ID=1000046;
	/** Inbound = IB */
	public static final String A_ASSET_ACTION_Inbound = "IB";
	/** Outbound = OB */
	public static final String A_ASSET_ACTION_Outbound = "OB";
	/** Transfer = TR */
	public static final String A_ASSET_ACTION_Transfer = "TR";
	/** Modify = MD */
	public static final String A_ASSET_ACTION_Modify = "MD";
	/** Reevaluate = RE */
	public static final String A_ASSET_ACTION_Reevaluate = "RE";
	/** Dispose = DI */
	public static final String A_ASSET_ACTION_Dispose = "DI";
	/** Retire = RT */
	public static final String A_ASSET_ACTION_Retire = "RT";
	/** Set Asset Action.
		@param A_Asset_Action Asset Action	  */
	public void setA_Asset_Action (String A_Asset_Action)
	{
		if (A_Asset_Action == null) throw new IllegalArgumentException ("A_Asset_Action is mandatory");
		set_Value (COLUMNNAME_A_Asset_Action, A_Asset_Action);
	}

	/** Get Asset Action.
		@return Asset Action	  */
	public String getA_Asset_Action () 
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Action);
	}

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

	/** Set A_Asset_CreateDate.
		@param A_Asset_CreateDate A_Asset_CreateDate	  */
	public void setA_Asset_CreateDate (Timestamp A_Asset_CreateDate)
	{
		set_ValueNoCheck (COLUMNNAME_A_Asset_CreateDate, A_Asset_CreateDate);
	}

	/** Get A_Asset_CreateDate.
		@return A_Asset_CreateDate	  */
	public Timestamp getA_Asset_CreateDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_A_Asset_CreateDate);
	}

	/** Set Asset Group.
		@param A_Asset_Group_ID 
		Group of Assets
	  */
	public void setA_Asset_Group_ID (int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Group_ID is mandatory.");
		set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
	}

	/** Get Asset Group.
		@return Group of Assets
	  */
	public int getA_Asset_Group_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set A_Asset_RevalDate.
		@param A_Asset_RevalDate A_Asset_RevalDate	  */
	public void setA_Asset_RevalDate (Timestamp A_Asset_RevalDate)
	{
		set_Value (COLUMNNAME_A_Asset_RevalDate, A_Asset_RevalDate);
	}

	/** Get A_Asset_RevalDate.
		@return A_Asset_RevalDate	  */
	public Timestamp getA_Asset_RevalDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_A_Asset_RevalDate);
	}

	/** A_Asset_Status AD_Reference_ID=1000045 */
	public static final int A_ASSET_STATUS_AD_Reference_ID=1000045;
	/** New = NW */
	public static final String A_ASSET_STATUS_New = "NW";
	/** Activated = AC */
	public static final String A_ASSET_STATUS_Activated = "AC";
	/** Depreciated = DP */
	public static final String A_ASSET_STATUS_Depreciated = "DP";
	/** Disposed = DI */
	public static final String A_ASSET_STATUS_Disposed = "DI";
	/** Retired = RE */
	public static final String A_ASSET_STATUS_Retired = "RE";
	/** Sold = SO */
	public static final String A_ASSET_STATUS_Sold = "SO";
	/** Preservation = PR */
	public static final String A_ASSET_STATUS_Preservation = "PR";
	/** Set Asset Status.
		@param A_Asset_Status Asset Status	  */
	public void setA_Asset_Status (String A_Asset_Status)
	{
		if (A_Asset_Status == null) throw new IllegalArgumentException ("A_Asset_Status is mandatory");
		set_Value (COLUMNNAME_A_Asset_Status, A_Asset_Status);
	}

	/** Get Asset Status.
		@return Asset Status	  */
	public String getA_Asset_Status () 
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Status);
	}

	/** Set Asset Type.
		@param A_Asset_Type Asset Type	  */
	public void setA_Asset_Type (String A_Asset_Type)
	{
		if (A_Asset_Type == null)
			throw new IllegalArgumentException ("A_Asset_Type is mandatory.");
		set_Value (COLUMNNAME_A_Asset_Type, A_Asset_Type);
	}

	/** Get Asset Type.
		@return Asset Type	  */
	public String getA_Asset_Type () 
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Type);
	}

	/** Set Asset Type.
		@param A_Asset_Type_ID Asset Type	  */
	public void setA_Asset_Type_ID (int A_Asset_Type_ID)
	{
		if (A_Asset_Type_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Type_ID is mandatory.");
		set_Value (COLUMNNAME_A_Asset_Type_ID, Integer.valueOf(A_Asset_Type_ID));
	}

	/** Get Asset Type.
		@return Asset Type	  */
	public int getA_Asset_Type_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Type_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Parent_Asset_ID.
		@param A_Parent_Asset_ID A_Parent_Asset_ID	  */
	public void setA_Parent_Asset_ID (int A_Parent_Asset_ID)
	{
		if (A_Parent_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Parent_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Parent_Asset_ID, Integer.valueOf(A_Parent_Asset_ID));
	}

	/** Get A_Parent_Asset_ID.
		@return A_Parent_Asset_ID	  */
	public int getA_Parent_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Parent_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Current Qty.
		@param A_QTY_Current Current Qty	  */
	public void setA_QTY_Current (BigDecimal A_QTY_Current)
	{
		set_Value (COLUMNNAME_A_QTY_Current, A_QTY_Current);
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

	/** Set A_QTY_Original.
		@param A_QTY_Original A_QTY_Original	  */
	public void setA_QTY_Original (BigDecimal A_QTY_Original)
	{
		set_Value (COLUMNNAME_A_QTY_Original, A_QTY_Original);
	}

	/** Get A_QTY_Original.
		@return A_QTY_Original	  */
	public BigDecimal getA_QTY_Original () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_QTY_Original);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Activation Date.
		@param AssetActivationDate Activation Date	  */
	public void setAssetActivationDate (Timestamp AssetActivationDate)
	{
		set_Value (COLUMNNAME_AssetActivationDate, AssetActivationDate);
	}

	/** Get Activation Date.
		@return Activation Date	  */
	public Timestamp getAssetActivationDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetActivationDate);
	}

	/** Set Asset Depreciation Date.
		@param AssetDepreciationDate 
		Date of last depreciation
	  */
	public void setAssetDepreciationDate (Timestamp AssetDepreciationDate)
	{
		set_Value (COLUMNNAME_AssetDepreciationDate, AssetDepreciationDate);
	}

	/** Get Asset Depreciation Date.
		@return Date of last depreciation
	  */
	public Timestamp getAssetDepreciationDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetDepreciationDate);
	}

	/** Set Asset Disposal Date.
		@param AssetDisposalDate 
		Date when the asset is/was disposed
	  */
	public void setAssetDisposalDate (Timestamp AssetDisposalDate)
	{
		set_Value (COLUMNNAME_AssetDisposalDate, AssetDisposalDate);
	}

	/** Get Asset Disposal Date.
		@return Date when the asset is/was disposed
	  */
	public Timestamp getAssetDisposalDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetDisposalDate);
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

	public I_C_Activity getC_Activity()
    {
		return (I_C_Activity)MTable.get(getCtx(), I_C_Activity.Table_Name)
			.getPO(getC_Activity_ID(), get_TrxName());	}

	/** Set Activity.
		@param C_Activity_ID 
		Business Activity
	  */
	public void setC_Activity_ID (int C_Activity_ID)
	{
		if (C_Activity_ID < 1) 
			set_Value (COLUMNNAME_C_Activity_ID, null);
		else 
			set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
	}

	/** Get Activity.
		@return Business Activity
	  */
	public int getC_Activity_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set BPartner (Agent).
		@param C_BPartnerSR_ID 
		Business Partner (Agent or Sales Rep)
	  */
	public void setC_BPartnerSR_ID (int C_BPartnerSR_ID)
	{
		if (C_BPartnerSR_ID < 1) 
			set_Value (COLUMNNAME_C_BPartnerSR_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartnerSR_ID, Integer.valueOf(C_BPartnerSR_ID));
	}

	/** Get BPartner (Agent).
		@return Business Partner (Agent or Sales Rep)
	  */
	public int getC_BPartnerSR_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerSR_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_BPartner getC_BPartner()
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
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

	public I_C_BPartner_Location getC_BPartner_Location()
    {
		return (I_C_BPartner_Location)MTable.get(getCtx(), I_C_BPartner_Location.Table_Name)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID 
		Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
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

	public I_C_Project getC_Project()
    {
		return (I_C_Project)MTable.get(getCtx(), I_C_Project.Table_Name)
			.getPO(getC_Project_ID(), get_TrxName());	}

	/** Set Project.
		@param C_Project_ID 
		Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1) 
			set_Value (COLUMNNAME_C_Project_ID, null);
		else 
			set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
	}

	/** Get Project.
		@return Financial Project
	  */
	public int getC_Project_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Corector.
		@param GZ_Corector 
		Corector de index ataşat contorului
	  */
	public void setGZ_Corector (String GZ_Corector)
	{
		set_Value (COLUMNNAME_GZ_Corector, GZ_Corector);
	}

	/** Get Corector.
		@return Corector de index ataşat contorului
	  */
	public String getGZ_Corector () 
	{
		return (String)get_Value(COLUMNNAME_GZ_Corector);
	}

	/** Set Dată PIF.
		@param GZ_DataPIF 
		Data punerii în funcţiune a asset-ului
	  */
	public void setGZ_DataPIF (Timestamp GZ_DataPIF)
	{
		set_Value (COLUMNNAME_GZ_DataPIF, GZ_DataPIF);
	}

	/** Get Dată PIF.
		@return Data punerii în funcţiune a asset-ului
	  */
	public Timestamp getGZ_DataPIF () 
	{
		return (Timestamp)get_Value(COLUMNNAME_GZ_DataPIF);
	}

	/** Set Debit.
		@param GZ_Debit Debit	  */
	public void setGZ_Debit (int GZ_Debit)
	{
		set_Value (COLUMNNAME_GZ_Debit, Integer.valueOf(GZ_Debit));
	}

	/** Get Debit.
		@return Debit	  */
	public int getGZ_Debit () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GZ_Debit);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set În folosinţă.
		@param GZ_InFolosinta În folosinţă	  */
	public void setGZ_InFolosinta (boolean GZ_InFolosinta)
	{
		set_Value (COLUMNNAME_GZ_InFolosinta, Boolean.valueOf(GZ_InFolosinta));
	}

	/** Get În folosinţă.
		@return În folosinţă	  */
	public boolean isGZ_InFolosinta () 
	{
		Object oo = get_Value(COLUMNNAME_GZ_InFolosinta);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Index.
		@param GZ_Index Index	  */
	public void setGZ_Index (int GZ_Index)
	{
		set_Value (COLUMNNAME_GZ_Index, Integer.valueOf(GZ_Index));
	}

	/** Get Index.
		@return Index	  */
	public int getGZ_Index () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GZ_Index);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Post reglare.
		@param GZ_PostReglare_ID Post reglare	  */
	public void setGZ_PostReglare_ID (int GZ_PostReglare_ID)
	{
		if (GZ_PostReglare_ID < 1) 
			set_Value (COLUMNNAME_GZ_PostReglare_ID, null);
		else 
			set_Value (COLUMNNAME_GZ_PostReglare_ID, Integer.valueOf(GZ_PostReglare_ID));
	}

	/** Get Post reglare.
		@return Post reglare	  */
	public int getGZ_PostReglare_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GZ_PostReglare_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Punct măsură.
		@param GZ_PunctMasura_ID Punct măsură	  */
	public void setGZ_PunctMasura_ID (int GZ_PunctMasura_ID)
	{
		if (GZ_PunctMasura_ID < 1) 
			set_Value (COLUMNNAME_GZ_PunctMasura_ID, null);
		else 
			set_Value (COLUMNNAME_GZ_PunctMasura_ID, Integer.valueOf(GZ_PunctMasura_ID));
	}

	/** Get Punct măsură.
		@return Punct măsură	  */
	public int getGZ_PunctMasura_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GZ_PunctMasura_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** GZ_TipComponenta AD_Reference_ID=1000068 */
	public static final int GZ_TIPCOMPONENTA_AD_Reference_ID=1000068;
	/** Contor = CT */
	public static final String GZ_TIPCOMPONENTA_Contor = "CT";
	/** Bransament = BR */
	public static final String GZ_TIPCOMPONENTA_Bransament = "BR";
	/** Regulator = RG */
	public static final String GZ_TIPCOMPONENTA_Regulator = "RG";
	/** Retea distributie = RD */
	public static final String GZ_TIPCOMPONENTA_ReteaDistributie = "RD";
	/** Instalatie utilizare = IU */
	public static final String GZ_TIPCOMPONENTA_InstalatieUtilizare = "IU";
	/** Set Tip componentă.
		@param GZ_TipComponenta 
		Componentă a reţelei de furnizare şi/sau distribuţie
	  */
	public void setGZ_TipComponenta (String GZ_TipComponenta)
	{

		set_Value (COLUMNNAME_GZ_TipComponenta, GZ_TipComponenta);
	}

	/** Get Tip componentă.
		@return Componentă a reţelei de furnizare şi/sau distribuţie
	  */
	public String getGZ_TipComponenta () 
	{
		return (String)get_Value(COLUMNNAME_GZ_TipComponenta);
	}

	/** Set Meter Type.
		@param GZ_Tip_Contor 
		Type of meter
	  */
	public void setGZ_Tip_Contor (String GZ_Tip_Contor)
	{
		set_Value (COLUMNNAME_GZ_Tip_Contor, GZ_Tip_Contor);
	}

	/** Get Meter Type.
		@return Type of meter
	  */
	public String getGZ_Tip_Contor () 
	{
		return (String)get_Value(COLUMNNAME_GZ_Tip_Contor);
	}

	/** Set Tip Regulator.
		@param GZ_Tip_Regulator Tip Regulator	  */
	public void setGZ_Tip_Regulator (String GZ_Tip_Regulator)
	{
		set_Value (COLUMNNAME_GZ_Tip_Regulator, GZ_Tip_Regulator);
	}

	/** Get Tip Regulator.
		@return Tip Regulator	  */
	public String getGZ_Tip_Regulator () 
	{
		return (String)get_Value(COLUMNNAME_GZ_Tip_Regulator);
	}

	/** Set Guarantee Date.
		@param GuaranteeDate 
		Date when guarantee expires
	  */
	public void setGuaranteeDate (Timestamp GuaranteeDate)
	{
		set_Value (COLUMNNAME_GuaranteeDate, GuaranteeDate);
	}

	/** Get Guarantee Date.
		@return Date when guarantee expires
	  */
	public Timestamp getGuaranteeDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_GuaranteeDate);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
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

	/** Set Depreciate.
		@param IsDepreciated 
		The asset will be depreciated
	  */
	public void setIsDepreciated (boolean IsDepreciated)
	{
		set_Value (COLUMNNAME_IsDepreciated, Boolean.valueOf(IsDepreciated));
	}

	/** Get Depreciate.
		@return The asset will be depreciated
	  */
	public boolean isDepreciated () 
	{
		Object oo = get_Value(COLUMNNAME_IsDepreciated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Disposed.
		@param IsDisposed 
		The asset is disposed
	  */
	public void setIsDisposed (boolean IsDisposed)
	{
		set_Value (COLUMNNAME_IsDisposed, Boolean.valueOf(IsDisposed));
	}

	/** Get Disposed.
		@return The asset is disposed
	  */
	public boolean isDisposed () 
	{
		Object oo = get_Value(COLUMNNAME_IsDisposed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Fully depreciated.
		@param IsFullyDepreciated 
		The asset is fully depreciated
	  */
	public void setIsFullyDepreciated (boolean IsFullyDepreciated)
	{
		set_ValueNoCheck (COLUMNNAME_IsFullyDepreciated, Boolean.valueOf(IsFullyDepreciated));
	}

	/** Get Fully depreciated.
		@return The asset is fully depreciated
	  */
	public boolean isFullyDepreciated () 
	{
		Object oo = get_Value(COLUMNNAME_IsFullyDepreciated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set In Possession.
		@param IsInPosession 
		The asset is in the possession of the organization
	  */
	public void setIsInPosession (boolean IsInPosession)
	{
		set_Value (COLUMNNAME_IsInPosession, Boolean.valueOf(IsInPosession));
	}

	/** Get In Possession.
		@return The asset is in the possession of the organization
	  */
	public boolean isInPosession () 
	{
		Object oo = get_Value(COLUMNNAME_IsInPosession);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Owned.
		@param IsOwned 
		The asset is owned by the organization
	  */
	public void setIsOwned (boolean IsOwned)
	{
		set_Value (COLUMNNAME_IsOwned, Boolean.valueOf(IsOwned));
	}

	/** Get Owned.
		@return The asset is owned by the organization
	  */
	public boolean isOwned () 
	{
		Object oo = get_Value(COLUMNNAME_IsOwned);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Last Maintenance.
		@param LastMaintenanceDate 
		Last Maintenance Date
	  */
	public void setLastMaintenanceDate (Timestamp LastMaintenanceDate)
	{
		set_Value (COLUMNNAME_LastMaintenanceDate, LastMaintenanceDate);
	}

	/** Get Last Maintenance.
		@return Last Maintenance Date
	  */
	public Timestamp getLastMaintenanceDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LastMaintenanceDate);
	}

	/** Set Last Note.
		@param LastMaintenanceNote 
		Last Maintenance Note
	  */
	public void setLastMaintenanceNote (String LastMaintenanceNote)
	{
		set_Value (COLUMNNAME_LastMaintenanceNote, LastMaintenanceNote);
	}

	/** Get Last Note.
		@return Last Maintenance Note
	  */
	public String getLastMaintenanceNote () 
	{
		return (String)get_Value(COLUMNNAME_LastMaintenanceNote);
	}

	/** Set Last Unit.
		@param LastMaintenanceUnit 
		Last Maintenance Unit
	  */
	public void setLastMaintenanceUnit (int LastMaintenanceUnit)
	{
		set_Value (COLUMNNAME_LastMaintenanceUnit, Integer.valueOf(LastMaintenanceUnit));
	}

	/** Get Last Unit.
		@return Last Maintenance Unit
	  */
	public int getLastMaintenanceUnit () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LastMaintenanceUnit);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lease Termination.
		@param LeaseTerminationDate 
		Lease Termination Date
	  */
	public void setLeaseTerminationDate (Timestamp LeaseTerminationDate)
	{
		set_Value (COLUMNNAME_LeaseTerminationDate, LeaseTerminationDate);
	}

	/** Get Lease Termination.
		@return Lease Termination Date
	  */
	public Timestamp getLeaseTerminationDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LeaseTerminationDate);
	}

	/** Set Lessor.
		@param Lease_BPartner_ID 
		The Business Partner who rents or leases
	  */
	public void setLease_BPartner_ID (int Lease_BPartner_ID)
	{
		if (Lease_BPartner_ID < 1) 
			set_Value (COLUMNNAME_Lease_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_Lease_BPartner_ID, Integer.valueOf(Lease_BPartner_ID));
	}

	/** Get Lessor.
		@return The Business Partner who rents or leases
	  */
	public int getLease_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Lease_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Life use.
		@param LifeUseUnits 
		Units of use until the asset is not usable anymore
	  */
	public void setLifeUseUnits (int LifeUseUnits)
	{
		set_Value (COLUMNNAME_LifeUseUnits, Integer.valueOf(LifeUseUnits));
	}

	/** Get Life use.
		@return Units of use until the asset is not usable anymore
	  */
	public int getLifeUseUnits () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LifeUseUnits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Location comment.
		@param LocationComment 
		Additional comments or remarks concerning the location
	  */
	public void setLocationComment (String LocationComment)
	{
		set_Value (COLUMNNAME_LocationComment, LocationComment);
	}

	/** Get Location comment.
		@return Additional comments or remarks concerning the location
	  */
	public String getLocationComment () 
	{
		return (String)get_Value(COLUMNNAME_LocationComment);
	}

	/** Set Lot No.
		@param Lot 
		Lot number (alphanumeric)
	  */
	public void setLot (String Lot)
	{
		set_Value (COLUMNNAME_Lot, Lot);
	}

	/** Get Lot No.
		@return Lot number (alphanumeric)
	  */
	public String getLot () 
	{
		return (String)get_Value(COLUMNNAME_Lot);
	}

	/** Set Attribute Set Instance.
		@param M_AttributeSetInstance_ID 
		Product Attribute Set Instance
	  */
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
	{
		if (M_AttributeSetInstance_ID < 0)
			 throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
	}

	/** Get Attribute Set Instance.
		@return Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_InOutLine getM_InOutLine()
    {
		return (I_M_InOutLine)MTable.get(getCtx(), I_M_InOutLine.Table_Name)
			.getPO(getM_InOutLine_ID(), get_TrxName());	}

	/** Set Shipment/Receipt Line.
		@param M_InOutLine_ID 
		Line on Shipment or Receipt document
	  */
	public void setM_InOutLine_ID (int M_InOutLine_ID)
	{
		if (M_InOutLine_ID < 1) 
			set_Value (COLUMNNAME_M_InOutLine_ID, null);
		else 
			set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
	}

	/** Get Shipment/Receipt Line.
		@return Line on Shipment or Receipt document
	  */
	public int getM_InOutLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_Locator getM_Locator()
    {
		return (I_M_Locator)MTable.get(getCtx(), I_M_Locator.Table_Name)
			.getPO(getM_Locator_ID(), get_TrxName());	}

	/** Set Locator.
		@param M_Locator_ID 
		Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID)
	{
		if (M_Locator_ID < 1) 
			set_Value (COLUMNNAME_M_Locator_ID, null);
		else 
			set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
	}

	/** Get Locator.
		@return Warehouse Locator
	  */
	public int getM_Locator_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_Product getM_Product()
    {
		return (I_M_Product)MTable.get(getCtx(), I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufactured Year.
		@param ManufacturedYear Manufactured Year	  */
	public void setManufacturedYear (int ManufacturedYear)
	{
		set_Value (COLUMNNAME_ManufacturedYear, Integer.valueOf(ManufacturedYear));
	}

	/** Get Manufactured Year.
		@return Manufactured Year	  */
	public int getManufacturedYear () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ManufacturedYear);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturer.
		@param Manufacturer 
		Manufacturer of the Product
	  */
	public void setManufacturer (String Manufacturer)
	{
		set_Value (COLUMNNAME_Manufacturer, Manufacturer);
	}

	/** Get Manufacturer.
		@return Manufacturer of the Product
	  */
	public String getManufacturer () 
	{
		return (String)get_Value(COLUMNNAME_Manufacturer);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		if (Name == null)
			throw new IllegalArgumentException ("Name is mandatory.");
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Next Maintenence.
		@param NextMaintenenceDate 
		Next Maintenence Date
	  */
	public void setNextMaintenenceDate (Timestamp NextMaintenenceDate)
	{
		set_Value (COLUMNNAME_NextMaintenenceDate, NextMaintenenceDate);
	}

	/** Get Next Maintenence.
		@return Next Maintenence Date
	  */
	public Timestamp getNextMaintenenceDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_NextMaintenenceDate);
	}

	/** Set Next Unit.
		@param NextMaintenenceUnit 
		Next Maintenence Unit
	  */
	public void setNextMaintenenceUnit (int NextMaintenenceUnit)
	{
		set_Value (COLUMNNAME_NextMaintenenceUnit, Integer.valueOf(NextMaintenenceUnit));
	}

	/** Get Next Unit.
		@return Next Maintenence Unit
	  */
	public int getNextMaintenenceUnit () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NextMaintenenceUnit);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Serial No.
		@param SerNo 
		Product Serial Number 
	  */
	public void setSerNo (String SerNo)
	{
		set_Value (COLUMNNAME_SerNo, SerNo);
	}

	/** Get Serial No.
		@return Product Serial Number 
	  */
	public String getSerNo () 
	{
		return (String)get_Value(COLUMNNAME_SerNo);
	}

	/** Set Usable Life - Months.
		@param UseLifeMonths 
		Months of the usable life of the asset
	  */
	public void setUseLifeMonths (int UseLifeMonths)
	{
		set_Value (COLUMNNAME_UseLifeMonths, Integer.valueOf(UseLifeMonths));
	}

	/** Get Usable Life - Months.
		@return Months of the usable life of the asset
	  */
	public int getUseLifeMonths () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeMonths);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Use units.
		@param UseUnits 
		Currently used units of the assets
	  */
	public void setUseUnits (int UseUnits)
	{
		set_ValueNoCheck (COLUMNNAME_UseUnits, Integer.valueOf(UseUnits));
	}

	/** Get Use units.
		@return Currently used units of the assets
	  */
	public int getUseUnits () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseUnits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		if (Value == null)
			throw new IllegalArgumentException ("Value is mandatory.");
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Version No.
		@param VersionNo 
		Version Number
	  */
	public void setVersionNo (String VersionNo)
	{
		set_Value (COLUMNNAME_VersionNo, VersionNo);
	}

	/** Get Version No.
		@return Version Number
	  */
	public String getVersionNo () 
	{
		return (String)get_Value(COLUMNNAME_VersionNo);
	}

	@Override
	public void setProductR_MailText_ID(int ProductR_MailText_ID) {
		if (ProductR_MailText_ID < 1) 
			set_Value (COLUMNNAME_ProductR_MailText_ID, null);
		else 
			set_Value (COLUMNNAME_ProductR_MailText_ID, Integer.valueOf(ProductR_MailText_ID));
	}

	@Override
	public int getProductR_MailText_ID() {
		Integer ii = (Integer)get_Value(COLUMNNAME_ProductR_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public I_R_MailText getProductR_MailText() {
		return (I_R_MailText)MTable.get(getCtx(), I_R_MailText.Table_Name)
				.getPO(getProductR_MailText_ID(), get_TrxName());
	}

	@Override
	public void setisDownloadable(boolean isDownloadable) {
		set_Value (COLUMNNAME_isDownloadable, Boolean.valueOf(isDownloadable));
	}

	@Override
	public boolean isDownloadable() {
		Object oo = get_Value(COLUMNNAME_isDownloadable);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}