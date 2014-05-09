<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- shark_headerMenu按键向导-->

<s:url action="manage_manage" namespace="/pages" var="manage_manage"></s:url>
<s:set var="context_path" value="#request.get('javax.servlet.forward.context_path')"></s:set>
<s:url action="shark_grule" namespace="/pages"	var="shark_grule"></s:url>
<div>
	<ul class="header-menu">
	 <li><a href="index" target="_blank">主页</a></li>
	 <li><a href="${manage_manage}" target="_blank">资金</a></li>
	 <!-- <li><a target="mdetail" href="${usidebar_usilverbuy}">充值</a></li> -->
	 <!-- <li><a target="mdetail" href="${usidebar_usilversell}">兑现</a></li> -->
	 <li><a href="${context_path}/ranking.jsp" target="_blank">排名</a></li>
	 <li><a href="${shark_grule}" target="_blank">规则</a></li>
	</ul>
<!-- end .header--></div>
