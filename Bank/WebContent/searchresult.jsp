<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>����Աϵͳ</title>
</head>
<body>
<s:iterator value="#session.tagcustomer" var="customer">
	<table>
	<tr>
	<td>����:</td>
	<td><s:property value="#customer.id"/></td>
	<td>����:</td>
	<td><s:property value="#customer.name"/></td>
	<td>���֤��:</td>
	<td><s:property value="#customer.idnum"/></td>
	<td>����:</td>
	<td><s:property value="#customer.password"/></td>
	<td>�ֻ���:</td>
	<td><s:property value="#customer.phone"/></td>
	<td>����:</td>
	<td><s:property value="#customer.eamil"/></td>
	<td>���:</td>
	<td><s:property value="#customer.balance"/></td>
	</tr>
	</table>
	</s:iterator>
</body>
</html>
