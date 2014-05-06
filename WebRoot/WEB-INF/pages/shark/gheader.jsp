<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- shark_headerMenu按键向导-->
<s:url action="headerMenu_uinquiryaccount" namespace="/pages"	var="headerMenu_uinquiryaccount"></s:url> 
<s:url action="headerMenu_usilverbuy" namespace="/pages"	var="headerMenu_usilverbuy"></s:url>
<s:url action="headerMenu_usilversell" namespace="/pages"	var="headerMenu_usilversell"></s:url>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<s:url action="headerMenu_grule" namespace="/pages"	var="headerMenu_grule"></s:url>
<div>
	<ul class="header-menu">
	 <li><a href="index" target="_blank">主页</a></li>
	 <li><a href="${headerMenu_uinquiryaccount}" target="_blank">资金</a></li>
	 <li><a href="${headerMenu_usilverbuy}" target="_blank">充值</a></li>
	 <li><a href="${headerMenu_usilversell}" target="_blank">兑现</a></li>
	 <li><a href="${context_path}/ranking.jsp" target="_blank">排名</a></li>
	 <li><a href="${headerMenu_grule}" target="_blank">规则</a></li>
	</ul>
<!-- end .header--></div>
