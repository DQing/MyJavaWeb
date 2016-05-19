<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>看博客</title>
<style>
body{
           text-align:center;
           font-size:30px;
           background-color: gray;
}
</style>
</head>
<body>
<form action="readblog" method="post">
请输入要查看的博客标题:
<br>
<hr>
<input type="text" name="id">
<input type="submit"  value="提交">
</form>
</body>
</html>