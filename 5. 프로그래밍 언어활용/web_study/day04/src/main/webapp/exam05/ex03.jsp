<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="models.book.Book" %>
<%
    pageContext.setAttribute("num", 10);
    pageContext.setAttribute("str", null);

    Book book = new Book();
    book.setTitle("제목1");
    book.setAuthor("저자1");
    book.setPublisher("출판사1");

    pageContext.setAttribute("book", book);
%>

${num == 10}<br>
${num == 10 ? "10입니다." : "10이 아니다"}<br>
${num > 5 && num < 20}<br>
${!empty str}<br>
제목 : ${book.title} // book.getTitle() <br>
저자 : ${book['author']} // book.getAuthor()<br>
출판사 : ${book.publisher} <br>