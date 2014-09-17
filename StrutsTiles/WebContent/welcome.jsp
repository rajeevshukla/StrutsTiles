<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

	Welcome name :
	<s:property value="dataPojo.name" />
	<s:textfield name="dataPojo.name" label="%{#dataPojo.name}"></s:textfield>

	<!-- Iterating  List Of String -->
	<s:iterator var="details" value="nameList">
		<s:property value="details" />
	</s:iterator>
	<br> Auc : ${aucList.size() }

	<!-- Iterating custom variable. -->
	<s:iterator var="auc"  value="aucList">
		<s:property value="#auc.cities" />
		
		<s:property value="#auc.aucValue" />
		  <s:iterator value="#auc.cities">
		    <s:property/>
		  </s:iterator>
		
		<br>
		<s:select list="#auc.cities"></s:select>
	</s:iterator>


Map : 
       <s:iterator value="idNameMap">
         <s:property value="key"/>
          <s:property value="value"/>
         
          <%-- <s:property value="value.name"/> --%>
       </s:iterator>
</body>
</html>