-- Apr 28, 2011 7:37:46 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:37:46','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55786
;

-- Apr 28, 2011 7:37:49 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:37:49','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59403
;

-- Apr 28, 2011 7:37:54 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:37:54','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59404
;

-- Apr 28, 2011 7:37:56 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:37:56','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59407
;

-- Apr 28, 2011 7:37:58 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:37:58','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55759
;

-- Apr 28, 2011 7:38:00 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:00','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59405
;

-- Apr 28, 2011 7:38:03 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:03','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59402
;

-- Apr 28, 2011 7:38:15 AM MYT
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:15','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59307
;

-- Apr 28, 2011 7:38:19 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:19','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55632
;

-- Apr 28, 2011 7:38:22 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:22','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59306
;

-- Apr 28, 2011 7:38:24 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:24','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55601
;

-- Apr 28, 2011 7:38:26 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:26','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59305
;

-- Apr 28, 2011 7:38:29 AM MYT
-- Removing unused Defaults in Table/Column of AssetGroupAcct / Asset
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-04-28 07:38:29','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55628
;

-- May 17, 2011 8:31:57 PM MYT
-- Fixed Assets Integration
UPDATE AD_Column SET DefaultValue=NULL,Updated=TO_DATE('2011-05-17 20:31:57','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55782
;

--recreate both tables
DROP TABLE adempiere.a_asset_acct;

CREATE TABLE adempiere.a_asset_acct
(
  a_asset_id numeric(10) NOT NULL,
  c_acctschema_id numeric(10) NOT NULL,
  ad_client_id numeric(10) NOT NULL,
  ad_org_id numeric(10) NOT NULL,
  isactive character(1) NOT NULL,
  created timestamp without time zone NOT NULL,
  createdby numeric(10) NOT NULL,
  updated timestamp without time zone NOT NULL,
  updatedby numeric(10) NOT NULL,
  a_depreciation_id numeric(10) NOT NULL,
  a_depreciation_acct numeric(10) NOT NULL,
  a_accumdepreciation_acct numeric(10) NOT NULL,
  a_disposal_loss character varying(40),
  a_disposal_gain character varying(10),
  a_asset_acct numeric(10) NOT NULL,
  a_asset_acct_id numeric(10) NOT NULL,
  a_depreciation_manual_period character varying(2),
  a_depreciation_table_header_id numeric(10),
  a_reval_cost_offset_prior character varying(22),
  a_reval_cost_offset character varying(22),
  a_reval_cal_method character varying(3),
  a_reval_accumdep_offset_prior character varying(22),
  a_reval_accumdep_offset_cur character varying(22),
  a_period_start numeric(10) NOT NULL,
  a_period_end numeric(10) NOT NULL,
  a_disposal_revenue character varying(40),
  processing character(1) DEFAULT 'Y'::bpchar,
  postingtype character(1) NOT NULL DEFAULT 'A'::bpchar,
  a_split_percent numeric NOT NULL DEFAULT 1::numeric,
  a_salvage_value numeric DEFAULT 0::numeric,
  a_reval_depexp_offset character varying(22),
  a_depreciation_variable_perc numeric,
  a_depreciation_method_id numeric(10) NOT NULL,
  a_depreciation_manual_amount numeric,
  a_depreciation_conv_id numeric(10) NOT NULL,
  a_asset_spread_id numeric(10),
  a_disposal_gain_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_cost_offset_prior_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_cost_offset_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_adep_offset_prior_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_adep_offset_cur_acct numeric(10) DEFAULT NULL::numeric,
  a_disposal_revenue_acct numeric(10) NOT NULL,
  a_disposal_loss_acct numeric(10) NOT NULL,
  a_reval_depexp_offset_acct numeric(10) DEFAULT NULL::numeric,
  a_depreciation_method_f_id numeric(10) NOT NULL,
  a_depreciation_f_id numeric(10) NOT NULL,
  a_depreciation_conv_f_id numeric(10) NOT NULL,
  a_depreciation_variable_perc_f numeric,
  validfrom timestamp without time zone,
  CONSTRAINT a_asset_acct_pkey PRIMARY KEY (a_asset_acct_id),
  CONSTRAINT aasset_aassetacct FOREIGN KEY (a_asset_id)
      REFERENCES adempiere.a_asset (a_asset_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT aassetspread_aassetacct FOREIGN KEY (a_asset_spread_id)
      REFERENCES adempiere.a_asset_spread (a_asset_spread_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciation_aassetacct FOREIGN KEY (a_depreciation_id)
      REFERENCES adempiere.a_depreciation (a_depreciation_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciationconv_aassetacct FOREIGN KEY (a_depreciation_conv_id)
      REFERENCES adempiere.a_depreciation_convention (a_depreciation_convention_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciationmethod_aassetacct FOREIGN KEY (a_depreciation_method_id)
      REFERENCES adempiere.a_depreciation_method (a_depreciation_method_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciationtableheader_aasse FOREIGN KEY (a_depreciation_table_header_id)
      REFERENCES adempiere.a_depreciation_table_header (a_depreciation_table_header_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT cacctschema_aassetacct FOREIGN KEY (c_acctschema_id)
      REFERENCES adempiere.c_acctschema (c_acctschema_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT a_asset_acct_isactive_check CHECK (isactive = ANY (ARRAY['Y'::bpchar, 'N'::bpchar])),
  CONSTRAINT a_asset_acct_processing_check CHECK (processing = ANY (ARRAY['Y'::bpchar, 'N'::bpchar]))
)
WITH (OIDS=FALSE);
ALTER TABLE adempiere.a_asset_acct OWNER TO adempiere;

--recreate second table

DROP TABLE adempiere.a_asset_group_acct;

CREATE TABLE adempiere.a_asset_group_acct
(
  a_asset_group_id numeric(10) NOT NULL,
  c_acctschema_id numeric(10) NOT NULL,
  ad_client_id numeric(10) NOT NULL,
  ad_org_id numeric(10) NOT NULL,
  isactive character(1),
  created timestamp without time zone NOT NULL,
  createdby numeric(10),
  updated timestamp without time zone NOT NULL,
  updatedby numeric(10),
  a_asset_acct numeric(10) NOT NULL,
  a_depreciation_acct numeric(10) NOT NULL,
  a_accumdepreciation_acct numeric(10) NOT NULL,
  a_disposal_loss character varying(22),
  a_disposal_gain character varying(10),
  a_depreciation_id numeric(10) NOT NULL DEFAULT 1000003::numeric,
  a_asset_group_acct_id numeric(10) NOT NULL,
  a_depreciation_manual_period character varying(2),
  a_depreciation_variable_perc numeric,
  a_split_percent numeric NOT NULL DEFAULT 1::numeric,
  a_reval_depexp_offset character varying(22),
  a_reval_cost_offset_prior character varying(22),
  a_reval_cost_offset character varying(22),
  a_reval_cal_method character varying(22),
  a_reval_accumdep_offset_prior character varying(22),
  a_reval_accumdep_offset_cur character varying(22),
  a_disposal_revenue character varying(22),
  uselifeyears numeric(10),
  uselifemonths numeric(10) DEFAULT 0::numeric,
  processing character(1),
  postingtype character(1) NOT NULL DEFAULT 'A'::bpchar,
  depreciationtype character varying(10),
  conventiontype character varying(10) DEFAULT '1000000'::character varying,
  a_depreciation_table_header_id numeric(10),
  a_depreciation_manual_amount numeric,
  a_depreciation_calc_type character varying(10) DEFAULT '1000000'::character varying,
  a_asset_spread_type character varying(10),
  a_reval_depexp_offset_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_cost_offset_prior_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_cost_offset_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_adep_offset_prior_acct numeric(10) DEFAULT NULL::numeric,
  a_reval_adep_offset_cur_acct numeric(10) DEFAULT NULL::numeric,
  a_disposal_gain_acct numeric(10) DEFAULT NULL::numeric,
  a_depreciation_method_id numeric(10) NOT NULL DEFAULT (1000000)::numeric,
  a_depreciation_conv_f_id numeric(10) NOT NULL DEFAULT (1000000)::numeric,
  a_depreciation_conv_id numeric(10) NOT NULL DEFAULT (1000000)::numeric,
  a_depreciation_method_f_id numeric(10) NOT NULL DEFAULT (1000000)::numeric,
  a_depreciation_variable_perc_f numeric,
  a_depreciation_f_id numeric(10) NOT NULL DEFAULT (1000003)::numeric,
  uselifeyears_f numeric(10) NOT NULL DEFAULT (0)::numeric,
  uselifemonths_f numeric(10) NOT NULL DEFAULT (0)::numeric,
  a_disposal_revenue_acct numeric(10) DEFAULT NULL::numeric,
  a_disposal_loss_acct numeric(10) DEFAULT NULL::numeric,
  CONSTRAINT a_asset_group_acct_key PRIMARY KEY (a_asset_group_acct_id),
  CONSTRAINT aassetgroup_aassetgroupacct FOREIGN KEY (a_asset_group_id)
      REFERENCES adempiere.a_asset_group (a_asset_group_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE CASCADE DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciation_aassetgroupacct FOREIGN KEY (a_depreciation_id)
      REFERENCES adempiere.a_depreciation (a_depreciation_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT adepreciationtableheader_aass3 FOREIGN KEY (a_depreciation_table_header_id)
      REFERENCES adempiere.a_depreciation_table_header (a_depreciation_table_header_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT cacctschema_aassetgroupacct FOREIGN KEY (c_acctschema_id)
      REFERENCES adempiere.c_acctschema (c_acctschema_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED,
  CONSTRAINT a_asset_group_acct_isactive_check CHECK (isactive = ANY (ARRAY['Y'::bpchar, 'N'::bpchar])),
  CONSTRAINT a_asset_group_acct_processing_check CHECK (processing = ANY (ARRAY['Y'::bpchar, 'N'::bpchar]))
)
WITH (OIDS=FALSE);
ALTER TABLE adempiere.a_asset_group_acct OWNER TO adempiere;


-- May 5, 2011 10:17:12 AM MYT
-- Fixed Asset 3297722 Build Depreciation Workfile wrong button
UPDATE AD_Column SET AD_Reference_ID=20,Updated=TO_DATE('2011-05-05 10:17:12','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55700
;

-- May 5, 2011 10:18:01 AM MYT
-- Fixed Asset 3297722 Build Depreciation Workfile wrong button
UPDATE AD_Column SET AD_Process_ID=53111, AD_Reference_ID=28,Updated=TO_DATE('2011-05-05 10:18:01','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55703
;

