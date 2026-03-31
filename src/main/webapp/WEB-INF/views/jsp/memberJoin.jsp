<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<!-- 브라우저 탭 제목 -->
</head>
<body>
    <h1>회원가입 페이지</h1>
    <!-- 화면 상단 제목 -->

    <form action="<%=request.getContextPath()%>/memberJoin" method="post">
        <!-- 입력값을 /memberJoin 서블릿으로 POST 방식 전송 -->

        아이디 : <input type="text" name="userId" placeholder="아이디"><br>
        <!-- 아이디 입력칸, 서블릿에서 userId로 받음 -->

        비밀번호 : <input type="password" name="password" placeholder="비밀번호"><br>
        <!-- 비밀번호 입력칸, 서블릿에서 password로 받음 -->

        이름 : <input type="text" name="name" placeholder="이름"><br>
        <!-- 이름 입력칸, 서블릿에서 name으로 받음 -->

        이메일 : <input type="text" name="email" placeholder="이메일"><br>
        <!-- 이메일 입력칸, 서블릿에서 email로 받음 -->

        <button type="submit">회원가입</button>
        <!-- 버튼을 누르면 폼 데이터가 서블릿으로 전달됨 -->
    </form>
</body>
</html>
