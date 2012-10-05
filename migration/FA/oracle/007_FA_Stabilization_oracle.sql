-- May 26, 2011 8:41:08 AM MYT
-- Fixed Assets Usability
UPDATE AD_Menu SET IsActive='N',Updated=TO_DATE('2011-05-26 08:41:08','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Menu_ID=53152
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Element (ColumnName,AD_Element_ID,EntityType,Name,PrintName,AD_Client_ID,Created,Updated,IsActive,AD_Org_ID,CreatedBy,UpdatedBy) VALUES ('A_Account_Number_Acct',200015,'D','A_Account_Number_Acct','A_Account_Number_Acct',0,TO_DATE('2012-03-09 13:16:10','YYYY-MM-DD HH24:MI:SS'),TO_DATE('2012-03-09 13:16:10','YYYY-MM-DD HH24:MI:SS'),'Y',0,100,100)
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Element_Trl (AD_Language,AD_Element_ID, Help,PO_Description,PO_Help,Name,Description,PrintName,PO_PrintName,PO_Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Element_ID, t.Help,t.PO_Description,t.PO_Help,t.Name,t.Description,t.PrintName,t.PO_PrintName,t.PO_Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Element t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Element_ID=200015 AND NOT EXISTS (SELECT * FROM AD_Element_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Element_ID=t.AD_Element_ID)
;


-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column SET AD_Element_ID=200015, ColumnName='A_Account_Number_Acct', Description=NULL, Help=NULL, Name='A_Account_Number_Acct',Updated=TO_DATE('2011-05-26 10:07:26','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55393
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column_Trl SET IsTranslated='N' WHERE AD_Column_ID=55393
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE AD_Field SET Name='A_Account_Number_Acct', Description=NULL, Help=NULL WHERE AD_Column_ID=55393 AND IsCentrallyMaintained='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
ALTER TABLE A_Depreciation_Exp ADD A_Account_Number_Acct NUMBER(10) DEFAULT NULL 
;

ALTER TABLE adempiere.a_depreciation_exp DROP COLUMN a_account_number;

-- May 26, 2011 8:52:32 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic='@DepreciationType@=50006',Updated=TO_DATE('2011-05-26 20:52:32','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=56058
;

-- May 26, 2011 8:53:03 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic=NULL,Updated=TO_DATE('2011-05-26 20:53:03','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=56059
;

-- May 26, 2011 8:53:17 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic=NULL,Updated=TO_DATE('2011-05-26 20:53:17','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=56060
;

-- May 26, 2011 8:54:08 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic='@A_Depreciation_ID@=1000005|@A_Depreciation_ID@=50010|@A_Depreciation_ID@=50006',Updated=TO_DATE('2011-05-26 20:54:08','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=56061
;

-- May 26, 2011 8:56:17 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic='@A_Depreciation_F_ID@=50010|@A_Depreciation_F_ID@=50005',Updated=TO_DATE('2011-05-26 20:56:17','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=59257
;

-- May 26, 2011 8:56:23 PM MYT
-- Fixed Assets Usability
UPDATE AD_Field SET DisplayLogic='@A_Depreciation_ID@=50010|@A_Depreciation_ID@=50005',Updated=TO_DATE('2011-05-26 20:56:23','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=56061
;

-- May 26, 2011 9:15:29 PM MYT
-- Fixed Assets Usability
UPDATE A_Depreciation SET DepreciationType='ARH_VAR',Updated=TO_DATE('2011-05-26 21:15:29','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE A_Depreciation_ID=50005
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_window
SET isbetafunctionality='N'
WHERE name LIKE '%sset%'
AND isbetafunctionality='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_process
SET isbetafunctionality='N'
WHERE name LIKE '%sset%'
AND isbetafunctionality='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_window
SET isbetafunctionality='N'
WHERE name LIKE '%epreciat%'
AND isbetafunctionality='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_process
SET isbetafunctionality='N'
WHERE name LIKE '%epreciat%'
AND isbetafunctionality='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_process
SET isbetafunctionality='N'
WHERE name LIKE '%nbound%'
AND isbetafunctionality='Y'
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_column
SET callout='org.compiere.model.CalloutAsset.location'
WHERE ad_column_id=8041
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_column
SET callout='org.compiere.model.CalloutAsset.locator'
WHERE ad_column_id=8049
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_column
SET callout='org.compiere.model.CalloutAsset.locator'
WHERE ad_column_id=8073
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_column
SET callout='org.compiere.model.MAssetType$Callout.assetType'
WHERE ad_column_id=59259
;

-- Mar 9, 2012 1:16:12 PM WIT
-- Complete Fixed Assets
UPDATE ad_column SET callout = null
WHERE ad_column_id=59455
;

-- Nov 24, 2011 9:06:25 AM ICT
-- Complete Fixed Assets
UPDATE A_Asset SET A_Asset_Action='MD' WHERE A_Asset_Action IS NULL
;

-- Nov 24, 2011 9:09:37 AM ICT
-- Complete Fixed Assets
UPDATE AD_Column SET IsMandatory='N',Updated=TO_TIMESTAMP('2011-11-24 09:09:37','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59260
;

-- Nov 24, 2011 9:12:35 AM ICT
-- Complete Fixed Assets
UPDATE AD_Column SET DefaultValue=NULL, IsMandatory='N',Updated=TO_TIMESTAMP('2011-11-24 09:12:35','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59259
;

-- Nov 24, 2011 10:58:05 AM ICT
-- A_Asset_Addition
UPDATE AD_Column SET IsUpdateable='Y',Updated=TO_TIMESTAMP('2011-11-24 10:58:05','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55954
;

-- Nov 24, 2011 10:58:15 AM ICT
-- A_Asset_Addition
UPDATE AD_Column SET IsUpdateable='Y',Updated=TO_TIMESTAMP('2011-11-24 10:58:15','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55968
;

-- Nov 24, 2011 10:58:19 AM ICT
-- A_Asset_Addition
UPDATE AD_Column SET IsUpdateable='Y',Updated=TO_TIMESTAMP('2011-11-24 10:58:19','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59456
;

-- Nov 24, 2011 10:59:03 AM ICT
-- A_Asset_Addition
UPDATE AD_Column SET AD_Reference_ID=19,Updated=TO_TIMESTAMP('2011-11-24 10:59:03','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59473
;

-- Nov 24, 2011 10:59:15 AM ICT
-- A_Asset_Addition
UPDATE AD_Column SET IsUpdateable='Y',Updated=TO_TIMESTAMP('2011-11-24 10:59:15','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55964
;

-- Dec 6, 2011 10:53:14 AM WIT
-- Fixed Asset Stabilization
UPDATE AD_Table SET AccessLevel='7',Updated=TO_DATE('2011-12-06 10:53:14','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Table_ID=53112
;

-- Dec 6, 2011 10:53:55 AM WIT
-- Fixed Asset Stabilization
UPDATE AD_Table SET AccessLevel='3',Updated=TO_DATE('2011-12-06 10:53:55','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Table_ID=53121
;

-- Dec 6, 2011 10:54:04 AM WIT
-- Fixed Asset Stabilization
UPDATE AD_Table SET AccessLevel='3',Updated=TO_DATE('2011-12-06 10:54:04','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Table_ID=53115
;

-- Dec 6, 2011 10:54:25 AM WIT
-- Fixed Asset Stabilization
UPDATE AD_Table SET AccessLevel='7',Updated=TO_DATE('2011-12-06 10:54:25','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Table_ID=53124
;

