<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
</head>
<body>
	<h1>Login Form Page</h1>
	<form action="${pageContext.request.contextPath}/employees/login" method="post">
		<input type="text" id="employeeId" name="employeeId" value="${submittedEmployeeId}">
		<input type="password" id="password" name="password">
		<button type="submit">Login</button>
	</form>
	<p>${loginResult}</p>
	
	
	<a href=""
</body>
</html>
