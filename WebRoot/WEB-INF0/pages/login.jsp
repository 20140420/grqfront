<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>用户登录</title>
<link href="../../css/web.css" rel="stylesheet" type="text/css" />
<!--<link rel="stylesheet" href="css_example_url" />
<script src="js_example_url"></script>-->
</head>
<body>
<div class="container">
	<div class="header"><%@ include file="header.jsp"%></div><!-- end .header -->
	<div class="content">
	  <div class="login">	
        <form action="#" method="post">
            <table>
            	<tr>
                	<th colspan="3" align="center">用户登录</th>
                </tr>
                <tr>
                    <td class="col1">用户：</td>
                    <td class="col2" colspan="2"><input type="text" placeholder="用户ID或邮箱"></td>
              </tr>
                <tr>
                    <td class="col1">密码：</td>
                    <td class="identification"><input name="pwd" type="password" placeholder="由字母和数字组成"></td>
                    <td align="center"><input type="submit" value="忘记密码？"></td>
                </tr>
                <tr>
                    <td class="col1">验证码：</td>
                    <td class="identification"><input type="text" placeholder="从邮箱或手机"></td>
                    <td align="center"><input type="submit" value="获取验证码"></td>
				</tr>
                <tr>
                    <td colspan="3" align="center"><input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="重置" type="reset" value="重置"></td>
                </tr>
          </table>
        </form>
		</div> 
        <!--<div id="sample">
         ...
        </div> <!-- #sample END -->
	</div>
    <!--<div class="sidebar1">
        侧边（选择）
	</div>-->   
  <div class="footer"><%@ include file="footer.jsp"%><!-- end .footer --></div>
</div>
<script>
// 你的代码
</script>
</body>
</html>

