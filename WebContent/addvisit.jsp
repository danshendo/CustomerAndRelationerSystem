<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/visit_add.action" method="post">
		用户：<select name="user.uid">
			<c:forEach items="${listuser }" var="user">
				<option value="user.uid">${user.username }</option>
			</c:forEach>
		</select><br />
		客户：<select name="customer.cid">
			<c:forEach items="${listcustomer }" var="customer">
				<option value="customer.cid">${customer.cname }</option>
			</c:forEach>
		</select><br />
		拜访内容：<input type="text" name="content" /><br />
		地址:<input type="text" name="address" /><br />
		<input type="submit" value="增加" />
	</form>
</body>
</html>