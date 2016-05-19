<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style>
body {
    line-height:30px;
	font-size: 30px;
	background-image: url(imag/2.jpg)
}
</style>
</head>
<%
String usename="";
String password="";
Cookie[] cookie=request.getCookies();
if(cookie!=null&&cookie.length>0){
	for(Cookie c: cookie){
		if(c.getName().equals("usename"))
			usename=c.getValue();
		if(c.getName().equals("password"))
			password=c.getValue();
	}
}
%>


<center>
<body>
	<form action="dologin" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="usename" value="<%=usename%>"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" value="<%=password %>"></td>
			</tr>
			<tr>
			<td><input type="submit" name="submit" value="登陆"></td>
			<td><input type="checkbox" name="isusecookies" checked="checked" >允许记住用户十天</td>
			</tr>
		</table>
	</form>
</body>
</center>
</html>