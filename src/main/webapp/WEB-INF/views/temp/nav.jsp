<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<nav class="navbar navbar-expand-lg navbar-light bg-white py-3">
	<div class="container px-5">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/"><span
			class="fw-bolder text-primary">Start Bootstrap</span></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0 small fw-bolder">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/country/list">Country</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/dept/list">Dept</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/student/add">Student</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/community/list">Community</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/memberJoin">Member Join</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/employees">Employees</a></li>
				<c:if test="${empty dto}">
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/emp/login">Login</a></li>
				</c:if>
				<c:if test="${not empty dto}">
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/emp/mypage">MyPage</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/emp/logout">Logout</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>
