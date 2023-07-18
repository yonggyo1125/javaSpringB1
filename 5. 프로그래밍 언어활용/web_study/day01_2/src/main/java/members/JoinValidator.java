package members;

import validators.RequiredValidator;
import validators.Validator;

public class JoinValidator implements Validator<Users>, RequiredValidator {

    @Override
    public void check(Users user) {
        /** 필수 항목 체크 S */
       String userId = user.getUserId();
       String userPw = user.getUserPw();
       String userNm = user.getUserNm();

       checkRequired(userId, new ValidationException("아이디를 입력하세요."));
       checkRequired(userPw, new ValidationException("비밀번호를 입력하세요."));
       checkRequired(userNm, new ValidationException("회원명을 입력하세요."));
        /** 필수 항목 체크 E */
    }
}
