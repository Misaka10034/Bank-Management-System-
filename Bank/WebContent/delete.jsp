<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>����Աϵͳ</title>
</head>
<body>
	<s:form action="delete" method="post" theme="simple">
		<table>
			<tr>
				<td>����id:</td>
				<td><s:textfield name="customer.id"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="�ύ"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
