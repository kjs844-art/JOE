<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Input</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-journal-check"></i> Student Form</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">학생 점수 입력</span></h1>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-8">
						<div class="card form-panel">
							<div class="card-body p-4 p-lg-5">
								<form action="${pageContext.request.contextPath}/student/add" method="post" class="row g-4">
									<div class="col-md-6">
										<label for="name" class="form-label">Name</label>
										<input id="name" type="text" name="name" class="form-control" value="${student.name}">
									</div>
									<div class="col-md-2">
										<label for="kor" class="form-label">Korean</label>
										<input id="kor" type="number" name="kor" class="form-control" value="${student.kor}">
									</div>
									<div class="col-md-2">
										<label for="eng" class="form-label">English</label>
										<input id="eng" type="number" name="eng" class="form-control" value="${student.eng}">
									</div>
									<div class="col-md-2">
										<label for="math" class="form-label">Math</label>
										<input id="math" type="number" name="math" class="form-control" value="${student.math}">
									</div>
									<div class="col-12 d-flex gap-2">
										<button type="submit" class="btn btn-primary">Submit</button>
										<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/">홈으로</a>
									</div>
								</form>

								<c:if test="${not empty message}">
									<div class="alert alert-success mt-4 mb-0">${message}</div>
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
