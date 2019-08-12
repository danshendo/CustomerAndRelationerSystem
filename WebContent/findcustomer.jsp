<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer_find.action" method="post">
		客户名称：<input type="text" name="cname" /><br />
		客户来源：<input type="text" name="resource" /><br />
		客户级别：<input type="text" name="level" /><br />
		<input type="submit" value="查询" />
	</form>
</body>
</html>