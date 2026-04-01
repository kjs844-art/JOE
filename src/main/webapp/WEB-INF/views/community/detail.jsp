<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Community Detail</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="d-flex flex-wrap justify-content-between align-items-center gap-3 mb-4">
					<div>
						<div class="info-badge mb-2"><i class="bi bi-file-text"></i> Detail</div>
						<h1 class="fw-bolder mb-1">커뮤니티 상세보기</h1>
					</div>
					<a href="${pageContext.request.contextPath}/community/list" class="btn btn-outline-dark">목록으로</a>
				</div>

				<c:if test="${not empty message}">
					<div class="alert alert-danger">${message}</div>
				</c:if>

				<c:if test="${not empty dto}">
					<div class="card form-panel">
						<div class="card-body p-4">
							<table class="table align-middle mb-0">
								<tr>
									<th class="w-25">글번호</th>
									<td>${dto.no}</td>
								</tr>
								<tr>
									<th>제목</th>
									<td>${dto.title}</td>
								</tr>
								<tr>
									<th>작성자</th>
									<td>${dto.name}</td>
								</tr>
								<tr>
									<th>내용</th>
									<td style="white-space: pre-wrap">${dto.contents}</td>
								</tr>
								<tr>
									<th>작성시간</th>
									<td>${dto.regDate}</td>
								</tr>
								<tr>
									<th>중요도</th>
									<td><span class="badge text-bg-primary">${dto.star}</span></td>
								</tr>
							</table>
						</div>
					</div>
				</c:if>
			</div>
		</section>
	</main>
	<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>
