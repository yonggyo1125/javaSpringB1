<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.time.*" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<%
    LocalDateTime today = LocalDateTime.now();
    pageContext.setAttribute("today", today);
%>
<util:formatDate value="${today}" />