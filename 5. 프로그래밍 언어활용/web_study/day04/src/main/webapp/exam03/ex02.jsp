<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.URLDecoder" %>
<h1>ex02.jsp</h1>
<%
    String value1 = request.getParameter("key1");
    String value2 = request.getParameter("key2");
    out.write(URLDecoder.decode(value1, "UTF-8") + "<br>");
    out.write(value2 + "<br>");
%>