package controllers.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] addScript = { "member/form.js", "member/util.js" };
        List<String> addCss = Arrays.asList("member/join.css", "member/util.css");

        req.setAttribute("addScript", addScript);
        req.setAttribute("addCss", addCss);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/member/join.jsp");
        rd.forward(req, resp);
    }
}
