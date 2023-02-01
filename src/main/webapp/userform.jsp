<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to our page.................</title>
</head>
<body>
	
	<form:form action="saveUser" modelAttribute="user">
	
	Id <form:input path="id"/> <br>
	Email <form:input path="email"/> <br>
	Password <form:input path="password"/> <br>
	Name <form:input path="name"/> <br>
		
	<input type="submit">
	</form:form>
	
</body>
</html>