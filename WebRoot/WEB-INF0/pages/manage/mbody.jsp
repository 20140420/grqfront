<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>股如泉网上交易系统</title>
<link href="../../../css/manage.css" rel="stylesheet" type="text/css" />
<script src="../../../js/jquery.js"></script>
<script src="../../../js/manage.js"></script>
</head>
<body>
<div class="container">
  <div class="header">
      <ul class="header-title">
        <li><a href="#">股如泉网上交易系统</a></li>
      </ul>
      <ul class="header-menu">
        <li><a href="#">退出</a></li>
        <li><a href="../login.jsp">登入</a></li>
        <li><a href="#">锁屏</a></li>
        <li><a href="#">刷新</a></li>
        <li><a href="#">理财</a></li>
        <li><a href="#">安全</a></li>
        <li><a href="manage.jsp">系统</a></li>
      </ul>
  <!--<a href="#"><img src="" alt="在此处插入徽标" name="Insert_logo" width="180" height="90" id="Insert_logo" style="background-color: #C6D580; display:block;" /></a 
    <!-- end .header --></div>
  <div class="sidebar1">
<%
   if(2>1)//注意权限为游客时
   {
%>
       <jsp:include page="usidebar.jsp"/>
<%
   }else{
%>
       <jsp:include page="sidebar.jsp"/>
<%
   }
%> 
  <!--<ul class="nav">
      <li><a href="#">链接一</a></li>
      <li><a href="#">链接二</a></li>
      <li><a href="#">链接三</a></li>
      <li><a href="#">链接四</a></li>
    </ul>
    <p> 以上链接说明了一种基本导航结构，该结构使用以 CSS 设置样式的无序列表。请以此作为起点修改属性，以生成您自己的独特外观。如果需要弹出菜单，请使用 Spry 菜单、Adobe Exchange 中的菜单构件 或其它各种 javascript 或 CSS 解决方案创建您自己的菜单。</p>
    <p>如果您想要在顶部进行导航，只需将 ul.nav 移到页面顶部并重新创建样式即可。</p>
    <!-- end .sidebar1 --></div>
    
  