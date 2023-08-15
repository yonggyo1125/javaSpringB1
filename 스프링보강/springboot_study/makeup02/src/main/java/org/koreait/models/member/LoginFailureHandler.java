package org.koreait.models.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;

public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        HttpSession session = request.getSession();
        session.removeAttribute("errorField");
        session.removeAttribute("errorMessage");
        session.removeAttribute("userId");
        session.removeAttribute("userPw");
        try {
            String userId = request.getParameter("userId");
            String userPw = request.getParameter("userPw");
            session.setAttribute("userId", userId);
            session.setAttribute("userPw", userPw);

            if (userId == null || userId.isBlank()) {
                throw new LoginValidationException("userId", "아이디를 입력하세요.");
            }

            if (userPw == null || userPw.isBlank()) {
                throw new LoginValidationException("userPw", "비밀번호를 입력하세요.");
            }

            // 인증 실패 - 아이디 또는 비밀번호가 일치하지 않는 경우
            throw new LoginValidationException("global", "아이디 또는 비밀번호가 일치하지 않습니다.");

        } catch(LoginValidationException e) {
            session.setAttribute("errorField", e.getField());
            session.setAttribute("errorMessage", e.getMessage());
        }

        // 로그인 실패시 -> 로그인 페이지
        response.sendRedirect(request.getContextPath() + "/member/login");
    }
}
