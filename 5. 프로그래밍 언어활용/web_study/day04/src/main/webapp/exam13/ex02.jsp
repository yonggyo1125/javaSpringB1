<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.book.Book" %>
<%
    Book book = (Book)session.getAttribute("book");
    System.out.println(book);
%>