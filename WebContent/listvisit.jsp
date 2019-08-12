<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	tr td{
		border:1px solid black;
		border-collapse:collapse;
		text-align:center;
	}
</style>
</head>
<body>
	<table style="border:1px black solid;border-collapse:collapse">
		<tr><td>用户</td><td>客户</td><td>地址</td><td>拜访内容</td><td>操作</td></tr>
		<s:iterator value="list" var="visit">
			<tr>
				<td><s:property value="#visit.user.username"></s:property></td>
				<td><s:property value="#visit.customer.cname"></s:property></td>
				<td><s:property value="#visit.address"></s:property></td>
				<td><s:property value="#visit.content"></s:property></td>
				<td><a href="http://localhost:8080/ssh_crm8/visit_delete.action?vid=<s:property value="#visit.vid"></s:property>" style="text-decoration:none">删除</a>&nbsp;
					<a href="http://localhost:8080/ssh_crm8/visit_findall.action?vid=<s:property value="#visit.vid"></s:property>
						&address=<s:property value="#visit.address"></s:property>&username=<s:property value="#visit.user.username"></s:property>&cname=<s:property value="#visit.customer.cname"></s:property>&content=<s:property value="#visit.content"></s:property>" style="text-decoration:none">修改</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>