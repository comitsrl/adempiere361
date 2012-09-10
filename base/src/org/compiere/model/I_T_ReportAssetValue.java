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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for T_ReportAssetValue
 *  @author Adempiere (generated) 
 *  @version Release 3.5.3a
 */
public interface I_T_ReportAssetValue 
{

    /** TableName=T_ReportAssetValue */
    public static final String Table_Name = "T_ReportAssetValue";

    /** AD_Table_ID=1500129 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_PInstance_ID */
    public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

	/** Set Process Instance.
	  * Instance of the process
	  */
	public void setAD_PInstance_ID (int AD_PInstance_ID);

	/** Get Process Instance.
	  * Instance of the process
	  */
	public int getAD_PInstance_ID();

	public I_AD_PInstance getAD_PInstance();

    /** Column name A_Accumulated_Depr */
    public static final String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";

	/** Set A_Accumulated_Depr	  */
	public void setA_Accumulated_Depr (BigDecimal A_Accumulated_Depr);

	/** Get A_Accumulated_Depr	  */
	public BigDecimal getA_Accumulated_Depr();

    /** Column name A_Asset_Acct */
    public static final String COLUMNNAME_A_Asset_Acct = "A_Asset_Acct";

	/** Set Asset Acct	  */
	public void setA_Asset_Acct (int A_Asset_Acct);

	/** Get Asset Acct	  */
	public int getA_Asset_Acct();

	public I_C_ValidCombination getA_Asset_A();

    /** Column name A_Asset_Class_ID */
    public static final String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";

	/** Set Asset class	  */
	public void setA_Asset_Class_ID (int A_Asset_Class_ID);

	/** Get Asset class	  */
	public int getA_Asset_Class_ID();

	public I_A_Asset_Class getA_Asset_Class();

    /** Column name A_Asset_Cost */
    public static final String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";

	/** Set A_Asset_Cost	  */
	public void setA_Asset_Cost (BigDecimal A_Asset_Cost);

	/** Get A_Asset_Cost	  */
	public BigDecimal getA_Asset_Cost();

    /** Column name A_Asset_ID */
    public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";

	/** Set Asset.
	  * Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID);

	/** Get Asset.
	  * Asset used internally or by customers
	  */
	public int getA_Asset_ID();

	public I_A_Asset getA_Asset();

    /** Column name A_Asset_Remaining */
    public static final String COLUMNNAME_A_Asset_Remaining = "A_Asset_Remaining";

	/** Set Remaining Amt	  */
	public void setA_Asset_Remaining (BigDecimal A_Asset_Remaining);

	/** Get Remaining Amt	  */
	public BigDecimal getA_Asset_Remaining();

    /** Column name A_SourceType */
    public static final String COLUMNNAME_A_SourceType = "A_SourceType";

	/** Set Source Type	  */
	public void setA_SourceType (String A_SourceType);

	/** Get Source Type	  */
	public String getA_SourceType();

    /** Column name AssetServiceDate */
    public static final String COLUMNNAME_AssetServiceDate = "AssetServiceDate";

	/** Set In Service Date.
	  * Date when Asset was put into service
	  */
	public void setAssetServiceDate (Timestamp AssetServiceDate);

	/** Get In Service Date.
	  * Date when Asset was put into service
	  */
	public Timestamp getAssetServiceDate();

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public I_C_AcctSchema getC_AcctSchema();

    /** Column name C_Location_ID */
    public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_Location_ID();

	public I_C_Location getC_Location();

    /** Column name Cofinantare_Donatie */
    public static final String COLUMNNAME_Cofinantare_Donatie = "Cofinantare_Donatie";

	/** Set Cofinantare_Donatie	  */
	public void setCofinantare_Donatie (BigDecimal Cofinantare_Donatie);

	/** Get Cofinantare_Donatie	  */
	public BigDecimal getCofinantare_Donatie();

    /** Column name Cofinantare_Subventie */
    public static final String COLUMNNAME_Cofinantare_Subventie = "Cofinantare_Subventie";

	/** Set Cofinantare_Subventie	  */
	public void setCofinantare_Subventie (BigDecimal Cofinantare_Subventie);

	/** Get Cofinantare_Subventie	  */
	public BigDecimal getCofinantare_Subventie();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateAcct */
    public static final String COLUMNNAME_DateAcct = "DateAcct";

	/** Set Account Date.
	  * Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct);

	/** Get Account Date.
	  * Accounting Date
	  */
	public Timestamp getDateAcct();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Expense */
    public static final String COLUMNNAME_Expense = "Expense";

	/** Set Expense	  */
	public void setExpense (BigDecimal Expense);

	/** Get Expense	  */
	public BigDecimal getExpense();

    /** Column name FullyDepreciatedDate */
    public static final String COLUMNNAME_FullyDepreciatedDate = "FullyDepreciatedDate";

	/** Set FullyDepreciatedDate	  */
	public void setFullyDepreciatedDate (Timestamp FullyDepreciatedDate);

	/** Get FullyDepreciatedDate	  */
	public Timestamp getFullyDepreciatedDate();

    /** Column name GZ_Cota_Expense */
    public static final String COLUMNNAME_GZ_Cota_Expense = "GZ_Cota_Expense";

	/** Set Cota de amortizare	  */
	public void setGZ_Cota_Expense (BigDecimal GZ_Cota_Expense);

	/** Get Cota de amortizare	  */
	public BigDecimal getGZ_Cota_Expense();

    /** Column name InventoryNo */
    public static final String COLUMNNAME_InventoryNo = "InventoryNo";

	/** Set Inventory No	  */
	public void setInventoryNo (String InventoryNo);

	/** Get Inventory No	  */
	public String getInventoryNo();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LevelNo */
    public static final String COLUMNNAME_LevelNo = "LevelNo";

	/** Set Level no	  */
	public void setLevelNo (int LevelNo);

	/** Get Level no	  */
	public int getLevelNo();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UseLifeYears */
    public static final String COLUMNNAME_UseLifeYears = "UseLifeYears";

	/** Set Usable Life - Years.
	  * Years of the usable life of the asset
	  */
	public void setUseLifeYears (int UseLifeYears);

	/** Get Usable Life - Years.
	  * Years of the usable life of the asset
	  */
	public int getUseLifeYears();
}
