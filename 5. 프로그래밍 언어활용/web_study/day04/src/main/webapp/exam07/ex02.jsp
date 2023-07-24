<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="10" />
<c:set var="num2" value="20" />

<c:if test="${num2 > num1}">
    num2가 num1보다 크다<br>
</c:if>
<c:if test="${num2 <= num1}">
    num2가 num1보다 작거나 같다.<br>
</c:if>

${num2 > num1 ? 'num2가 num1보다 크다' : 'num2가 num1보다 작거나 같다'}<br>