<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country List</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="d-flex flex-wrap justify-content-between align-items-center gap-3 mb-4">
					<div>
						<div class="info-badge mb-2"><i class="bi bi-globe2"></i> Country</div>
						<h1 class="fw-bolder mb-1">국가 목록</h1>
						<p class="text-muted mb-0">샘플 데이터로 국가 ID와 국가명을 확인합니다.</p>
					</div>
					<div class="d-flex gap-2">
						<a href="${pageContext.request.contextPath}/country/create" class="btn btn-primary">국가 등록</a>
						<a href="${pageContext.request.contextPath}/country/detail" class="btn btn-outline-dark">상세 샘플</a>
					</div>
				</div>

				<div class="card form-panel">
					<div class="card-body p-4">
						<div class="table-responsive">
							<table class="table table-hover align-middle mb-0">
								<thead>
									<tr>
										<th>Country ID</th>
										<th>Country Name</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="country" items="${countries}">
										<tr>
											<td>${country.countryId}</td>
											<td>${country.countryName}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>
