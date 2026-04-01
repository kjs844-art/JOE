<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-person-badge"></i> My Page</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">직원 마이페이지</span></h1>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-7">
						<div class="card feature-panel">
							<div class="card-body p-4 p-lg-5">
								<div class="row g-4">
									<div class="col-md-4">
										<div class="border rounded-4 p-3 h-100">
											<div class="text-muted small mb-1">Employee ID</div>
											<div class="fw-bold">${dto.employeeId}</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="border rounded-4 p-3 h-100">
											<div class="text-muted small mb-1">First Name</div>
											<div class="fw-bold">${dto.firstName}</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="border rounded-4 p-3 h-100">
											<div class="text-muted small mb-1">Hire Date</div>
											<div class="fw-bold">${dto.hireDate}</div>
										</div>
									</div>
								</div>
								<div class="mt-4 d-flex flex-wrap gap-2">
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/employees">직원 현황</a>
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/emp/logout">로그아웃</a>
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
