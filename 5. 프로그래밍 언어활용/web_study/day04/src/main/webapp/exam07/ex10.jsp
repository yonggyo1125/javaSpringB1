<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<a href="<%=request.getContextPath()%>/exam07/ex09.jsp">ex09.jsp</a>
<a href="${pageContext.request.contextPath}/exam07/ex09.jsp">ex09.jsp</a>
<br>
<a href="<c:url value="/exam07/ex09.jsp" />">ex09.jsp</a>
<br>
<c:url var="link1" value="/exam07/ex09.jsp">
    <c:param name="key1" value="value1" />
</c:url>
<a href="${link1}">ex09.jsp</a>