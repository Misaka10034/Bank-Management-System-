<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>客户登录</title>
</head>
<body bgcolor="#E3E3E3">
<s:form action="login" method="post" theme="simple">
<table>
	<caption>用户登录</caption>
	
	<tr>
		<td>
			账号：<s:textfield name="customer.id" size="20"/>
		</td>
	</tr>
	<tr>
		<td>
			密码：<s:password name="customer.password" size="21"/>
		</td>
	</tr>
	<tr>
		<td>
			<s:submit value="登录"/>
			<s:reset value="重置"/>
		</td>
	</tr>
</table>
</s:form>
如果没开户单击<a href="register.jsp">这里</a>开户<br>
管理员登陆单击<a href="adminlogin.jsp">这里</a>登录
</body>
</html>
