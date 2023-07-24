<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forTokens var="item" items="사과,배#멜론#오렌지" delims="#,">
    ${item}<br>
</c:forTokens>