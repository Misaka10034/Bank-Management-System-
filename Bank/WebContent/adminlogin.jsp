<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>����Ա��¼</title>
</head>
<body bgcolor="#E3E3E3">
<s:form action="adlogin" method="post" theme="simple">
<table>
	<caption>����Ա��¼</caption>
	<tr>
		<td>
			�˺ţ�<s:textfield name="adminid" size="20"/>
		</td>
	</tr>
	<tr>
		<td>
			���룺<s:password name="adminpassword" size="21"/>
		</td>
	</tr>
	<tr>
		<td>
			<s:submit value="��¼"/>
			<s:reset value="����"/>
		</td>
	</tr>
</table>
</s:form>
����<a href="login.jsp">����</a>�����û���¼
</body>
</html>
