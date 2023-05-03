<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>{{cookiecutter.entity_name}} Data Page</title>
</head>
<body>

	<h2>Welcome To {{cookiecutter.entity_name}} Data Page</h2>

	<c:if test="${empty list}">
		<h4>No Data Found</h4>
	</c:if>


	<c:if test="${!empty list}">

		<table border=2>
			<tr>
				<th>Id</th>
				<th>{{cookiecutter.attribute1}}</th>
				<th>{{cookiecutter.attribute2}}</th>
				<th>{{cookiecutter.attribute3}}</th>
			</tr>

			<c:forEach items="${list}" var="ob">
				<tr>
					<td>${ob.id}</td>
					<td>${ob.{{cookiecutter.attribute1}}}</td>
					<td>${ob.{{cookiecutter.attribute2}}}</td>
					<td>${ob.{{cookiecutter.attribute3}}}</td>
					<td><a href="/{{cookiecutter.entity_name}}CrudSpringBoot/view?id=${ob.id}">View</a></td>
				</tr>
			</c:forEach>

		</table>

	</c:if>

	<a href="/{{cookiecutter.entity_name}}CrudSpringBoot/reg">Register</a> ${msg} &nbsp;
	<a href="/{{cookiecutter.entity_name}}CrudSpringBoot/">Home</a> ${msg}

</body>
</html>