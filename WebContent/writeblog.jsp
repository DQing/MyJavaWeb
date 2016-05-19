<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写博客</title>
<style >
body{
          background-color: gray;
          text-align: center;
}
</style>
</head>
<body>
<form action="writeblog" method="post">
<div>
<textarea cols="20" rows="2" name="title">标题</textarea>
</div>
<div>
<textarea cols="100" rows="50"  name="text" >在这输入内容</textarea>
<input type="submit" value="提交">
</div>
</form>
</body>
</html>