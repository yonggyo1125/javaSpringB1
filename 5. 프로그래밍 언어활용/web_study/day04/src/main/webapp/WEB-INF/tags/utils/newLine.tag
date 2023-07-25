<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="color" %>
<%@ attribute name="size" type="java.lang.Integer" required="true" %>
<div style="color: ${color};">
<c:forEach begin="1" end="${size}">-</c:forEach>
</div>