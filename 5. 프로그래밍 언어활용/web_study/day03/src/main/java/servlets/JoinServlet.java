package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        //out.print("<h1>안녕하세요!</h1>");
        out.print("<form method='post' action='join'>");
        out.print("아이디 : <input type='text' name='userId'><br>");
        out.print("비밀번호 : <input type='password' name='password'><br>");
        out.print("회원명 : <input type='text' name='userNm'><br>");
        out.print("취미 : <input type='checkbox' name='hobby' value='취미1'>취미1");
        out.print("<input type='checkbox' name='hobby' value='취미2'>취미2");
        out.print("<input type='checkbox' name='hobby' value='취미3'>취미3<br>");
        out.print("<button type='submit'>가입하기</button>");
        out.print("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String userNm = req.getParameter("userNm");
        //String hobby = req.getParameter("hobby");
        String[] hobbies = req.getParameterValues("hobby"); // 여러개 항목을 조회

        System.out.printf("userId=%s, password=%s, userNm=%s%n", userId, password, userNm);
        System.out.println(Arrays.toString(hobbies));
    }
}
