<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- [CODEX-ADD] sessionScope 기준으로 다시 정리한 index.jsp -->
	<h1>Index Page DK</h1>
	<a href="/dept/list">부서관리</a>
	<a href="/country/list">국가 관리</a>

	<!-- [CODEX-OLD] 기존 request dto / logout 경로 코드 보존
	<c:if test="${empty dto}">
		<a href="/emp/login">Login</a>
	</c:if>

	<c:if test="${not empty dto}">
		<a href="/emp.logout">Logout</a>
	</c:if>
	-->

	<c:if test="${empty sessionScope.dto}">
		<a href="/emp/login">Login</a>
	</c:if>

	<c:if test="${not empty sessionScope.dto}">
		<a href="/emp/logout">Logout</a>
		<h4>Login User: ${sessionScope.dto.firstName} ${sessionScope.dto.lastName}</h4>
		<h4>Employee ID: ${sessionScope.dto.employeeId}</h4>
		<h4>JSESSIONID: ${cookie.JSESSIONID.value}</h4>
	</c:if>

	<!-- [CODEX-OLD] 이전 index.jsp 보존
	<p>${loginError}</p>
	<ul>
		<li><a href="${pageContext.request.contextPath}/dept/list">부서관리</a></li>
		<li><a href="${pageContext.request.contextPath}/country/list">국가 관리</a></li>

		<c:if test="${empty dto}">
			<li><a href="${pageContext.request.contextPath}/emp/login">Login</a></li>
		</c:if>

		<c:if test="${not empty dto}">
			<li>Login User: ${dto.firstName} ${dto.lastName}</li>
			<li>Employee ID: ${dto.employeeId}</li>
			<li><a href="">Logout</a></li>
		</c:if>
	</ul>
	-->
</body>
</html>
