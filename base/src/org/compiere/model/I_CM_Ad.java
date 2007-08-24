/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.compiere.model;

import java.util.*;
import java.sql.Timestamp;
import java.math.*;
import org.compiere.util.*;

    /** Generated Interface for CM_Ad
     *  @author Trifon Trifonov (generated) 
     *  @version Release 3.3.0 - 2007-08-24 11:39:33.593
     */
    public interface I_CM_Ad 
{

    /** TableName=CM_Ad */
    public static final String Table_Name = "CM_Ad";

    /** AD_Table_ID=858 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = new BigDecimal(6);

    /** Load Meta Data */

    /** Column name ActualClick */
    public static final String COLUMNNAME_ActualClick = "ActualClick";

	/** Set Actual Click Count.
	  * How many clicks have been counted
	  */
	public void setActualClick (int ActualClick);

	/** Get Actual Click Count.
	  * How many clicks have been counted
	  */
	public int getActualClick();

    /** Column name ActualImpression */
    public static final String COLUMNNAME_ActualImpression = "ActualImpression";

	/** Set Actual Impression Count.
	  * How many impressions have been counted
	  */
	public void setActualImpression (int ActualImpression);

	/** Get Actual Impression Count.
	  * How many impressions have been counted
	  */
	public int getActualImpression();

    /** Column name CM_Ad_Cat_ID */
    public static final String COLUMNNAME_CM_Ad_Cat_ID = "CM_Ad_Cat_ID";

	/** Set Advertisement Category.
	  * Advertisement Category like Banner Homepage 
	  */
	public void setCM_Ad_Cat_ID (int CM_Ad_Cat_ID);

	/** Get Advertisement Category.
	  * Advertisement Category like Banner Homepage 
	  */
	public int getCM_Ad_Cat_ID();

	public I_CM_Ad_Cat getI_CM_Ad_Cat() throws Exception;

    /** Column name CM_Ad_ID */
    public static final String COLUMNNAME_CM_Ad_ID = "CM_Ad_ID";

	/** Set Advertisement.
	  * An Advertisement is something like a banner
	  */
	public void setCM_Ad_ID (int CM_Ad_ID);

	/** Get Advertisement.
	  * An Advertisement is something like a banner
	  */
	public int getCM_Ad_ID();

    /** Column name CM_Media_ID */
    public static final String COLUMNNAME_CM_Media_ID = "CM_Media_ID";

	/** Set Media Item.
	  * Contains media content like images, flash movies etc.
	  */
	public void setCM_Media_ID (int CM_Media_ID);

	/** Get Media Item.
	  * Contains media content like images, flash movies etc.
	  */
	public int getCM_Media_ID();

	public I_CM_Media getI_CM_Media() throws Exception;

    /** Column name ContentHTML */
    public static final String COLUMNNAME_ContentHTML = "ContentHTML";

	/** Set Content HTML.
	  * Contains the content itself
	  */
	public void setContentHTML (String ContentHTML);

	/** Get Content HTML.
	  * Contains the content itself
	  */
	public String getContentHTML();

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

    /** Column name EndDate */
    public static final String COLUMNNAME_EndDate = "EndDate";

	/** Set End Date.
	  * Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate);

	/** Get End Date.
	  * Last effective date (inclusive)
	  */
	public Timestamp getEndDate();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsAdFlag */
    public static final String COLUMNNAME_IsAdFlag = "IsAdFlag";

	/** Set Special AD Flag.
	  * Do we need to specially mention this ad?
	  */
	public void setIsAdFlag (boolean IsAdFlag);

	/** Get Special AD Flag.
	  * Do we need to specially mention this ad?
	  */
	public boolean isAdFlag();

    /** Column name IsLogged */
    public static final String COLUMNNAME_IsLogged = "IsLogged";

	/** Set Logging.
	  * Do we need to log the banner impressions and clicks? (needs much performance)
	  */
	public void setIsLogged (boolean IsLogged);

	/** Get Logging.
	  * Do we need to log the banner impressions and clicks? (needs much performance)
	  */
	public boolean isLogged();

    /** Column name MaxClick */
    public static final String COLUMNNAME_MaxClick = "MaxClick";

	/** Set Max Click Count.
	  * Maximum Click Count until banner is deactivated
	  */
	public void setMaxClick (int MaxClick);

	/** Get Max Click Count.
	  * Maximum Click Count until banner is deactivated
	  */
	public int getMaxClick();

    /** Column name MaxImpression */
    public static final String COLUMNNAME_MaxImpression = "MaxImpression";

	/** Set Max Impression Count.
	  * Maximum Impression Count until banner is deactivated
	  */
	public void setMaxImpression (int MaxImpression);

	/** Get Max Impression Count.
	  * Maximum Impression Count until banner is deactivated
	  */
	public int getMaxImpression();

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

    /** Column name StartDate */
    public static final String COLUMNNAME_StartDate = "StartDate";

	/** Set Start Date.
	  * First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate);

	/** Get Start Date.
	  * First effective day (inclusive)
	  */
	public Timestamp getStartDate();

    /** Column name StartImpression */
    public static final String COLUMNNAME_StartImpression = "StartImpression";

	/** Set Start Count Impression.
	  * For rotation we need a start count
	  */
	public void setStartImpression (int StartImpression);

	/** Get Start Count Impression.
	  * For rotation we need a start count
	  */
	public int getStartImpression();

    /** Column name TargetURL */
    public static final String COLUMNNAME_TargetURL = "TargetURL";

	/** Set Target URL.
	  * URL for the Target
	  */
	public void setTargetURL (String TargetURL);

	/** Get Target URL.
	  * URL for the Target
	  */
	public String getTargetURL();

    /** Column name Target_Frame */
    public static final String COLUMNNAME_Target_Frame = "Target_Frame";

	/** Set Target Frame.
	  * Which target should be used if user clicks?
	  */
	public void setTarget_Frame (String Target_Frame);

	/** Get Target Frame.
	  * Which target should be used if user clicks?
	  */
	public String getTarget_Frame();
}
