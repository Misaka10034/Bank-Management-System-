<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<s:head />
</head>
<body>
	<h3>修改用户信息</h3>
<body bgcolor="#E3E3E3">
	<s:form action="modify" method="post" theme="simple">
		<table>
			<tr>
				<td>密码：</td>
				<td><s:textfield name="customer.password"></s:textfield></td>
			</tr>
			<tr>
				<td>手机号：</td>
				<td><s:textfield name="customer.phone"></s:textfield></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><s:textfield name="customer.eamil"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="修改"></s:submit></td>
				<td><s:reset value="重置"></s:reset></td>
			</tr>
		</table>
	</s:form>
</body>
</html>