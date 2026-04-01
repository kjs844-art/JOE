<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept Create</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="py-5">
			<div class="container px-5 mb-5">
				<div class="text-center mb-5">
					<h1 class="display-5 fw-bolder mb-0">
						<span class="text-gradient d-inline">Projects</span>
					</h1>
					<p class="text-muted mt-3 mb-0">부서 등록</p>
				</div>

				<div class="row gx-5 justify-content-center">
					<div class="col-lg-9 col-xl-8">
						<div class="card overflow-hidden shadow rounded-4 border-0">
							<div class="card-body p-4 p-md-5">
								<div class="mb-4">
									<div class="text-uppercase text-muted small fw-bolder mb-2">Department Create Form</div>
									<h2 class="fw-bolder mb-0">새 부서 입력</h2>
								</div>

								<form action="./create" method="post" class="row g-3">
									<div class="col-md-6">
										<label class="form-label">부서명</label>
										<input type="text" name="departmentName" class="form-control" placeholder="부서명 입력" required>
									</div>
									<div class="col-md-3">
										<label class="form-label">관리자 ID</label>
										<input type="text" name="managerId" class="form-control" placeholder="숫자 입력">
									</div>
									<div class="col-md-3">
										<label class="form-label">지역 ID</label>
										<input type="text" name="locationId" class="form-control" placeholder="지역 번호">
									</div>
									<div class="col-12 d-flex flex-wrap gap-2 mt-3">
										<button type="submit" class="btn btn-primary">등록</button>
										<input type="reset" value="초기화" class="btn btn-outline-secondary">
										<a href="./list" class="btn btn-outline-dark">목록</a>
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
