<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />

<fmt:formatNumber value="10000" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
<br>

<fmt:setLocale value="us_en" />
<fmt:formatNumber value="100.12" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
<br>

<fmt:setLocale value="ja_jp" />
<fmt:formatNumber value="10000" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>