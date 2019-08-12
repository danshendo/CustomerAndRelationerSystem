<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/main.js"></script>
</head>
<body>
	<div id="top" style="width:800px;height:100px;background:blue">
		<h1 style="text-align:center">客户管理系统</h1>
		<div style="width:300px;height:30px;float:right">
			管理员：<span><font color="red">${sessionScope.user.username }</font></span>，你好！&nbsp;&nbsp;
				<a href="http://localhost:8080/ssh_crm8/user_tuichu.action" style="text-decoration:none">用户退出</a>
		</div>
	</div>
	<div id="left" style="width:100px;height:500px;float:left">
		<span style="width:100px;height:40px;background:#39C;text-align:center">客户管理  
			<div style="width:100px;height:60px;display:none;border:1px red solid">
				<ul style="list-style:none">
					<li>
						<a href="http://localhost:8080/ssh_crm8/customer_findAll.action" style="text-decoration:none" target="right">客户查看</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath }/desc2.jsp" style="text-decoration:none" target="right">添加客户</a>
					</li>
					<li>
						<a href="http://localhost:8080/ssh_crm8/customer_pageBean.action?cruentpage=1" style="text-decoration:none" target="right">客户分页列表</a>
					</li>
				</ul>
			</div>
		</span><br /> 
    
  	    <span style="width:100px;height:40px;background:#39C;text-align:center">联系人管理 
  	    	<div style="width:100px;height:60px;display:none;border:1px red solid">
  	    		<ul style="list-style:none">
					<li><a href="http://localhost:8080/ssh_crm8/relationer_findAll.action" style="text-decoration:none" target="right">联系人查看</a></li>
					<li><a href="${pageContext.request.contextPath }/addrelationer.jsp" style="text-decoration:none" target="right">添加联系人</a></li>
				</ul>
  	    	</div>
  	    </span><br />
    
    	<span style="width:100px;height:40px;background:#39C;text-align:center">用户拜访管理
    		<div style="width:100px;height:60px;display:none;border:1px red solid">
    			<ul>
    				<li><a href="${pageContext.request.contextPath }/visit_findAll.action" style="text-decoration:none" target="right">用户拜访列表</a></li>
    				<li><a href="http://localhost:8080/ssh_crm8/visit_FindAll.action" style="text-decoration:none" target="right">添加用户拜访</a></li>
    			</ul>
    		</div>
    	</span><br />  
  
    	<span style="width:100px;height:40px;background:#39C;text-align:center">客户联系人拜访管理  
    		<div style="width:100px;height:60px;display:none;border:1px red solid">
    			<ul>
    				<li>
    					<a href="${pageContext.request.contextPath }/findcustomer.jsp" style="text-decoration:none" target="right">客户查询</a>
    				</li>
    				<li>
    					<a href="http://localhost:8080/ssh_crm8/relationer_findcustomer.action" style="text-decoration:none" target="right">联系人查询</a>
    				</li>
    				<li>
    					<a href="#" style="text-decoration:none" target="right">拜访查询</a>
    				</li>
    			</ul>
    		</div>
    	</span><br /> 
   
    	<span style="width:100px;height:40px;background:#39C;text-align:center">标题5  
    		<div style="width:100px;height:200px;display:none;border:1px red solid">我是隐藏的div</div> 
    	</span>
	</div>
	<iframe frameborder="1" name="right" src="right.jsp" width="700px" height="500px" 
		style="position:absolute;left:100px;top:120px"></iframe>
</body>
</html>