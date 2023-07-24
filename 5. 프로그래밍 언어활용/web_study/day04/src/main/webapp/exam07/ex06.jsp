<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:catch var="e">
<%
    String str = null;
    str = str.toUpperCase();
%>
<%=str%>
</c:catch>
<c:if test="${e != null}">
    예외 발생 : ${e.message}<br>
</c:if>