<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.book.Book" %>
<%
Book book = new Book();
book.setTitle("책1");
book.setAuthor("저자1");
book.setPublisher("출판사1");
session.setAttribute("book", book);
%>