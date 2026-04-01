<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country Detail</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="row justify-content-center">
					<div class="col-lg-7">
						<div class="card feature-panel">
							<div class="card-body p-4 p-lg-5">
								<div class="info-badge mb-3"><i class="bi bi-search"></i> Country Detail</div>
								<h1 class="fw-bolder mb-4">국가 상세</h1>
								<div class="row g-3">
									<div class="col-md-6">
										<div class="border rounded-4 p-3">
											<div class="text-muted small">Country ID</div>
											<div class="fw-bold">${country.countryId}</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="border rounded-4 p-3">
											<div class="text-muted small">Country Name</div>
											<div class="fw-bold">${country.countryName}</div>
										</div>
									</div>
								</div>
								<div class="mt-4">
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/country/list">목록으로</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>
