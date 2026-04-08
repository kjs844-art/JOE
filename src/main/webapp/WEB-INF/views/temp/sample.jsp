<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Page</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body id="page-top">

    <!-- Page Wrapper: 페이지 전체를 감싸는 가장 바깥 영역 -->
    <div id="wrapper">

        <!-- Content Wrapper: 본문과 footer를 함께 감싸는 영역 -->
        <div id="content-wrapper" class="d-flex flex-column min-vh-100">

            <!-- Main Content: 상단 nav 아래에 보이는 실제 본문 영역 -->
            <div id="content">

                <c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

                <!-- Begin Page Content: 현재 페이지 내용이 시작되는 위치 -->
                <div class="container-fluid">
                    <div class="card shadow-sm border-0 my-5">
                        <div class="card-body p-5">
                            <h1 class="fw-bolder mb-0">4가</h1>
                        </div>
                    </div>
                </div>
                <!-- End Page Content: 현재 페이지 내용이 끝나는 위치 -->

            </div>
            <!-- End of Main Content: 메인 본문 영역 종료 -->

            <!-- Footer Include: 공통 footer.jsp를 불러오는 위치 -->
            <c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>

        </div>
        <!-- End of Content Wrapper: content-wrapper 영역 종료 -->

    </div>
    <!-- End of Page Wrapper: wrapper 영역 종료 -->

</body>
</html>
