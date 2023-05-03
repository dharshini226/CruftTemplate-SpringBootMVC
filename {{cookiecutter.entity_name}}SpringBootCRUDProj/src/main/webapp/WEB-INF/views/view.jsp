<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>{{cookiecutter.entity_name}} View Page</title>
</head>
<body>

<h2>Welcome to {{cookiecutter.entity_name}} View Page</h2>

<table border=2>

<tr>
	<th>Id</th>
	<td>${emp.id}</td>
</tr>
<tr>
	<th>{{cookiecutter.attribute1}}</th>
	<td>${emp.{{cookiecutter.attribute1}}}</td>
</tr>
<tr>
	<th>{{cookiecutter.attribute2}}</th>
	<td>${emp.{{cookiecutter.attribute2}}}</td>
</tr>
<tr>
	<th>{{cookiecutter.attribute3}}</th>
	<td>${emp.{{cookiecutter.attribute3}}}</td>
</tr>

<tr>
	<th>Delete</th>
	<td>
		<a href="/{{cookiecutter.entity_name}}SpringBootCRUDProj/delete?id=${emp.id}">Delete</a>
	</td>
</tr>
<tr>
	<th>Update</th>
	<td>
		<a href="/{{cookiecutter.entity_name}}SpringBootCRUDProj/getUpdate?id=${emp.id}">Update</a>
	</td>
</tr>

</table>

<a href="/{{cookiecutter.entity_name}}SpringBootCRUDProj/all">View All</a> &nbsp;
<a href="/{{cookiecutter.entity_name}}SpringBootCRUDProj/reg">Register</a> &nbsp;
<a href="/{{cookiecutter.entity_name}}SpringBootCRUDProj/">Home</a>

${msg}

</body>
</html>