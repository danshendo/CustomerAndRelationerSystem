<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>客户列表</title>
<style>
	tr td{
		border:1px solid black;
		border-collapse:collapse;
		text-align:center;
	}
</style>
<script src="${pageContext.request.contextPath }/js/shaixuan.js"></script>
</head>
<body>
	客户名称：<input id="ccname" type="text" name="cname" /> 
	<a id="shaixuan" href="http://localhost:8080/ssh_crm8/customer_findlike.action?cname=onclick()" style="text-decoration:none">筛选</a>
	<table style="border:1px black solid;border-collapse:collapse">
		<tr><td>名称</td><td>手机号</td><td>地址</td><td>客户级别</td><td>客户来源</td><td>操作</td></tr>
		<s:iterator value="list" var="customer">
			<tr>
				<td><s:property value="#customer.cname"></s:property></td>
				<td><s:property value="#customer.phonenumber"></s:property></td>
				<td><s:property value="#customer.address"></s:property></td>
				<td><s:property value="#customer.level"></s:property></td>
				<td><s:property value="#customer.resource"></s:property></td>
				<td><a href="http://localhost:8080/ssh_crm8/customer_delete.action?cid=<s:property value="#customer.cid"></s:property>" style="text-decoration:none">删除</a>&nbsp;
					<a href="desc1.jsp?cid=<s:property value="#customer.cid"></s:property>&cname=<s:property value="#customer.cname"></s:property>
						&phonenumber=<s:property value="#customer.phonenumber"></s:property>&address=<s:property value="#customer.address"></s:property>
						&level=<s:property value="#customer.level"></s:property>&resource=<s:property value="#customer.level"></s:property>" style="text-decoration:none">修改</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>