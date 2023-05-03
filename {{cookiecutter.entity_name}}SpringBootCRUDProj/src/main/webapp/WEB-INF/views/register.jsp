<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>{{cookiecutter.entity_name}} Register/Edit Page</title>
</head>
<body>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<h3>Welcome to {{cookiecutter.entity_name}} Edit Page</h3>
		<c:set var="eid"  value="${id}" ></c:set>
	</c:when>
	<c:otherwise>
		<h3>Welcome to {{cookiecutter.entity_name}} Registration Page</h3>
	</c:otherwise>
</c:choose>

<pre>
<form:form action="save" method="post" modelAttribute="employee">

<c:if test="${'edit' eq mode }">
Id     : <form:input path="id"  readOnly="true"/>	
</c:if>

{{cookiecutter.attribute1}}     : <form:input path="{{cookiecutter.attribute1}}"/>

{{cookiecutter.attribute2}}   	 : <form:input path="{{cookiecutter.attribute2}}"/>

{{cookiecutter.attribute3}}   : <form:input path="{{cookiecutter.attribute3}}"/>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<input type="submit" value="Update {{cookiecutter.entity_name}}">
	</c:when>
	<c:otherwise>
		<input type="submit" value="Register {{cookiecutter.entity_name}}">
	</c:otherwise>
</c:choose>

</form:form>

</pre>

${msg}

<a href="/{{cookiecutter.entity_name}}CrudSpringBoot/all">Show All</a> &nbsp;
<a href="/{{cookiecutter.entity_name}}CrudSpringBoot/">Home</a>



</body>
</html>