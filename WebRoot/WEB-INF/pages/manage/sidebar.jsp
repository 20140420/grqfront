<!-------------------------------
*  COPYRIGHT(C) 2013 杭州伯才团队
*   ALL RIGHTS RESERVED
*
* [FILE]      
*     sidebar.jsp
*
* [DESCRIPTION]   
*     本页是管理员后台侧栏
*
* [NOTE]
*     
*
* [VERSION]
*    v1.00  2013/11/27 姜泉  首版制作    
* --------------------------------->
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!--<div class="side-bar" id="J_sideBar">-->
		<h3><a href="../index.jsp">首页</a></h3>
		<h3>网站管理</h3>
		<ul class="hide">
			<li><a href="webserver.jsp">服务器信息</a></li>
			<li><a href="webdatabase.jsp">数据库信息</a></li>
			<li><a href="webotherinformation.jsp">其他信息</a></li>
		</ul>        
		<h3>用户管理</h3>
		<ul>
            <li><a href="adminuser.jsp">管理员</a></li>
            <li><a href="playeruser.jsp">玩家</a></li>
		</ul>
		<h3>资产管理</h3>
		<ul>
			<li><a href="assetgiro.jsp">转账管理</a></li>
            <li><a href="assetsilver.jsp">银币管理</a></li>
            <li><a href="assetinvest.jsp">投资管理</a></li>
		</ul>        
		<h3>运营管理</h3>
		<ul>
			<li><a href="operatesales.jsp">活动管理</a></li>
			<li><a href="operateoption.jsp">游戏设定</a></li>
		</ul>
<!--</div>-->