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

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for AD_ToolBarButtonRestrict
 *  @author Adempiere (generated) 
 *  @version 361LTS.Final - $Id$ */
public class X_AD_ToolBarButtonRestrict extends PO implements I_AD_ToolBarButtonRestrict, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20121115L;

    /** Standard Constructor */
    public X_AD_ToolBarButtonRestrict (Properties ctx, int AD_ToolBarButtonRestrict_ID, String trxName)
    {
      super (ctx, AD_ToolBarButtonRestrict_ID, trxName);
      /** if (AD_ToolBarButtonRestrict_ID == 0)
        {
			setAD_ToolBarButtonRestrict_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_ToolBarButtonRestrict (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
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
      StringBuffer sb = new StringBuffer ("X_AD_ToolBarButtonRestrict[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Action AD_Reference_ID=104 */
	public static final int ACTION_AD_Reference_ID=104;
	/** Window = W */
	public static final String ACTION_Window = "W";
	/** Task = T */
	public static final String ACTION_Task = "T";
	/** WorkFlow = F */
	public static final String ACTION_WorkFlow = "F";
	/** Process = P */
	public static final String ACTION_Process = "P";
	/** Report = R */
	public static final String ACTION_Report = "R";
	/** Form = X */
	public static final String ACTION_Form = "X";
	/** Workbench = B */
	public static final String ACTION_Workbench = "B";
	/** Set Action.
		@param Action 
		Indicates the Action to be performed
	  */
	public void setAction (String Action)
	{

		set_ValueNoCheck (COLUMNNAME_Action, Action);
	}

	/** Get Action.
		@return Indicates the Action to be performed
	  */
	public String getAction () 
	{
		return (String)get_Value(COLUMNNAME_Action);
	}

	public I_AD_Role getAD_Role() throws RuntimeException
    {
		return (I_AD_Role)MTable.get(getCtx(), I_AD_Role.Table_Name)
			.getPO(getAD_Role_ID(), get_TrxName());	}

	/** Set Role.
		@param AD_Role_ID 
		Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID < 0) 
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_ToolBarButton getAD_ToolBarButton() throws RuntimeException
    {
		return (I_AD_ToolBarButton)MTable.get(getCtx(), I_AD_ToolBarButton.Table_Name)
			.getPO(getAD_ToolBarButton_ID(), get_TrxName());	}

	/** Set ToolBar Button.
		@param AD_ToolBarButton_ID ToolBar Button	  */
	public void setAD_ToolBarButton_ID (int AD_ToolBarButton_ID)
	{
		if (AD_ToolBarButton_ID < 1) 
			set_Value (COLUMNNAME_AD_ToolBarButton_ID, null);
		else 
			set_Value (COLUMNNAME_AD_ToolBarButton_ID, Integer.valueOf(AD_ToolBarButton_ID));
	}

	/** Get ToolBar Button.
		@return ToolBar Button	  */
	public int getAD_ToolBarButton_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ToolBarButton_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ToolBar Button Restrict.
		@param AD_ToolBarButtonRestrict_ID ToolBar Button Restrict	  */
	public void setAD_ToolBarButtonRestrict_ID (int AD_ToolBarButtonRestrict_ID)
	{
		if (AD_ToolBarButtonRestrict_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_ToolBarButtonRestrict_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_ToolBarButtonRestrict_ID, Integer.valueOf(AD_ToolBarButtonRestrict_ID));
	}

	/** Get ToolBar Button Restrict.
		@return ToolBar Button Restrict	  */
	public int getAD_ToolBarButtonRestrict_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ToolBarButtonRestrict_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Window getAD_Window() throws RuntimeException
    {
		return (I_AD_Window)MTable.get(getCtx(), I_AD_Window.Table_Name)
			.getPO(getAD_Window_ID(), get_TrxName());	}

	/** Set Window.
		@param AD_Window_ID 
		Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_Window_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}