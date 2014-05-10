<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<h1 align="center">员工信息</h1> 
	<form  action="${pageContext.request.contextPath}/emp/updateemployee.action" method="post">
		<input type="hidden" name="employee.id" value="${employee.id}">
		<table align="center" border="2" bgcolor="">          
			<tr>
				<td align="center" colspan="2">修改员工信息</td>
			</tr>         
			<tr>
				<td>姓名</td>
				<td><input type="text" name="employee.name" value="${employee.name }"></td>
			</tr>          
			<tr>
				<td>年龄</td>
				<td><input type="text" name="employee.age" value="${employee.age }"></td>
			</tr>         
			<tr>
				<td>性别</td>
				<td>
					男<input type="radio" name="employee.sex" value="0" ${employee.sex==0?"checked":"" }>
					女<input type="radio" name="employee.sex" value="1" ${employee.sex==1?"checked":"" }>
				</td>
			</tr>          
			<tr>
				<td>电话</td>
				<td><input type="text" name="employee.tel" value="${employee.tel }"></td>
			</tr>          
			<tr>
				<td>地址</td>
				<td><input type="text" name="employee.address" value="${employee.address }"></td>
			</tr>          
			<tr>
				<td align="center" colspan="2"><input type="submit" value=" 提交"></td>          
			</tr>       
		</table>      
	</form>
  </body>
</html>
