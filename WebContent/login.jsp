<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="form1" action="${pageContext.request.contextPath }/user_Login.action" method="post">
		名称：<input type="text" name="username" /><br />
		手机号：<input type="text" name="phonenumber" /><br />
		地址：<input type="text" name="address" /><br />
		<input type="submit" value="提交" />
	</form>
</body>
</html>