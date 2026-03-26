<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country List</title>
</head>
<body>
	<h1>Country List</h1>
	<%-- CountryListController가 request.setAttribute("countries", countries) 로 넘긴 데이터를 받는다. --%>
	<table border="1">
		<tr>
			<th>Country ID</th>
			<th>Country Name</th>
		</tr>
		<c:forEach var="country" items="${countries}">
			<%-- ${countries} 안의 CountryDTO 하나씩을 country 변수로 꺼내서 반복 출력한다. --%>
			<tr>
				<td>${country.countryId}</td>
				<td>${country.countryName}</td>
				<%-- DTO의 getter 값이 JSP EL로 화면에 출력된다. --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
