package models.member;

import jakarta.servlet.http.HttpServletRequest;
import validators.Validator;

public class LoginService {

    private Validator<HttpServletRequest> validator;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }

    public void login(HttpServletRequest request){

        // 유효성 검사
        validator.check(request);
    }
}
