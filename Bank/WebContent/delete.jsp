<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>管理员系统</title>
</head>
<body>
	<s:form action="delete" method="post" theme="simple">
		<table>
			<tr>
				<td>销户id:</td>
				<td><s:textfield name="customer.id"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="提交"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
