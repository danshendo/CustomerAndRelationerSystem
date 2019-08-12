<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table tr td {
		border:1px solid black;
		border-collapse:collapse;
	}
</style>
</head>
<body>
	联系人名称：<input id="ccname" type="text" name="cname" /> 
	<a id="shaixuan" href="http://localhost:8080/ssh_crm8/relationer_findlike.action?cname=onclick()" style="text-decoration:none">筛选</a>
	<table style="border:1px black solid;border-collapse:collapse">
		<tr><td>联系人编号</td><td>名称</td><td>手机号</td><td>地址</td><td>所属客户</td><td>操作</td></tr>
		<s:iterator value="list" var="relationer">
			<tr>
				<td><s:property value="#relationer.rid"></s:property></td>
				<td><s:property value="#relationer.rname"></s:property></td>
				<td><s:property value="#relationer.phonenumber"></s:property></td>
				<td><s:property value="#relationer.address"></s:property></td>
				<td><s:property value="#relationer.Customer.cname"></s:property></td>
				<td><a href="http://localhost:8080/ssh_crm8/relationer_delete.action?rid=<s:property value="#relationer.rid"></s:property>" style="text-decoration:none">删除</a>&nbsp;
					<a href="${pageContext.request.contextPath }/modifyrelationer.jsp?rid=<s:property value="#relationer.rid"></s:property>
					&rname=<s:property value="#relationer.rname"></s:property>&phonenumber=<s:property value="#relationer.phonenumber"></s:property>
					&address=<s:property value="#relationer.address"></s:property>&cid=<s:property value="#relationer.Customer.cid"></s:property>" style="text-decoration:none">修改</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>