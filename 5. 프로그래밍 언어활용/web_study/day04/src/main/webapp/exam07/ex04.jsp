<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="i" begin="1" end="10" step="2">
    <h1>${i}.반복</h1>
</c:forEach>

<c:forEach var="item" items="Apple,Banana,Melon">
${item}<br>
</c:forEach>