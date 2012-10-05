-- Dec 6, 2011 12:00:04 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:00:03','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=8051
;

-- Dec 6, 2011 12:00:11 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:00:11','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59259
;

-- Dec 6, 2011 12:01:19 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:01:19','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55773
;

-- Dec 6, 2011 12:01:23 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:01:23','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59409
;

-- Dec 6, 2011 12:01:26 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:01:26','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55772
;

-- Dec 6, 2011 12:01:29 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Column SET Callout=NULL,Updated=TO_DATE('2011-12-06 12:01:29','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59408
;

-- Dec 6, 2011 12:50:18 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Tab SET Name='Group Account',Updated=TO_DATE('2011-12-06 12:50:18','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Tab_ID=53165
;

-- Dec 6, 2011 12:50:18 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Tab_Trl SET IsTranslated='N' WHERE AD_Tab_ID=53165
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=80,IsDisplayed='Y' WHERE AD_Field_ID=59259
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=90,IsDisplayed='Y' WHERE AD_Field_ID=59260
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=100,IsDisplayed='Y' WHERE AD_Field_ID=59261
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=110,IsDisplayed='Y' WHERE AD_Field_ID=56065
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=120,IsDisplayed='Y' WHERE AD_Field_ID=56066
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=130,IsDisplayed='Y' WHERE AD_Field_ID=59262
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=140,IsDisplayed='Y' WHERE AD_Field_ID=56067
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=150,IsDisplayed='Y' WHERE AD_Field_ID=59263
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=160,IsDisplayed='Y' WHERE AD_Field_ID=56070
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=170,IsDisplayed='Y' WHERE AD_Field_ID=56071
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=180,IsDisplayed='Y' WHERE AD_Field_ID=56072
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=190,IsDisplayed='Y' WHERE AD_Field_ID=59264
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=200,IsDisplayed='Y' WHERE AD_Field_ID=59265
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=210,IsDisplayed='Y' WHERE AD_Field_ID=59255
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=220,IsDisplayed='Y' WHERE AD_Field_ID=59254
;

-- Dec 6, 2011 12:50:30 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Field SET SeqNo=230,IsDisplayed='Y' WHERE AD_Field_ID=56075
;

-- Dec 6, 2011 12:58:12 PM WIT
-- Fixed Asset Stabilization
UPDATE AD_Ref_Table SET AD_Display=13086, AD_Key=6497, AD_Table_ID=472,Updated=TO_DATE('2011-12-06 12:58:12','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Reference_ID=53363
;

-- Mar 9, 2012 2:43:25 PM WIT
-- Complete Fixed Assets
UPDATE AD_Column SET IsIdentifier='N',Updated=TO_TIMESTAMP('2012-03-09 14:43:25','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59259
;

-- Mar 9, 2012 2:43:31 PM WIT
-- Complete Fixed Assets
INSERT INTO t_alter_column values('a_asset','A_Asset_Type_ID','NUMERIC(10)',null,'NULL')
;

-- Mar 9, 2012 2:43:31 PM WIT
-- Complete Fixed Assets
INSERT INTO t_alter_column values('a_asset','A_Asset_Type_ID',null,'NULL',null)
;

-- Mar 9, 2012 2:57:06 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Column (AD_Column_ID,AD_Table_ID,EntityType,Version,IsMandatory,IsTranslated,IsIdentifier,SeqNo,Help,IsParent,FieldLength,IsSelectionColumn,AD_Reference_ID,IsSyncDatabase,IsKey,AD_Element_ID,IsAutocomplete,IsAllowLogging,IsEncrypted,IsUpdateable,IsAlwaysUpdateable,Description,Name,ColumnName,IsAllowCopy,CreatedBy,Updated,AD_Client_ID,AD_Org_ID,IsActive,Created,UpdatedBy) VALUES (200075,53127,'U',0,'N','N','N',0,'The Invoice Document.','N',10,'N',30,'N','N',1008,'N','Y','N','Y','N','Invoice Identifier','Invoice','C_Invoice_ID','Y',100,TO_TIMESTAMP('2012-03-09 14:56:58','YYYY-MM-DD HH24:MI:SS'),0,0,'Y',TO_TIMESTAMP('2012-03-09 14:56:58','YYYY-MM-DD HH24:MI:SS'),100)
;

-- Mar 9, 2012 2:57:06 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Column_Trl (AD_Language,AD_Column_ID, Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Column_ID, t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Column t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Column_ID=200075 AND NOT EXISTS (SELECT * FROM AD_Column_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Column_ID=t.AD_Column_ID)
;

-- Mar 9, 2012 2:57:34 PM WIT
-- Complete Fixed Assets
ALTER TABLE A_Asset_Disposed ADD COLUMN C_Invoice_ID NUMERIC(10) DEFAULT NULL 
;

-- Mar 9, 2012 2:58:06 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Column (AD_Column_ID,AD_Table_ID,EntityType,Version,IsMandatory,IsTranslated,IsIdentifier,SeqNo,Help,IsParent,FieldLength,IsSelectionColumn,AD_Reference_ID,IsSyncDatabase,IsKey,AD_Element_ID,IsAutocomplete,IsAllowLogging,IsEncrypted,IsUpdateable,IsAlwaysUpdateable,Description,Name,ColumnName,IsAllowCopy,CreatedBy,Updated,AD_Client_ID,AD_Org_ID,IsActive,Created,UpdatedBy) VALUES (200076,53127,'U',0,'N','N','N',0,'The Invoice Line uniquely identifies a single line of an Invoice.','N',10,'N',30,'N','N',1076,'N','Y','N','Y','N','Invoice Detail Line','Invoice Line','C_InvoiceLine_ID','Y',100,TO_TIMESTAMP('2012-03-09 14:58:04','YYYY-MM-DD HH24:MI:SS'),0,0,'Y',TO_TIMESTAMP('2012-03-09 14:58:04','YYYY-MM-DD HH24:MI:SS'),100)
;

-- Mar 9, 2012 2:58:06 PM WIT
-- Complete Fixed Assets
INSERT INTO AD_Column_Trl (AD_Language,AD_Column_ID, Name, IsTranslated,AD_Client_ID,AD_Org_ID,Created,Createdby,Updated,UpdatedBy) SELECT l.AD_Language,t.AD_Column_ID, t.Name, 'N',t.AD_Client_ID,t.AD_Org_ID,t.Created,t.Createdby,t.Updated,t.UpdatedBy FROM AD_Language l, AD_Column t WHERE l.IsActive='Y' AND l.IsSystemLanguage='Y' AND l.IsBaseLanguage='N' AND t.AD_Column_ID=200076 AND NOT EXISTS (SELECT * FROM AD_Column_Trl tt WHERE tt.AD_Language=l.AD_Language AND tt.AD_Column_ID=t.AD_Column_ID)
;

-- Mar 9, 2012 2:58:12 PM WIT
-- Complete Fixed Assets
ALTER TABLE A_Asset_Disposed ADD COLUMN C_InvoiceLine_ID NUMERIC(10) DEFAULT NULL 
;

