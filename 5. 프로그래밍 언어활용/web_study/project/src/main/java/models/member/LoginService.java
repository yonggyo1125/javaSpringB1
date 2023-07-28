package models.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import validators.Validator;

public class LoginService {

    private Validator<HttpServletRequest> validator;
    private MemberDao memberDao;

    public LoginService(Validator<HttpServletRequest> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void login(HttpServletRequest request){

        // 유효성 검사
        validator.check(request);

        // 로그인 처리
        String userId = request.getParameter("userId");
        Member member = memberDao.get(userId);
        HttpSession session = request.getSession();
        session.setAttribute("member", member);
    }
}
