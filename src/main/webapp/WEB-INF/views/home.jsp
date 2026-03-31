<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Index Page JH</h1>
	<!-- 홈 화면 제목 -->

	<a href="<%=request.getContextPath()%>/comm/list">전달 사항 리스트</a>
	<!-- 전달사항 리스트 페이지로 이동 -->

	<a href="<%=request.getContextPath()%>/emp/login">로그인</a>
	<!-- 로그인 페이지로 이동 -->

	<a href="<%=request.getContextPath()%>/memberJoin">회원가입</a>
	<!-- 회원가입 페이지로 이동 -->
</body>
</html>
