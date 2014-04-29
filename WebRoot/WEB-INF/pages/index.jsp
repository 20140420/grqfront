<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>主页</title>
<link href="<%=basePath%>/css/web.css" rel="stylesheet" type="text/css" />
<!--<link rel="stylesheet" href="css_example_url" />
<script src="js_example_url"></script>-->
<script src="../../js/jquery.js"></script>
</head>
<body>
<div class="container">
	<div class="header"><%@ include file="header.jsp"%> <!--end .header --></div>
	<div class="content">
      <div class="index">
            <!--<div class="content-welcome">
            欢迎 Welcome! </div>-->
			<div class="content-welcome">
				<iframe border="0" id="content" src="<%=basePath%>/WEB-INF/pages/pic-index.html" frameborder="0" height="100%" width="100%"></iframe>
			</div><!---->
			<div class="menu-control">
                <ul>
                <li><a href="shark/shark.jsp">金鲨银鲨</a></li>
                <li><a href="snake/snake.jsp">小蛇快逃</a></li>
                <li><a href="investment.jsp">投资理财</a></li>
                <li><a href="preparing.jsp">网络电视</a></li>
                <li><a href="charts.html">华文视角</a></li>
                <li><a href="preparing.jsp">汽车强国</a></li>
              </ul>
            </div>       
      </div> <!-- index END -->
	</div>
    <!--<div class="sidebar1">
        侧边（选择）
	</div>-->   
</div>
<script>
// 你的代码
</script>
</body>
</html>

