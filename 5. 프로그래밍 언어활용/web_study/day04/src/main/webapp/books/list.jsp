<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<table border="1">
    <thead>
        <tr>
            <th>순번</th>
            <th>제목</th>
            <th>저자</th>
            <th>출판사</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${books}" varStatus="status">
        <tr>
            <td>
                ${status.count}<br>
                ${status.first ? "처음":""}
                ${status.last ? "마지막":""}
             </td>
            <td>${item.title}</td>
            <td>${status.current.author}</td>
            <td>${item.publisher}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>