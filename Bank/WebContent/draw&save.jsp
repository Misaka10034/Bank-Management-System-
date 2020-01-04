<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>存取款</title>
</head>
<body>
	<s:iterator value="#session.tagcustomer" var="customer">		
		<table>
			<tr>
				<td>当前账户余额为:(存取款后请刷新一次页面)</td>
				<td><s:property value="#customer.balance"/></td>
			</tr>
			</table>
		</s:iterator>
		<s:form action="draw" method="post" theme="simple">
			<table>
			<tr>
				<td>存取款数额:(正数为存款,负数为取款)</td>
				<td><s:textfield name="balancechange.change"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="提交"></s:submit></td>
			</tr>
			</table>
		</s:form>
	
</body>
</html>