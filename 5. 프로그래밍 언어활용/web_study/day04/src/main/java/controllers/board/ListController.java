package controllers.board;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/board/list")
public class ListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> titles = Arrays.asList("제목1", "제목2", "제목3");
        req.setAttribute("titles", titles);

        RequestDispatcher rd = req.getRequestDispatcher("/board/list.jsp");
        rd.forward(req, resp);
    }


}
