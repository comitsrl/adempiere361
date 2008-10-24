<%--
 *  Product: Posterita Web-Based POS and Adempiere Plugin
 *  Copyright (C) 2007  Posterita Ltd
 *  This file is part of POSterita
 *  
 *  POSterita is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * @author Alok
--%>

<%@ page import="org.posterita.Constants" %>
<%@ page import="org.posterita.user.*" %>
<%@ page import="org.posterita.beans.*" %>
<%@ page import="org.posterita.struts.pos.CashBookAction" %>
<%@ page import="org.compiere.model.MCashLine" %>



<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>	
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>	
<%@ taglib uri="/WEB-INF/fmt.tld" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/pos.tld" prefix="pos"%>

<logic:notPresent name="<%=WebUserInfo.NAME%>" scope="session">
	<jsp:forward page="/LoginHome.do"/>
</logic:notPresent>

<bean:define id="title"><pos:element textOnly="true" columnName="adjust.cash.book"/></bean:define>
<%@ include file="/jsp/include/posHeader.jsp" %>	   
<%@ include file="/jsp/include/errors.jsp" %>

<html:form action="/AdjustCashBookAction">
	<html:hidden property="action" value="<%=CashBookAction.ADJUST_CASH_BOOK_ACTION%>"/>	
		<table border="0">
		  <tr>
		    <th>
		    	<pos:element columnName="Amt"/>
		    </th>
		    <th>
		    	<pos:element columnName="CashType"/>
		    </th>
		  </tr>
		    <%
				String styleClass = "label";
			%>	
		  <tr>
			    <td class="<%=styleClass%>">
			    	<html:text property="adjustmentAmount"/>
			    </td>
			    <td class="<%=styleClass%>">
			    	<html:select property="transferType">
			    	 <html:option value="<%=MCashLine.CASHTYPE_GeneralReceipts%>"><pos:element columnName="amount.receipt"/></html:option>
			    	 <html:option value="<%=MCashLine.CASHTYPE_GeneralExpense%>"><pos:element columnName="amount.expense"/></html:option>
			    	 <html:option value="<%=MCashLine.CASHTYPE_BankAccountTransfer%>"><pos:element columnName="amount.transfer"/></html:option>
			    	</html:select>
			    </td>
			   <td> 
			    <html:submit styleClass="submit smallbutton">
					&nbsp;
				</html:submit>
			  </td>	
		  </tr>
		</table>
</html:form> 

<%@ include file="/jsp/include/posFooter.jsp" %>