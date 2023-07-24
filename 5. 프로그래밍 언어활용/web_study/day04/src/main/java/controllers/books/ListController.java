package controllers.books;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.book.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/book/list")
public class ListController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Book book = new Book();
            book.setTitle("책" + i);
            book.setAuthor("저자" + i);
            book.setPublisher("출판사" + i);
            books.add(book);
        }

        req.setAttribute("books", books);

        RequestDispatcher rd = req.getRequestDispatcher("/books/list.jsp");
        rd.forward(req, resp);
    }
}
