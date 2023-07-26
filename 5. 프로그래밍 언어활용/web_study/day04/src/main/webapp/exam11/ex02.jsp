<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.*" %>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        String name = cookie.getName();
        String value = cookie.getValue();
        System.out.printf("name=%s,value=%s%n", name, value);
    }
%>
key1 : ${cookie.key1.getValue()}<br>
key1 : ${cookie.key1.value}<br>