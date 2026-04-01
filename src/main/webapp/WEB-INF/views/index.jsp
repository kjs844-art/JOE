<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Study Dashboard</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

		<section class="page-shell">
			<div class="container px-5">
				<div class="page-intro">
					<div class="info-badge mb-3">
						<i class="bi bi-grid-1x2-fill"></i>
						STS Project Menu
					</div>
					<h1 class="display-4 fw-bolder mb-3">
						<span class="text-gradient d-inline">Country, Dept, Student, Community</span>
					</h1>
					<p class="lead fw-light text-muted mb-0">
						수업 중 만든 패키지와 JSP 화면을 한 곳에서 바로 이동할 수 있게 정리한 시작 화면입니다.
						버튼을 누르면 목록, 등록, 로그인, 회원가입 화면으로 이동합니다.
					</p>
				</div>

				<div class="row gx-5 gy-4">
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-globe2"></i></div>
								<h3 class="h4 fw-bolder">Country</h3>
								<p class="text-muted mb-4">국가 목록 확인, 샘플 상세 화면 이동, 등록 폼 확인.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/country/list">국가 목록</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/country/create">국가 등록</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-building"></i></div>
								<h3 class="h4 fw-bolder">Dept</h3>
								<p class="text-muted mb-4">부서 목록을 테이블로 보고 상세 페이지와 등록 화면으로 이동.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/dept/list">부서 목록</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/dept/create">부서 등록</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-mortarboard"></i></div>
								<h3 class="h4 fw-bolder">Student</h3>
								<p class="text-muted mb-4">학생 점수 입력 폼을 Bootstrap 스타일로 정리한 화면입니다.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/student/add">학생 입력</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-chat-left-text"></i></div>
								<h3 class="h4 fw-bolder">Community</h3>
								<p class="text-muted mb-4">글 목록과 글 등록 폼을 바로 이동할 수 있게 묶었습니다.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/community/list">커뮤니티 목록</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/community/create">글 등록</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-person-plus"></i></div>
								<h3 class="h4 fw-bolder">Member</h3>
								<p class="text-muted mb-4">회원가입 화면과 로그인 관련 이동 경로를 한 번에 확인합니다.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/memberJoin">회원가입</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/emp/login">직원 로그인</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-6">
						<div class="card quick-card">
							<div class="card-body p-4">
								<div class="quick-icon mb-3"><i class="bi bi-people-fill"></i></div>
								<h3 class="h4 fw-bolder">Employees</h3>
								<p class="text-muted mb-4">DB 연결 상태와 직원 수 확인, 마이페이지 이동 흐름 확인.</p>
								<div class="d-grid gap-2">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/employees">직원 현황</a>
									<a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/emp/mypage">마이페이지</a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="card feature-panel mt-5">
					<div class="card-body p-5">
						<div class="row align-items-center g-4">
							<div class="col-lg-7">
								<div class="info-badge mb-3">
									<i class="bi bi-layout-text-window-reverse"></i>
									Common Layout
								</div>
								<h2 class="fw-bolder mb-3">공통 head, nav, footer를 사용하는 화면 구조</h2>
								<ul class="summary-list text-muted mb-0">
									<li><strong>head.jsp</strong>에서 Bootstrap CSS, 폰트, favicon을 공통으로 불러옵니다.</li>
									<li><strong>nav.jsp</strong>에서 메뉴 이동 링크를 통일했습니다.</li>
									<li><strong>footer.jsp</strong>에서 Bootstrap JS와 scripts.js를 공통으로 처리합니다.</li>
								</ul>
							</div>
							<div class="col-lg-5">
								<div class="rounded-4 bg-light p-4 border">
									<p class="mb-2 fw-semibold">바로가기</p>
									<div class="d-flex flex-wrap gap-2">
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/country/list">Country</a>
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/dept/list">Dept</a>
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/student/add">Student</a>
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/community/list">Community</a>
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/memberJoin">Join</a>
										<a class="btn btn-sm btn-outline-primary" href="${pageContext.request.contextPath}/employees">Employees</a>
									</div>
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
