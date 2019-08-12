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
	<form action="${pageContext.request.contextPath }/relationer_findAllRelationer.action" method="post">
		所属客户：<select name="customer.cid">
			<c:forEach items="${list }" var="customer">
				<option value="${customer.cid }">${customer.cname }</option>
			</c:forEach>
		</select>
		联系人名称：<input type="text" name="rname" /><br />
		联系人地址：<input type="text" name="address" /><br />
		<input type="submit" value="查询" />
	</form>
</body>
</html>