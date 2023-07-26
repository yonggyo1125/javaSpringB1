<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.*" %>
<%
    Cookie cookie = new Cookie("key1", "value1");
    //cookie.setMaxAge(0); // 1970. 1. 1
    response.addCookie(cookie); // 응답 헤더 Set-Cookie: key1=value;
%>