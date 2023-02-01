<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table style="border: 2px">
	
	<tr>
		<th>ID</th>
		<th>Email</th>
		<th>Password</th>
		<th>Name</th>
		<th>Action</th>
	</tr>
	
	<c:forEach items="${allusers }">
	
	<tr>
		<td>${user.id }</td>
		<td>${ user.email}</td>
		<td>${user.password }</td>
		<td>${user.name }</td>
		<td><a href="deleteUser?id=${user.id}"> <input type="submit" value="delete"> </a></td>
	</tr>
	
	</c:forEach>
	
	
	</table>
	
</body>
</html>