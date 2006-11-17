/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for AD_OrgType
 *  @author Jorg Janke (generated) 
 *  @version Release 2.5.3d - 2006-10-10 21:55:53.265 */
public class X_AD_OrgType extends PO
{
/** Standard Constructor
@param ctx context
@param AD_OrgType_ID id
@param trxName transaction
*/
public X_AD_OrgType (Properties ctx, int AD_OrgType_ID, String trxName)
{
super (ctx, AD_OrgType_ID, trxName);
/** if (AD_OrgType_ID == 0)
{
setAD_OrgType_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_OrgType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=689 */
public static final int Table_ID=689;

/** TableName=AD_OrgType */
public static final String Table_Name="AD_OrgType";

protected static KeyNamePair Model = new KeyNamePair(689,"AD_OrgType");

protected BigDecimal accessLevel = new BigDecimal(6);
/** AccessLevel
@return 6 - System - Client 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_OrgType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Organization Type.
@param AD_OrgType_ID Organization Type allows you to categorize your organizations */
public void setAD_OrgType_ID (int AD_OrgType_ID)
{
if (AD_OrgType_ID < 1) throw new IllegalArgumentException ("AD_OrgType_ID is mandatory.");
set_ValueNoCheck ("AD_OrgType_ID", new Integer(AD_OrgType_ID));
}
/** Get Organization Type.
@return Organization Type allows you to categorize your organizations */
public int getAD_OrgType_ID() 
{
Integer ii = (Integer)get_Value("AD_OrgType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Print Color.
@param AD_PrintColor_ID Color used for printing and display */
public void setAD_PrintColor_ID (int AD_PrintColor_ID)
{
if (AD_PrintColor_ID <= 0) set_Value ("AD_PrintColor_ID", null);
 else 
set_Value ("AD_PrintColor_ID", new Integer(AD_PrintColor_ID));
}
/** Get Print Color.
@return Color used for printing and display */
public int getAD_PrintColor_ID() 
{
Integer ii = (Integer)get_Value("AD_PrintColor_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}
}
