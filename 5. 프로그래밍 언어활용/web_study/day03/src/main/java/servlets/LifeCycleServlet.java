package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청!!!");
    }

    @Override
    public void destroy() {
        System.out.println("destory!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init!");
    }
}
