<!---------------------------------
*  COPYRIGHT(C) 2013 杭州伯才团队
*   ALL RIGHTS RESERVED
*
* [FILE]      
*     usidebar.jsp
*
* [DESCRIPTION]   
*     本页是普通用户基本简介界面
*
* [NOTE]
*     
*
* [VERSION]
*    v1.00  2013/11/29 姜泉  首版制作    
* --------------------------------->
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:url action="usidebar_usilverbuy" namespace="/pages"	var="usidebar_usilverbuy"></s:url>
<s:url action="usidebar_usilversell" namespace="/pages"	var="usidebar_usilversell"></s:url>
<!--<div class="sidebar1">-->
		<h3><a href="index">首页</a></h3>
        <h3><a target="mdetail" href="${usidebar_usilverbuy}">银币买入</a></h3>
		<h3><a target="mdetail" href="${usidebar_usilversell}">银币卖出</a></h3>
		<h3>查询</h3>
		<ul>
			<li><a target="mdetail" href="uinquiryaccount.jsp">账户资金</a></li>
			<li><a target="mdetail" href="uinquirysilverrecord.jsp">资金明细</a></li>
			<li><a target="mdetail" href="uinquirygame.jsp">当日游戏</a></li>
		</ul>
		<h3>投资理财</h3>
		<ul>
			<li><a target="mdetail" href="uinvest.jsp">固定收益投资</a></li>
            <li><a target="mdetail" href="uinvestrecord.jsp">投资明细</a></li>
		</ul>        
  		<h3>转账</h3>
		<ul>
			<li><a target="mdetail" href="ugiro.jsp">转入转出</a></li>
			<li><a target="mdetail" href="ugirorecord.jsp">转账记录</a></li>
		</ul>
	    <h3>个人账户</h3>
		<ul>
            <li><a target="mdetail" href="uprofile.jsp">个人资料</a></li>
			<li><a target="mdetail" href="upassquestion.jsp">账户密保</a></li>
			<li><a target="mdetail" href="ubankcard.jsp">关联银行</a></li>      
		</ul>		
  		<h3>师徒关系</h3>
		<ul class="hide">
			<li><a target="mdetail" href="umaster.jsp">师傅</a></li>
			<li><a target="mdetail" href="uapprentice.jsp">徒弟</a></li>
		</ul>
<!--</div> -->