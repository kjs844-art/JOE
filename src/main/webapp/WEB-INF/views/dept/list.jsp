<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept List</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="d-flex flex-wrap justify-content-between align-items-center gap-3 mb-4">
					<div>
						<div class="info-badge mb-2"><i class="bi bi-building"></i> Dept</div>
						<h1 class="fw-bolder mb-1">부서 목록</h1>
						<p class="text-muted mb-0">부서 번호와 이름을 확인하고 상세 페이지로 이동할 수 있습니다.</p>
					</div>
					<a href="./create" class="btn btn-primary">부서 등록</a>
				</div>

				<div class="card form-panel">
					<div class="card-body p-4">
						<div class="table-responsive">
							<table class="table table-hover align-middle mb-0">
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
											<td><a class="fw-semibold text-decoration-none" href="./detail?departmentId=${d.departmentId}">${d.departmentName}</a></td>
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
