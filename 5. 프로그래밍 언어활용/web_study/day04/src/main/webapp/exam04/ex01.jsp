<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="names" class="java.util.ArrayList" />
<%
    names.add("이름1");
    names.add("이름2");
    names.add("이름3");

    System.out.println(names);
%>