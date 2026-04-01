<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@200;400;500;700;800&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/personal-theme.css" rel="stylesheet">
</head>
<body class="d-flex flex-column min-vh-100">
    <main class="flex-shrink-0">
        <c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>
        <c:import url="/WEB-INF/views/temp/header.jsp"></c:import>

        <section class="pb-5">
            <div class="container px-4">
                <div class="demo-card p-4 p-lg-5">
                    <div class="row g-4 align-items-center">
                        <div class="col-lg-8">
                            <h2 class="h3 fw-bolder mb-3">공통 레이아웃 적용 완료</h2>
                            <p class="text-muted mb-0">
                                이 페이지는 <code>nav.jsp</code>, <code>header.jsp</code>, <code>footer.jsp</code>를
                                조합해서 만든 메인 예제입니다. 다른 JSP에서도 같은 방식으로 재사용하면 됩니다.
                            </p>
                        </div>
                        <div class="col-lg-4 text-lg-end">
                            <a class="btn btn-primary px-4 py-3" href="${pageContext.request.contextPath}/dept/list">다음 실습으로 이동</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>

    <c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
