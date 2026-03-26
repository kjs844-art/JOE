<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Detail</title>
</head>
<body>
	<h1>DEPT Detail Page</h1>

	<c:choose>
		<c:when test="${not empty dto}">
			<h4>${dto.departmentId}</h4>
			<h4>${dto.departmentName}</h4>
			<h4>${dto.managerId}</h4>
			<h4>${dto.locationId}</h4>
		</c:when>
		<c:otherwise>
			<p>조회된 부서 정보가 없습니다.</p>
		</c:otherwise>
	</c:choose>

	<div>
		<a href="${pageContext.request.contextPath}/dept/list">목록으로</a>
	</div>
</body>
</html>
