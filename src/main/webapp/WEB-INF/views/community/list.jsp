<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 목록</title>
</head>
<body>
    <h2>커뮤니티 목록</h2>

    <a href="${pageContext.request.contextPath}/community/create">글 등록</a>
    <hr>

    <c:if test="${not empty message}">
        <p style="color:red">${message}</p>
    </c:if>

    <%--
        c:forEach : list 에 담긴 Community 객체를 하나씩 꺼내서 반복 출력한다.
        var="dto" 로 꺼낸 객체를 dto 라는 이름으로 사용한다.
    --%>
    <table border="1" cellpadding="8">
        <thead>
            <tr>
                <th>글번호</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성시간</th>
                <th>중요도</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="dto">
                <tr>
                    <td>${dto.no}</td>
                    <td>
                        <%-- 제목 클릭 → 상세 페이지로 이동 --%>
                        <a href="${pageContext.request.contextPath}/community/detail?no=${dto.no}">
                            ${dto.title}
                        </a>
                    </td>
                    <td>${dto.name}</td>
                    <td>${dto.regDate}</td>
                    <td>${dto.star}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
