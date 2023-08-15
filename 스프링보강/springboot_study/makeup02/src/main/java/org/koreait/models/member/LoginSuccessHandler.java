package org.koreait.models.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        HttpSession session = request.getSession();
        session.removeAttribute("errorField");
        session.removeAttribute("errorMessage");
        session.removeAttribute("userId");
        session.removeAttribute("userPw");

        MemberInfo memberInfo = (MemberInfo)authentication.getPrincipal();
        session.setAttribute("memberInfo", memberInfo);

        // 로그인 성공시 -> 메인 페이지
        response.sendRedirect(request.getContextPath() + "/");
    }
}
