/******************************************************************************
 * Product: Posterita Ajax UI 												  *
 * Copyright (C) 2007 Posterita Ltd.  All Rights Reserved.                    *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Posterita Ltd., 3, Draper Avenue, Quatre Bornes, Mauritius                 *
 * or via info@posterita.org or http://www.posterita.org/                     *
 *****************************************************************************/

package org.adempiere.webui.panel;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import org.adempiere.webui.component.Checkbox;
import org.adempiere.webui.component.ToolBarButton;
import org.adempiere.webui.event.MenuListener;
import org.adempiere.webui.exception.ApplicationException;
import org.adempiere.webui.session.SessionManager;
import org.adempiere.webui.util.TreeUtils;
import org.compiere.model.MRole;
import org.compiere.model.MTree;
import org.compiere.model.MTreeNode;
import org.compiere.model.MUser;
import org.compiere.model.SystemIDs;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Panelchildren;
import org.zkoss.zul.Toolbar;
import org.zkoss.zul.Tree;
import org.zkoss.zul.Treechildren;
import org.zkoss.zul.Treecol;
import org.zkoss.zul.Treecols;
import org.zkoss.zul.Treeitem;
import org.zkoss.zul.Treerow;

/**
 *
 * @author  <a href="mailto:agramdass@gmail.com">Ashley G Ramdass</a>
 * @date    Feb 25, 2007
 * @version $Revision: 0.10 $
 */
public class MenuPanel extends Panel implements EventListener, SystemIDs
{
	private static final String ON_EXPAND_MENU_EVENT = "onExpandMenu";
    /**
	 * 
	 */
	private static final long serialVersionUID = -593280866781665891L;
	private Properties ctx;
    private TreeSearchPanel pnlSearch;
    private Tree menuTree;
    private ArrayList<MenuListener> menuListeners = new ArrayList<MenuListener>();
    
    private ToolBarButton expandToggle;
    
    public MenuPanel()
    {
        ctx = Env.getCtx();
        int adRoleId = Env.getAD_Role_ID(ctx);
        int adTreeId = getTreeId(ctx, adRoleId);
        MTree mTree = new MTree(ctx, adTreeId, false, true, null);
        
        if(mTree == null)
        {
            throw new ApplicationException("Could not load menu tree");
        }
        
        MTreeNode rootNode = mTree.getRoot();
        init();
        initMenu(rootNode);
        pnlSearch.initialise();

        // Auto Expand Tree - nmicoud IDEMPIERE 195
     	if (MUser.get(ctx).isMenuAutoExpand())
     		expandAll();
     	// Auto Expand Tree - nmicoud IDEMPIERE 195
    }
    
    private void init()
    {
    	this.setWidth("100%");
    	this.setHeight("100%");
    	
        menuTree = new Tree();
        menuTree.setMultiple(false);
        menuTree.setId("mnuMain");
        menuTree.setWidth("100%");
        menuTree.setVflex(true);
        menuTree.setSizedByContent(true);
        menuTree.setPageSize(-1); // Due to bug in the new paging functionality
        
        menuTree.setStyle("border: none");
        
        pnlSearch = new TreeSearchPanel(menuTree);
        
        Toolbar toolbar = new Toolbar();
        toolbar.setMold("panel");
        toolbar.appendChild(pnlSearch);
        this.appendChild(toolbar);
        
        Panelchildren pc = new Panelchildren();
        this.appendChild(pc);
        pc.appendChild(menuTree);  
        
        // Elaine 2009/02/27 - expand tree
        toolbar = new Toolbar();
        toolbar.setStyle("verticle-align: middle; padding: 2px");
        expandToggle = new ToolBarButton();
        expandToggle.setLabel(Util.cleanAmp(Msg.getMsg(Env.getCtx(), "ExpandTree")));
        expandToggle.setMode("toggle");
        expandToggle.addEventListener(Events.ON_CHECK, this);
        toolbar.appendChild(expandToggle);
        toolbar.setMold("panel");
        this.appendChild(toolbar);
        
        this.addEventListener(ON_EXPAND_MENU_EVENT, this);
    }
    
    private void initMenu(MTreeNode rootNode)
    {
        Treecols treeCols = new Treecols();
        Treecol treeCol = new Treecol();
        
        Treechildren rootTreeChildren = new Treechildren();
        generateMenu(rootTreeChildren, rootNode);
        
        treeCols.appendChild(treeCol);
        menuTree.appendChild(treeCols);
        menuTree.appendChild(rootTreeChildren);
    }
    
