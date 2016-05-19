<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<style>
body{
          font-size: 20px;
          line-height: 40px;
          background-image: url(imag/3.jpg);
}
</style>
</head>
<body>
<center>
<form action="zhuce" method="post">
<table>
<tr>
<td>用户名</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>密码</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>姓名</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>年龄</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>性别</td>
<td><input type="radio" name="sex" value="famale">男</td>
<td><input type="radio" name="sex" value="male">女</td>
</tr>
<tr>
<td>手机号码</td>
<td><input type="text" name="phone"></td>
</tr>
<tr>
<td><input  type="submit" name="submit" value="提交"></td>
</tr>
</table>
</form>
</center>
</body>
</html>