<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country Detail</title>
</head>
<body>
	<h1>Country Detail</h1>
	<%-- CountryDetailController가 request.setAttribute("country", country) 로 넘긴 1건 데이터를 받는다. --%>
	<c:choose>
		<c:when test="${not empty country}">
			<%-- 상세 조회 성공 시 country 객체 안의 값을 출력한다. --%>
			<p>ID: ${country.countryId}</p>
			<p>Name: ${country.countryName}</p>
		</c:when>
		<c:otherwise>
			<p>No country data.</p>
			<%-- countryId에 해당하는 데이터가 없으면 이 문장이 보인다. --%>
		</c:otherwise>
	</c:choose>
</body>
</html>
