<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>ex08.jsp - 상단</h1>
<c:import url="https://www.naver.com" />
<c:import url="ex09.jsp">
    <c:param name="key1" value="value1" />
    <c:param name="key2" value="value2" />
</c:import>




<h1>ex08.jsp - 하단</h1>