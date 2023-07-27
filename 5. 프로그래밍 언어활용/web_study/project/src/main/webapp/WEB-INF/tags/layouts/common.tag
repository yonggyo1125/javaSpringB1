<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="pageTitle" %>
<c:url var="cssUrl" value="/static/css/" />
<c:url var="jsUrl" value="/static/js/" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${pageTitle}</title>
        <%-- 공통 스타일 --%>
        <link rel="stylesheet" type="text/css" href="${cssUrl}style.css" />
        <c:if test="${addCss != null}">
        <c:forEach var="item" items="${addCss}">
            <link rel="stylesheet" type="text/css" href="${cssUrl}${item}.css">
        </c:forEach>
        </c:if>
        <%-- 공통 자바스크립트 --%>
        <script src="${jsUrl}common.js"></script>
        <c:if test="${addScript != null}">
        <c:forEach var="item" items="${addScript}">
            <script src="${jsUrl}${item}.js"></script>
        </c:forEach>
        </c:if>
    </head>
    <body>
        <header>
            <jsp:invoke fragment="header" />
        </header>
        <main>
            <jsp:doBody />
        </main>
        <footer>
            <jsp:invoke fragment="footer" />
        </footer>
        <iframe name="ifrmProcess" class="dn"></iframe>
    </body>
</html>