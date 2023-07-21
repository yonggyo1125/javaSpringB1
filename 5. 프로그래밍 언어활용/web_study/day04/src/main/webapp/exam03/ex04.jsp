<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLEncoder" %>
<h1>ex04.jsp - 상단</h1>

<jsp:include page="ex02.jsp">
    <jsp:param name="key1" value='<%=URLEncoder.encode("가나다", "UTF-8")%>'/>
    <jsp:param name="key2" value="value2" />
</jsp:include>

<h1>ex04.jsp - 하단</h1>