<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department List</title>
</head>
<body>
	<h4>부서 리스트</h4>
	<h5>Locale A</h5>

	<div>
		<a href="${pageContext.request.contextPath}/dept/create">부서등록</a>
	</div>

	<c:if test="${not empty message}">
		<p>${message}</p>
	</c:if>

	<div>
		<table border="1">
			<thead>
				<tr>
					<th>부서번호</th>
					<th>부서명</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.departmentId}</td>
						<td>
							<a href="${pageContext.request.contextPath}/dept/detail?departmentId=${d.departmentId}">
								${d.departmentName}
							</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
