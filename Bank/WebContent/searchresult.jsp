<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>管理员系统</title>
</head>
<body>
<s:iterator value="#session.tagcustomer" var="customer">
	<table>
	<tr>
	<td>卡号:</td>
	<td><s:property value="#customer.id"/></td>
	<td>姓名:</td>
	<td><s:property value="#customer.name"/></td>
	<td>身份证号:</td>
	<td><s:property value="#customer.idnum"/></td>
	<td>密码:</td>
	<td><s:property value="#customer.password"/></td>
	<td>手机号:</td>
	<td><s:property value="#customer.phone"/></td>
	<td>邮箱:</td>
	<td><s:property value="#customer.eamil"/></td>
	<td>余额:</td>
	<td><s:property value="#customer.balance"/></td>
	</tr>
	</table>
	</s:iterator>
</body>
</html>
