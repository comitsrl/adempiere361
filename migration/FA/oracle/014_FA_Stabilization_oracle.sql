-- Mar 9, 2012 6:12:09 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2012-03-09 18:12:09','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55768
;

-- Mar 9, 2012 6:12:26 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column SET DefaultValue='0',Updated=TO_DATE('2012-03-09 18:12:26','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55768
;

-- Mar 9, 2012 6:13:29 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2012-03-09 18:13:29','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55768
;

-- Mar 9, 2012 6:13:32 PM WIT
-- Complete Fixed Assets
ALTER TABLE A_Asset_Group_Acct MODIFY A_Reval_Cal_Method NVARCHAR2(22) DEFAULT NULL 
;

-- Mar 9, 2012 6:21:53 PM WIT
-- Complete Fixed Assets
UPDATE AD_Field SET SeqNo=220,IsDisplayed='Y' WHERE AD_Field_ID=56075
;

-- Apr 12, 2012 4:02:35 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Window SET WindowType='M',Updated=TO_DATE('2012-04-12 16:02:35','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Window_ID=53058
;

-- Apr 12, 2012 4:19:41 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Column SET DefaultValue='N',Updated=TO_DATE('2012-04-12 16:19:41','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55347
;

-- Apr 12, 2012 4:20:12 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Column SET DefaultValue='N',Updated=TO_DATE('2012-04-12 16:20:12','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55747
;


-- Mar 15, 2012 5:54:36 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process (Help,AD_Process_ID,IsDirectPrint,IsReport,AccessLevel,IsBetaFunctionality,IsServerProcess,ShowHelp,EntityType,Statistic_Seconds,Statistic_Count,Classname,CopyFromProcess,Description,Value,Name,AD_Org_ID,AD_Client_ID,CreatedBy,Updated,UpdatedBy,Created,IsActive) VALUES ('There are four parameters:
a. Project, is the Project that will be converted to asset. This project will be closed after this process completes
b. Product, is the asset product that will be act as the base for the newly created asset
c. UseLifeYears, is an optional parameter. Use this if you want a different use life years for the newly created asset, instead of the default uselifeyears from asset group accounting.
d. Transaction Date, will become in-service-date for the newly created asset.',200000,'N','N','1','N','N','Y','U',0,0,'org.adempiere.process.ProjectCreateAsset','N','This process creates asset from project and automatically close the project','FA_ProjectCreateAsset','FA_ProjectCreateAsset',0,0,100,TO_DATE('2012-03-15 17:54:36','YYYY-MM-DD HH24:MI:SS'),100,TO_DATE('2012-03-15 17:54:36','YYYY-MM-DD HH24:MI:SS'),'Y')
;

-- Mar 15, 2012 5:54:36 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Trl (AD_Language,AD_Process_ID, Help,Description,Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Process_ID, t.Help,t.Description,t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Process t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Process_ID=200000 AND NOT EXISTS (SELECT * FROM AD_Process_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Process_ID=t.AD_Process_ID)
;

-- Mar 15, 2012 5:56:37 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para (IsRange,AD_Process_Para_ID,FieldLength,AD_Process_ID,IsCentrallyMaintained,AD_Reference_ID,AD_Val_Rule_ID,SeqNo,IsMandatory,DefaultValue,EntityType,DisplayLogic,Name,ColumnName,IsActive,AD_Client_ID,UpdatedBy,Updated,CreatedBy,Created,AD_Org_ID) VALUES ('N',200000,'Y',30,232,10,'N','@C_Project_ID@','U','1=2','Project','C_Project_ID','Y',0,100,TO_DATE('2012-03-15 17:56:37','YYYY-MM-DD HH24:MI:SS'),100,TO_DATE('2012-03-15 17:56:37','YYYY-MM-DD HH24:MI:SS'),0)
;

-- Mar 15, 2012 5:56:37 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para_Trl (AD_Language,AD_Process_Para_ID, Help,Name,Description, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Process_Para_ID, t.Help,t.Name,t.Description, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Process_Para t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Process_Para_ID=200000 AND NOT EXISTS (SELECT * FROM AD_Process_Para_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Process_Para_ID=t.AD_Process_Para_ID)
;

-- Mar 15, 2012 5:58:03 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para (IsRange,AD_Process_Para_ID,FieldLength,AD_Process_ID,IsCentrallyMaintained,AD_Reference_ID,SeqNo,IsMandatory,DefaultValue,EntityType,Name,ColumnName,IsActive,AD_Client_ID,UpdatedBy,Updated,CreatedBy,Created,AD_Org_ID) VALUES ('N',200001,0,200000,'Y',15,30,'N','@#Date@','U','Transaction Date','DateTrx','Y',0,100,TO_DATE('2012-03-15 17:58:03','YYYY-MM-DD HH24:MI:SS'),100,TO_DATE('2012-03-15 17:58:03','YYYY-MM-DD HH24:MI:SS'),0)
;

-- Mar 15, 2012 5:58:03 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para_Trl (AD_Language,AD_Process_Para_ID, Help,Name,Description, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Process_Para_ID, t.Help,t.Name,t.Description, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Process_Para t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Process_Para_ID=200001 AND NOT EXISTS (SELECT * FROM AD_Process_Para_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Process_Para_ID=t.AD_Process_Para_ID)
;

-- Mar 15, 2012 5:58:36 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para (IsRange,AD_Process_Para_ID,FieldLength,AD_Process_ID,IsCentrallyMaintained,AD_Reference_ID,SeqNo,IsMandatory,EntityType,Name,ColumnName,IsActive,AD_Client_ID,UpdatedBy,Updated,CreatedBy,Created,AD_Org_ID) VALUES ('N',200002,0,200000,'Y',11,40,'N','U','Use Life Years','UseLifeYears','Y',0,100,TO_DATE('2012-03-15 17:58:36','YYYY-MM-DD HH24:MI:SS'),100,TO_DATE('2012-03-15 17:58:36','YYYY-MM-DD HH24:MI:SS'),0)
;

-- Mar 15, 2012 5:58:36 PM WIT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
INSERT INTO AD_Process_Para_Trl (AD_Language,AD_Process_Para_ID, Help,Name,Description, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Process_Para_ID, t.Help,t.Name,t.Description, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Process_Para t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Process_Para_ID=200002 AND NOT EXISTS (SELECT * FROM AD_Process_Para_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Process_Para_ID=t.AD_Process_Para_ID)
;


-- Mar 22, 2012 2:31:36 PM WIT
-- Stabilize Fixed Assets
INSERT INTO AD_Field (IsEncrypted,DisplayLength,AD_Column_ID,IsDisplayed,IsSameLine,IsHeading,IsFieldOnly,IsCentrallyMaintained,AD_Tab_ID,IsReadOnly,EntityType,Name,AD_Field_ID,UpdatedBy,AD_Org_ID,IsActive,Created,AD_Client_ID,CreatedBy,Updated) VALUES ('N',1,61471,'Y','N','N','N','Y',290,'N','U','IsFixedAssetInvoice',200048,100,0,'Y',TO_DATE('2012-03-22 14:31:31','YYYY-MM-DD HH24:MI:SS'),0,100,TO_DATE('2012-03-22 14:31:31','YYYY-MM-DD HH24:MI:SS'))
;

-- Mar 22, 2012 2:31:36 PM WIT
-- Stabilize Fixed Assets
INSERT INTO AD_Field_Trl (AD_Language,AD_Field_ID, Help,Description,Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Field_ID, t.Help,t.Description,t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Field t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Field_ID=200048 AND NOT EXISTS (SELECT * FROM AD_Field_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Field_ID=t.AD_Field_ID)
;

-- Mar 22, 2012 2:31:50 PM WIT
-- Stabilize Fixed Assets
UPDATE AD_Field SET SeqNo=400,IsDisplayed='Y' WHERE AD_Field_ID=200048
;

-- Mar 22, 2012 2:31:59 PM WIT
-- Stabilize Fixed Assets
UPDATE AD_Field SET IsReadOnly='Y',Updated=TO_DATE('2012-03-22 14:31:59','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=200048
;

-- Mar 22, 2012 2:32:19 PM WIT
-- Stabilize Fixed Assets
INSERT INTO AD_Field (IsEncrypted,DisplayLength,AD_Column_ID,IsDisplayed,IsSameLine,IsHeading,IsFieldOnly,IsCentrallyMaintained,AD_Tab_ID,IsReadOnly,EntityType,Name,AD_Field_ID,UpdatedBy,AD_Org_ID,IsActive,Created,AD_Client_ID,CreatedBy,Updated) VALUES ('N',1,61471,'Y','N','N','N','Y',263,'N','U','IsFixedAssetInvoice',200050,100,0,'Y',TO_DATE('2012-03-22 14:32:18','YYYY-MM-DD HH24:MI:SS'),0,100,TO_DATE('2012-03-22 14:32:18','YYYY-MM-DD HH24:MI:SS'))
;

-- Mar 22, 2012 2:32:19 PM WIT
-- Stabilize Fixed Assets
INSERT INTO AD_Field_Trl (AD_Language,AD_Field_ID, Help,Description,Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Field_ID, t.Help,t.Description,t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Field t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Field_ID=200050 AND NOT EXISTS (SELECT * FROM AD_Field_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Field_ID=t.AD_Field_ID)
;

-- Mar 22, 2012 2:32:44 PM WIT
-- Stabilize Fixed Assets
UPDATE AD_Field SET IsReadOnly='Y',Updated=TO_DATE('2012-03-22 14:32:44','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Field_ID=200050
;

update ad_modelvalidator
set modelvalidationclass = 'org.idempiere.fa.model.ModelValidator'
where ad_modelvalidator_id=50004;

update ad_column
set callout='org.idempiere.fa.model.CalloutAsset.location'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.model.CalloutAsset.location');

update ad_column
set callout='org.idempiere.fa.model.CalloutAsset.locator'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.model.CalloutAsset.locator');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.amt'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Addition.amt');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Transfer.dateDoc'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Transfer.dateDoc');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Transfer.asset'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Transfer.asset');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Reval.dateDoc'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Reval.dateDoc');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Reval.asset'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Reval.asset');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Disposed.date'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Disposed.date');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Disposed.asset'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Disposed.asset');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Disposed.amt'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout = 'org.compiere.FA.CalloutA_Asset_Disposed.amt');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.project'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout='org.compiere.FA.CalloutA_Asset_Addition.project');

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.periodOffset'
where ad_column_id IN (select ad_column_id from ad_column 
			where callout='org.compiere.FA.CalloutA_Asset_Addition.periodOffset');
			
update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.amt;org.idempiere.fa.model.CalloutA_Asset_Addition.periodOffset'
where ad_column_id=59467;


update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.dateDoc;org.idempiere.fa.model.CalloutA_Asset_Addition.periodOffset'
where ad_column_id=59465;

update ad_column
set callout='org.idempiere.fa.model.CalloutA_Asset_Addition.uselife;org.idempiere.fa.model.CalloutA_Asset_Addition.periodOffset'
where ad_column_id=59463;

update ad_column
set callout = 'org.idempiere.fa.model.' || trim (leading 'org.compiere.FA.' from callout)
where ad_column_id IN (
59293,55601,55784,55603);

update ad_column
set callout = 'org.idempiere.fa.' || trim (leading 'org.compiere.FA.' from callout)
where ad_column_id IN (59283,59284,59281,59282);


update ad_process
set classname='org.idempiere.fa.process.A_Depreciation_Workfile_Build'
where ad_process_id=53207;

update ad_process
set classname='org.idempiere.fa.process.A_Depreciation_Exp_Process'
where ad_process_id=53211;


update ad_process
set classname='org.idempiere.fa.process.ProjectCreateAsset'
where ad_process_id=200000;

update ad_process
set classname='org.idempiere.fa.process.ImportFixedAsset'
where ad_process_id=53215;



--select * from ad_process where classname like '%sset%'

--select callout from ad_column where callout = 'sset' order by callout desc


