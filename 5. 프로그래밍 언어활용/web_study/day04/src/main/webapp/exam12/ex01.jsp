<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.*" %>
<%
    Cookie cookie = new Cookie("key2", "value2");
    cookie.setPath(request.getContextPath()); // /day04
    cookie.setHttpOnly(true);
    //cookie.setMaxAge(604800);
    cookie.setMaxAge(60 * 60 * 24 * 7);
    response.addCookie(cookie);

%>