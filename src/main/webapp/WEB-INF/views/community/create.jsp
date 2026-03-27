<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 등록</title>
</head>
<body>
    <h2>커뮤니티 글 등록</h2>

    <%-- 에러 메시지가 있으면 표시 --%>
    <% if (request.getAttribute("message") != null) { %>
        <p style="color:red">${message}</p>
    <% } %>

    <%--
        form action : 이 폼의 데이터가 어느 URL 로 전송될지 지정한다.
        method="post" : 본문에 데이터를 담아 보낸다. (URL에 안 드러남)
    --%>
    <form action="${pageContext.request.contextPath}/community/create" method="post">

        <p>
            <label>제목</label><br>
            <input type="text" name="title" size="50" required>
        </p>
        <p>
            <label>작성자</label><br>
            <input type="text" name="name" size="30" required>
        </p>
        <p>
            <label>내용</label><br>
            <textarea name="contents" rows="7" cols="60"></textarea>
        </p>
        <p>
            <label>중요도 (1~5)</label><br>
            <input type="number" name="star" min="1" max="5" value="3">
        </p>

        <button type="submit">등록</button>
        <a href="${pageContext.request.contextPath}/community/list">목록으로</a>
    </form>
</body>
</html>
