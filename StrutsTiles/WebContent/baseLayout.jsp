<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
	<table>
		<tr height="100" style="background-color: red;">
			<td><tiles:insertAttribute name="header"></tiles:insertAttribute>
			</td>
		</tr>
		<tr>
			<td height="300"><tiles:insertAttribute name="body"></tiles:insertAttribute>
			</td>

		</tr>

		<tr>
			<td height="100"><tiles:insertAttribute name="footer"></tiles:insertAttribute>


			</td>
		</tr>



	</table>


</body>
</html>