<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" >
<title>Insert title here</title>
</head>
<body>
<form action="/user/reg">
 用户名：<input type="text" name="uname"/> <br/>
 <input type="hidden" name="method" value="reg"/>
 <input type="submit" value="注册"/>

</form>
</body>
</html>