<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:setBundle basename="messages.commons" />
<c:if test="${sessionScope.member == null}"> <%-- 미로그인 --%>
    <c:url var="loginUrl" value="/member/login" />
    <c:url var="joinUrl" value="/member/join" />

    <a href="${joinUrl}">회원가입</a> /
    <a href="${loginUrl}">로그인</a>
</c:if>
<c:if test="${sessionScope.member != null}"> <%-- 로그인 상태 --%>
    <c:url var="logoutUrl" value="/member/logout" />
    <fmt:message key="LOGIN_MSG">
        <fmt:param>${sessionScope.member.userNm}</fmt:param>
        <fmt:param>${sessionScope.member.userId}</fmt:param>
    </fmt:message>
    /
    <a href="${logoutUrl}">로그아웃</a>
</c:if>