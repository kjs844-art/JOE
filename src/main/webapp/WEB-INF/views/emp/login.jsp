<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Employee Login</title>
	<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-shield-lock"></i> Login</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">직원 로그인</span></h1>
					<p class="lead fw-light text-muted mb-0">사번과 비밀번호를 입력한 뒤 로그인하면 마이페이지로 이동합니다.</p>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-6">
						<div class="card form-panel">
							<div class="card-body p-4 p-lg-5">
								<form action="./login" method="post" class="row g-4">
									<div class="col-12">
										<label class="form-label">Employee ID</label>
										<input type="text" name="employeeId" class="form-control form-control-lg" placeholder="사번 입력" required>
									</div>
									<div class="col-12">
										<label class="form-label">Password</label>
										<input type="password" name="password" class="form-control form-control-lg" placeholder="비밀번호 입력" required>
									</div>
									<div class="col-12 d-grid">
										<button class="btn btn-primary btn-lg">Login</button>
									</div>
								</form>
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
