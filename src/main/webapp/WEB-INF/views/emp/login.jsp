<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- [CODEX-ADD] 선생님 GitHub 화면 기준 login.jsp -->
	<h1>Login Form Page</h1>
	<form action="./login" method="post">
		<input type="text" name="employeeId">
		<input type="password" name="password">
		<button>Login</button>
	</form>

	<!-- [CODEX-OLD]
	<form action="${pageContext.request.contextPath}/emp/login" method="post">
		<input type="text" name="employeeId">
		<input type="password" name="password">
		<button>Login</button>
	</form>
	-->
</body>
</html>
