<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Create</title>
</head>
<body>
	<h3>부서 등록 페이지</h3>

	<form action="${pageContext.request.contextPath}/dept/create" method="post">
		<div>
			<label for="departmentName">부서명</label>
			<input id="departmentName" type="text" name="departmentName" value="${dto.departmentName}">
		</div>

		<div>
			<label for="managerId">관리자코드</label>
			<input id="managerId" type="text" name="managerId" value="${dto.managerId}">
		</div>

		<div>
			<label for="locationId">지역코드</label>
			<input id="locationId" type="text" name="locationId" value="${dto.locationId}">
		</div>

		<button type="submit">button</button>
		<input type="submit" value="create">
		<input type="button" value="등록">
		<input type="reset" value="reset">
	</form>

	<c:if test="${not empty message}">
		<p>${message}</p>
	</c:if>
</body>
</html>
