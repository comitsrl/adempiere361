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
/** Generated Model for AD_PrintFont
 *  @author Jorg Janke (generated) 
 *  @version Release 2.5.3d - 2006-10-10 21:55:53.343 */
public class X_AD_PrintFont extends PO
{
/** Standard Constructor
@param ctx context
@param AD_PrintFont_ID id
@param trxName transaction
*/
public X_AD_PrintFont (Properties ctx, int AD_PrintFont_ID, String trxName)
{
super (ctx, AD_PrintFont_ID, trxName);
/** if (AD_PrintFont_ID == 0)
{
setAD_PrintFont_ID (0);
setCode (null);
setIsDefault (false);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_PrintFont (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=491 */
public static final int Table_ID=491;

/** TableName=AD_PrintFont */
public static final String Table_Name="AD_PrintFont";

protected static KeyNamePair Model = new KeyNamePair(491,"AD_PrintFont");

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
StringBuffer sb = new StringBuffer ("X_AD_PrintFont[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Print Font.
@param AD_PrintFont_ID Maintain Print Font */
public void setAD_PrintFont_ID (int AD_PrintFont_ID)
{
if (AD_PrintFont_ID < 1) throw new IllegalArgumentException ("AD_PrintFont_ID is mandatory.");
set_ValueNoCheck ("AD_PrintFont_ID", new Integer(AD_PrintFont_ID));
}
/** Get Print Font.
@return Maintain Print Font */
public int getAD_PrintFont_ID() 
{
Integer ii = (Integer)get_Value("AD_PrintFont_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Validation code.
@param Code Validation Code */
public void setCode (String Code)
{
if (Code == null) throw new IllegalArgumentException ("Code is mandatory.");
if (Code.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Code = Code.substring(0,1999);
}
set_Value ("Code", Code);
}
/** Get Validation code.
@return Validation Code */
public String getCode() 
{
return (String)get_Value("Code");
}
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value ("IsDefault", new Boolean(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value("IsDefault");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
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
