<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 상세</title>
</head>
<body>
    <h2>커뮤니티 상세보기</h2>

    <c:if test="${not empty message}">
        <p style="color:red">${message}</p>
    </c:if>

    <%--
        ${dto.xxx} 는 CommunityDetailController 가 request.setAttribute("dto", dto) 로
        넘겨준 Community 객체의 getter 를 호출한다.
        예) ${dto.title} → dto.getTitle() 을 자동으로 호출
    --%>
    <c:if test="${not empty dto}">
        <table border="1" cellpadding="8">
            <tr>
                <th>글번호</th>
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
                <td>${dto.star}</td>
            </tr>
        </table>
    </c:if>

    <br>
    <a href="${pageContext.request.contextPath}/community/list">목록으로</a>
</body>
</html>
