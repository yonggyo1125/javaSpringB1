<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="html" value="<script>alert('확인');</script>" />
<c:out value="${html}" escapeXml="false" />