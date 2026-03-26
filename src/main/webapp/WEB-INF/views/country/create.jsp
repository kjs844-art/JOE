<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country Create</title>
</head>
<body>
	<h1>Country Create</h1>
	<form action="${pageContext.request.contextPath}/country/create" method="post">
		<%-- create.jsp에서 입력한 값은 CountryCreateController.doPost()로 전송된다. --%>
		<div>
			<label for="countryId">Country ID</label>
			<input id="countryId" type="text" name="countryId">
			<%-- name="countryId" 는 request.getParameter("countryId") 와 연결된다. --%>
		</div>
		<div>
			<label for="countryName">Country Name</label>
			<input id="countryName" type="text" name="countryName">
			<%-- name="countryName" 는 request.getParameter("countryName") 와 연결된다. --%>
		</div>
		<button type="submit">Create</button>
		<%-- 버튼을 누르면 DB INSERT 후 성공 시 /country/list 로 redirect 된다. --%>
	</form>
	<c:if test="${not empty message}">
		<p>${message}</p>
		<%-- 등록 실패나 오류 메시지가 있을 때만 화면에 출력된다. --%>
	</c:if>
</body>
</html>