    private int getTreeId(Properties ctx, int adRoleId)
    {
        int AD_Tree_ID = DB.getSQLValue(null,
                "SELECT COALESCE(r.AD_Tree_Menu_ID, ci.AD_Tree_Menu_ID)" 
                + "FROM AD_ClientInfo ci" 
                + " INNER JOIN AD_Role r ON (ci.AD_Client_ID=r.AD_Client_ID) "
                + "WHERE AD_Role_ID=?", adRoleId);
        if (AD_Tree_ID <= 0)
            AD_Tree_ID = TREE_MENUPRIMARY;    //  Menu
        return AD_Tree_ID;
    }
    
    private void generateMenu(Treechildren treeChildren, MTreeNode mNode)
    {
        Enumeration<?> nodeEnum = mNode.children();
      
        while(nodeEnum.hasMoreElements())
        {
            MTreeNode mChildNode = (MTreeNode)nodeEnum.nextElement();
            Treeitem treeitem = new Treeitem();
            treeChildren.appendChild(treeitem);
            treeitem.setLabel(mChildNode.getName());
            treeitem.setTooltiptext(mChildNode.getDescription());
           
            if(mChildNode.getChildCount() != 0)
            {
                treeitem.setOpen(false);
                Treechildren treeItemChildren = new Treechildren();
                generateMenu(treeItemChildren, mChildNode);
                if(treeItemChildren.getChildren().size() != 0)
                    treeitem.appendChild(treeItemChildren);
                
                treeitem.getTreerow().addEventListener(Events.ON_CLICK, this);
            }
            else
            {
                treeitem.setValue(String.valueOf(mChildNode.getNode_ID()));
                
                if (mChildNode.isReport())
                	treeitem.setImage("/images/mReport.png");
                else if (mChildNode.isProcess() || mChildNode.isTask())
                	treeitem.setImage("/images/mProcess.png");
                else if (mChildNode.isWorkFlow())
                	treeitem.setImage("/images/mWorkFlow.png");
                else
                	treeitem.setImage("/images/mWindow.png");
                
                treeitem.getTreerow().setDraggable("favourite"); // Elaine 2008/07/24
                
                treeitem.getTreerow().addEventListener(Events.ON_CLICK, this);
            }
        }
    }
    
    public void addMenuListener(MenuListener menuListener)
    {
        menuListeners.add(menuListener);
    }
    
    public void removeMenuListener(MenuListener menuListener)
    {
        menuListeners.remove(menuListener);
    }
    
    public void onEvent(Event event)
    {
        Component comp = event.getTarget();
        String eventName = event.getName();
        
        if (eventName.equals(Events.ON_CLICK))
        {
        	if (comp instanceof Treerow) 
        	{
        		Treeitem selectedItem = (Treeitem) comp.getParent();
                if(selectedItem.getValue() != null)
                {
                    fireMenuSelectedEvent(selectedItem);
                }
                else
                {
                	selectedItem.setOpen(!selectedItem.isOpen());
                }
        	}
        }
        // Elaine 2009/02/27 - expand tree
        else if (eventName.equals(Events.ON_CHECK) && event.getTarget() == expandToggle)
        {
        	Clients.showBusy(null);
        	Events.echoEvent(ON_EXPAND_MENU_EVENT, this, null);
        }
        else if (eventName.equals(ON_EXPAND_MENU_EVENT)) 
        {
        	expandOnCheck();
        	Clients.clearBusy();
        }
        //
    }
    
    protected void fireMenuSelectedEvent(Treeitem selectedItem) {
    	int nodeId = Integer.parseInt((String)selectedItem.getValue());
       
    	try
        {
            /*Iterator<MenuListener> menuListenersIter = menuListeners.iterator();
            while(menuListenersIter.hasNext())
            {
                menuListenersIter.next().onMenuSelected(nodeId);
                menuTree.setSelectedItem(null);
            }*/
    		
    		SessionManager.getAppDesktop().onMenuSelected(nodeId);
        }
        catch (Exception e)
        {
            throw new ApplicationException(e.getMessage(), e);
        }		
	}

	public Tree getMenuTree() 
	{
		return menuTree;
	}
	
	/**
	* expand all node
	*/
	public void expandAll()
	{
		if (!expandToggle.isChecked())
			expandToggle.setChecked(true);
	
		TreeUtils.expandAll(menuTree);
	}
	
	/**
	 * collapse all node
	 */
	public void collapseAll()
	{
		if (expandToggle.isChecked())
			expandToggle.setChecked(false);
	
		TreeUtils.collapseAll(menuTree);
	}
	
	/**
	 *  On check event for the expand checkbox
	 */
	private void expandOnCheck()
	{
		if (expandToggle.isChecked())
			expandAll();
		else
			collapseAll();
	}
	//
}
