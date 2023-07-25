<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%
    String[] fruits = { "사과", "배", "오렌지", "멜론" };
%>
<c:set var="fruits" value="<%=fruits%>" />
${fn:join(fruits, ",")}

<c:set var="books" value="책1#책2#책3#책4" />

<c:forEach var="item" items="${fn:split(books, '#')}">
${item}<br>
</c:forEach>
