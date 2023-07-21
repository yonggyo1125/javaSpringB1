<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%
    List<String> titles = (List<String>)request.getAttribute("titles");

    for(String title : titles) {
        out.write(title + "<br>");
    }
%>