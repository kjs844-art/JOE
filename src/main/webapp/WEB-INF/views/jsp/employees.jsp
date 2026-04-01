<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-database-check"></i> Employees</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">직원 현황 확인</span></h1>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-8">
						<div class="card feature-panel">
							<div class="card-body p-4 p-lg-5">
								<div class="row g-4">
									<div class="col-md-6">
										<div class="border rounded-4 p-4 h-100">
											<div class="text-muted small mb-2">DB Status</div>
											<div class="fw-semibold">${dbStatus}</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="border rounded-4 p-4 h-100">
											<div class="text-muted small mb-2">EMPLOYEES Count</div>
											<div class="display-6 fw-bolder">${employeeCount}</div>
										</div>
									</div>
								</div>
								<div class="mt-4 d-flex flex-wrap gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/emp/login">로그인</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/emp/mypage">마이페이지</a>
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
