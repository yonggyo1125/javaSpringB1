package controllers.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.member.LoginService;
import models.member.ServiceManager;

import java.io.IOException;

import static commons.Util.alertError;
import static commons.Util.go;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/member/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            LoginService loginService = ServiceManager.getInstance().loginService();
            loginService.login(req, resp);

            // 로그인 성공시
            String url = req.getContextPath() + "/";
            go(resp, url, "parent");
        } catch (Exception e) {
            alertError(resp, e);
        }
    }
}
