<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="100" scope="page" />
<c:set var="num1" value="200" scope="request" />
<c:set var="num1" value="300" scope="application" />
<c:remove var="num1" scope="application" />
${pageScope.num1}<br>
${requestScope.num1}<br>
${applicationScope.num1}<br>
${pageScope.num1 + requestScope.num1}<br>