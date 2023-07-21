<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="java.util.List" %>
<%
    List<String> titles = (List<String>)request.getAttribute("titles");

    for(String title : titles) {
        out.write(title + "<br>");
    }
%>

<c:forEach var="title" items="${titles}">
    ${title}<br>
</c:forEach>