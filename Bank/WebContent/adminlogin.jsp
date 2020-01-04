<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>管理员登录</title>
</head>
<body bgcolor="#E3E3E3">
<s:form action="adlogin" method="post" theme="simple">
<table>
	<caption>管理员登录</caption>
	<tr>
		<td>
			账号：<s:textfield name="adminid" size="20"/>
		</td>
	</tr>
	<tr>
		<td>
			密码：<s:password name="adminpassword" size="21"/>
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
单击<a href="login.jsp">这里</a>返回用户登录
</body>
</html>
