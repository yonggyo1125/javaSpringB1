<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.book.Book" %>
<jsp:useBean id="book" class="models.book.Book" scope="application" />
<%
    Book book2 = (Book)pageContext.getAttribute("book");
    Book book3 = (Book)request.getAttribute("book");
    Book book4 = (Book)application.getAttribute("book");
    System.out.println("page : " + book2);
    System.out.println("request : " + book3);
    System.out.println("application : " + book4);
%>
<jsp:setProperty name="book" property="title" value="책1" />
<jsp:setProperty name="book" property="author" value="저자1" />
<jsp:setProperty name="book" property="publisher" value="출판사1" />

제목 : <jsp:getProperty name="book" property="title" /><br>
저자 : <jsp:getProperty name="book" property="author" /><br>
출판사 : <jsp:getProperty name="book" property="publisher" /><br>