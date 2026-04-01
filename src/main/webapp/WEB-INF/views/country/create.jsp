<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Country Create</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-plus-circle"></i> Country Create</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">국가 등록</span></h1>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-7">
						<div class="card form-panel">
							<div class="card-body p-4 p-lg-5">
								<form action="./create" method="post" class="row g-4">
									<div class="col-12">
										<label class="form-label">Country ID</label>
										<input type="text" name="countryId" class="form-control" placeholder="KR">
									</div>
									<div class="col-12">
										<label class="form-label">Country Name</label>
										<input type="text" name="countryName" class="form-control" placeholder="Korea">
									</div>
									<div class="col-12 d-flex gap-2">
										<button class="btn btn-primary">Create</button>
										<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/country/list">목록으로</a>
									</div>
								</form>

								<c:if test="${not empty message}">
									<div class="alert alert-info mt-4 mb-0">${message}</div>
								</c:if>
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
