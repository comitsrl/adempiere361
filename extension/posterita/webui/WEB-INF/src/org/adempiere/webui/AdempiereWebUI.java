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

package org.adempiere.webui;

import java.util.Properties;

import javax.servlet.http.HttpSession;

import org.adempiere.webui.session.SessionManager;
import org.compiere.model.MSession;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.event.ClientInfoEvent;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zul.Window;

/**
 *
 * @author  <a href="mailto:agramdass@gmail.com">Ashley G Ramdass</a>
 * @date    Feb 25, 2007
 * @version $Revision: 0.10 $
 */
public class AdempiereWebUI extends Window implements EventListener
{
    private static final long  serialVersionUID = 1L;

    public static final String APP_NAME = "Posterita Ajax UI";

    public static final String UID          = "0.2";

    private WLogin             loginDesktop;

    private Desktop            appDesktop;

    private ClientInfo		   clientInfo;

	private String langSession;

    public AdempiereWebUI()
    {
    	this.addEventListener(Events.ON_CLIENT_INFO, this);
    }
    public void onCreate()
    {
        this.getPage().setTitle(APP_NAME);

        Properties ctx = Env.getCtx();
        langSession = Env.getContext(ctx, Env.LANGUAGE);
        SessionManager.setSessionApplication(this);
        if (!SessionManager.isUserLoggedIn(ctx))
        {
            loginDesktop = new WLogin(this);
            this.appendChild(loginDesktop);
        }
        else
        {
            loginCompleted();
        }
    }

    public void onOk()
    {
    }

    public void onCancel()
    {
    }

    public void loginCompleted()
    {
        loginDesktop = null;
        this.getChildren().clear();
        appDesktop = new Desktop();
        appDesktop.setParent(this);
        appDesktop.setClientInfo(clientInfo);
        
        this.setWidth("100%");
        this.setHeight("100%");
        this.appendChild(appDesktop);
        
        Properties ctx = Env.getCtx();
        String langLogin = Env.getContext(ctx, Env.LANGUAGE);
        if (langLogin == null || langLogin.length() <= 0) {
        	langLogin = langSession;
        	Env.setContext(ctx, Env.LANGUAGE, langSession);
        }
        
        // Validate language
		Language language = Language.getLanguage(langLogin);
    	Env.verifyLanguage(ctx, language);
        
		//	Create adempiere Session - user id in ctx
        Session currSess = Executions.getCurrent().getDesktop().getSession();
        HttpSession httpSess = (HttpSession) currSess.getNativeSession();

		MSession.get (ctx, currSess.getClientAddr(), 
			currSess.getClientHost(), httpSess.getId() );
    }

    public void logout()
    {
    	MSession mSession = MSession.get(Env.getCtx(), false);
    	if (mSession != null) {
    		mSession.logout();
    	}
    	
        SessionManager.clearSession();
        super.getChildren().clear();
        loginDesktop = new WLogin(this);
        super.appendChild(loginDesktop);
    }

    public Desktop getAppDeskop()
    {
    	return appDesktop;
    }
	public boolean isAsap() {
		return true;
	}
	public void onEvent(Event event) {
		if (event instanceof ClientInfoEvent) {
			ClientInfoEvent c = (ClientInfoEvent)event;
			clientInfo = new ClientInfo();
			clientInfo.colorDepth = c.getColorDepth();
			clientInfo.desktopHeight = c.getDesktopHeight();
			clientInfo.desktopWidth = c.getDesktopWidth();
			clientInfo.desktopXOffset = c.getDesktopXOffset();
			clientInfo.desktopYOffset = c.getDesktopYOffset();
			clientInfo.timeZone = c.getTimeZone();
			if (appDesktop != null)
				appDesktop.setClientInfo(clientInfo);
		}

	}
}
