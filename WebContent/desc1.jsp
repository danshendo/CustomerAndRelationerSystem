<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer_modify.action" method="post">
		客户编号：<input type="text" name="cid" value="<%=request.getParameter("cid") %>" /><br />
		名称：<input type="text" name="cname" value="<%=request.getParameter("cname") %>" /><br />
		手机号：<input type="text" name="phonenumber" value="<%=request.getParameter("phonenumber") %>" /><br />
		地址：<input type="text" name="address" value="<%=request.getParameter("address") %>" /><br />
		客户级别：<input type="text" name="level" value="<%=request.getParameter("level") %>" /><br />
		客户来源：<input type="text" name="resource" value="<%=request.getParameter("resource") %>" /><br />
		<input type="submit" value="修改" />
	</form>
</body>
</html>