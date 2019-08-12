<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table tr td{
		border:1px solid black;
		border-collapse:collapse;
	}
</style>
</head>
<body>
	<table style="border:1px black solid;border-collapse:collapse">
		<tr><td>客户编号</td><td>名称</td><td>手机号</td><td>地址</td><td>客户级别</td><td>客户来源</td><td>操作</td></tr>
		<c:forEach items="${pageBean.list }" var="list">
			<tr>
				<td>${list.cid }</td>
				<td>${list.cname }</td>
				<td>${list.phonenumber }</td>
				<td>${list.address }</td>
				<td>${list.level }</td>
				<td>${list.resource }</td>
				<td><a href="http://localhost:8080/ssh_crm8/customer_delete.action?cid=${list.cid }" style="text-decoration:none">删除</a>&nbsp;
					<a href="http://localhost:8080/ssh_crm8/customer_modify.action?cid=${list.cid }&cname=${list.cname }&
					phonenumber=${list.phonenumber }&address=${list.address }&level=${list.level }$resource=${list.resource }" style="text-decoration:none">修改</a></td>
			</tr>
		</c:forEach>
		<tr><td colspan="7"><div style="width:300px;height:20px;float:right">共有[<b>${pageBean.pagecount }</b>] 在第[<b>${pageBean.cruentpage }</b>]
			<c:if test="${pageBean.cruentpage !=1 }">
				[<a href="http://localhost:8080/ssh_crm8/customer_pageBean.action?cruentpage=${pageBean.cruentpage -1 }" style="txet-decoration:none" target="right">前一页</a>]
			</c:if>
			<c:if test="${pageBean.cruentpage != pageBean.pagecount }">
				[<a href="http://localhost:8080/ssh_crm8/customer_pageBean.action?cruentpage=${pageBean.cruentpage +1 }" style="txet-decoration:none" target="right">后一页</a>]
			</c:if>
		</div></td></tr>
	</table>
</body>
</html>