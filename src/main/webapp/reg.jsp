<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" >
<title>Insert title here</title>
<%-- <script type="text/javascript" src="<%=basePath%>js/reg.js"></script> --%>
</head>
<body>
<form action="user/reg" method="post">
 用户名：<input type="text" name="uname"/> <br/>
 <input type="hidden" name="method" value="reg"/>
<input type="submit" id="regBtn" value="注册" />

</form>
</body>
</html>