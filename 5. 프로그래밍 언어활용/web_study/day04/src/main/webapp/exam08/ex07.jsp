<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:setLocale value="ko" />
<fmt:setBundle basename="messages.commons" />

<fmt:message key="TITLE" /><br>
<fmt:message key="EMAIL" /><br>

<fmt:message key="LOGIN_MSG">
    <fmt:param>사용자01</fmt:param>
    <fmt:param>user01</fmt:param>
</fmt:message>

