<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>�ͻ���¼</title>
</head>
<body bgcolor="#E3E3E3">
<s:form action="login" method="post" theme="simple">
<table>
	<caption>�û���¼</caption>
	
	<tr>
		<td>
			�˺ţ�<s:textfield name="customer.id" size="20"/>
		</td>
	</tr>
	<tr>
		<td>
			���룺<s:password name="customer.password" size="21"/>
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
���û��������<a href="register.jsp">����</a>����<br>
����Ա��½����<a href="adminlogin.jsp">����</a>��¼
</body>
</html>
