<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>金鲨银鲨</title>
<link href="../../../css/game.css" rel="stylesheet" type="text/css" />
<script src="../../../js/jquery.js"></script>
</head>
<body>
<div class="noscript">
  <h2 style="color: #ff0000">你的浏览器不支持Javascript！ 本页基于Javascript的Websockets功能不能用。请打开Javascript功能并重载页面！</h2></div>
<div class="container">	
  <div class="header">
	<ul class="header-title">
        <li>【金鲨银鲨-第一桌】</li>
	</ul>
	<%@ include file="gheader.jsp"%> 
  <!-- end .header --></div>
  <div class="sidebar1">
	<%@ include file="../chat/chattool.jsp"%>
    <!-- end .sidebar1 --></div>
  <div class="content">
  	<div class="content-gdial">
    <%@ include file="gdial.jsp"%>
    </div>    
    <div class="content-gpanel">
    <%@ include file="gpanel.jsp"%>
    </div>
  <!-- end .content --></div>
  <!--<div class="footer">
    <p>此 .footer 包含声明 position:relative，以便为 .footer 指定 Internet Explorer 6 hasLayout，并使其以正确方式清除。如果您不需要支持 IE6，则可以将其删除。</p>
  <!-- end .footer </div>-->
<!-- end .container --></div>
<script src="../../../js/shark.js"></script>
</body>
</html>