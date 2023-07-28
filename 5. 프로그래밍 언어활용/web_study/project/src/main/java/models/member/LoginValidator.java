package models.member;

import jakarta.servlet.http.HttpServletRequest;
import validators.RequiredValidator;
import validators.Validator;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {

    private MemberDao memberDao;

    public LoginValidator(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(HttpServletRequest req) {
        String userId = req.getParameter("userId");
        String userPw = req.getParameter("userPw");

        /** 필수 입력항목(userId, userPw) 검증 */
        requiredCheck(userId, new LoginValidationException("아이디를 입력하세요."));
        requiredCheck(userPw, new LoginValidationException("비밀번호를 입력하세요."));

        /** 가입된 회원인지 체크 */
        if (!memberDao.exists(userId)) { // 가입하지 않은 회원인 경우
            throw new MemberNotFoundException();
        }
    }
}
