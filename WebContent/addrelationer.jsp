<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/relationer_add.action" method="post">
		联系人编号：<input type="text" name="rid" /><br />
		联系人名称:<input type="text" name="rname" /><br />
		联系人电话：<input type="text" name="phonenumber" /><br />
		联系人地址:<input type="text" name="address" /><br />
		所属客户：<input type="text" name="cid" /><br />
		<input type="submit" value="添加" />
	</form>
</body>
</html>