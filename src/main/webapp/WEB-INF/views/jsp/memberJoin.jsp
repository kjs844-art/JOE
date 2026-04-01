<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Join</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-person-plus-fill"></i> Member Join</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">회원가입</span></h1>
					<p class="lead fw-light text-muted mb-0">폼 입력값을 POST 방식으로 전송해서 회원가입을 처리하는 화면입니다.</p>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-8">
						<div class="card form-panel">
							<div class="card-body p-4 p-lg-5">
								<form action="${pageContext.request.contextPath}/memberJoin" method="post" class="row g-4">
									<div class="col-md-6">
										<label class="form-label">아이디</label>
										<input type="text" name="userId" class="form-control" placeholder="아이디 입력" required>
									</div>
									<div class="col-md-6">
										<label class="form-label">비밀번호</label>
										<input type="password" name="password" class="form-control" placeholder="비밀번호 입력" required>
									</div>
									<div class="col-md-6">
										<label class="form-label">이름</label>
										<input type="text" name="name" class="form-control" placeholder="이름 입력" required>
									</div>
									<div class="col-md-6">
										<label class="form-label">이메일</label>
										<input type="email" name="email" class="form-control" placeholder="email@example.com" required>
									</div>
									<div class="col-12 d-flex flex-wrap gap-2">
										<button type="submit" class="btn btn-primary btn-lg">회원가입</button>
										<a href="${pageContext.request.contextPath}/" class="btn btn-outline-dark btn-lg">홈으로</a>
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
