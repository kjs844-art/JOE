<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Community Create</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3"><i class="bi bi-pencil-square"></i> Form POST</div>
					<h1 class="display-5 fw-bolder mb-3"><span class="text-gradient d-inline">커뮤니티 글 등록</span></h1>
					<p class="lead fw-light text-muted mb-0">폼 데이터를 POST 방식으로 전송하는 화면입니다. 제목, 작성자, 내용, 중요도를 입력한 뒤 등록할 수 있습니다.</p>
				</div>

				<div class="row justify-content-center">
					<div class="col-lg-8">
						<div class="card form-panel">
							<div class="card-body p-4 p-lg-5">
								<c:if test="${not empty message}">
									<div class="alert alert-danger">${message}</div>
								</c:if>

								<form action="${pageContext.request.contextPath}/community/create" method="post" class="row g-4">
									<div class="col-12">
										<label class="form-label">제목</label>
										<input type="text" name="title" class="form-control form-control-lg" placeholder="글 제목 입력" required>
									</div>
									<div class="col-md-6">
										<label class="form-label">작성자</label>
										<input type="text" name="name" class="form-control" placeholder="작성자 이름" required>
									</div>
									<div class="col-md-6">
										<label class="form-label">중요도</label>
										<input type="number" name="star" class="form-control" min="1" max="5" value="3">
									</div>
									<div class="col-12">
										<label class="form-label">내용</label>
										<textarea name="contents" class="form-control" rows="8" placeholder="내용을 입력하세요"></textarea>
									</div>
									<div class="col-12 d-flex flex-wrap gap-2">
										<button type="submit" class="btn btn-primary btn-lg">등록하기</button>
										<a href="${pageContext.request.contextPath}/community/list" class="btn btn-outline-dark btn-lg">목록으로</a>
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
