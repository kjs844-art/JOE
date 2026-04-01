<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept Detail</title>
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
					<p class="text-muted mt-3 mb-0">부서 상세 정보</p>
				</div>

				<div class="row gx-5 justify-content-center">
					<div class="col-lg-9 col-xl-8">
						<div class="card overflow-hidden shadow rounded-4 border-0">
							<div class="card-body p-4 p-md-5">
								<div class="mb-4">
									<div class="text-uppercase text-muted small fw-bolder mb-2">Department Detail Page</div>
									<h2 class="fw-bolder mb-0">${dto.departmentName}</h2>
								</div>

								<div class="table-responsive">
									<table class="table align-middle">
										<tbody>
											<tr>
												<th class="w-25">부서 번호</th>
												<td>${dto.departmentId}</td>
											</tr>
											<tr>
												<th>부서명</th>
												<td>${dto.departmentName}</td>
											</tr>
											<tr>
												<th>관리자 ID</th>
												<td>${dto.managerId}</td>
											</tr>
											<tr>
												<th>지역 ID</th>
												<td>${dto.locationId}</td>
											</tr>
										</tbody>
									</table>
								</div>

								<div class="d-flex flex-wrap gap-2 mt-4">
									<a class="btn btn-outline-dark" href="./list">목록</a>
									<a class="btn btn-primary" href="./update?departmentId=${dto.departmentId}">수정</a>
									<a class="btn btn-outline-danger" href="./delete?departmentId=${dto.departmentId}">삭제 링크</a>
									<form action="./delete" method="get" class="d-inline">
										<input type="hidden" name="departmentId" value="${dto.departmentId}">
										<button class="btn btn-danger" type="submit">DELETE</button>
									</form>
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
