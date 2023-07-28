package models.member;

import jakarta.servlet.http.HttpServletRequest;
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
    }
}
