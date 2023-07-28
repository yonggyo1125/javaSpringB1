package models.member;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import validators.Validator;

public class LoginService {

    private Validator<HttpServletRequest> validator;
    private MemberDao memberDao;

    public LoginService(Validator<HttpServletRequest> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void login(HttpServletRequest request, HttpServletResponse response){

        // 유효성 검사
        validator.check(request);

        // 로그인 처리
        String userId = request.getParameter("userId");
        Member member = memberDao.get(userId);
        HttpSession session = request.getSession();
        session.setAttribute("member", member);

        // 아이디 저장 처리
        if (response != null) {
            String saveId = request.getParameter("saveId");
            Cookie cookie = new Cookie("saveId", member.getUserId());
            if (saveId == null) { // 아이디를 쿠키에서 삭제 
                cookie.setMaxAge(0);
            } else { // 아이디를 쿠키에 저장
                cookie.setMaxAge(60 * 60 * 24 * 365); // 1년간 쿠키 저장
            }

            response.addCookie(cookie); // Set-Cookie: saveId=...
        }
    }

    public void login(HttpServletRequest request) {
        login(request, null);
    }
}
