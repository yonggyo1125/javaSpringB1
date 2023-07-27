package models.member;

import validators.RequiredValidator;
import validators.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator {
    @Override
    public void check(Member member) {
        // 아이디 필수 항목 검증
        requiredCheck(member.getUserId(), new JoinValidationException("아이디를 입력하세요."));

        // 비밀번호 필수 항목 검증
        requiredCheck(member.getUserPw(), new JoinValidationException("비밀번호를 입력하세요."));

        // 비밀번호확인 필수 항목 검증
        //requiredCheck(member.getUserPwRe(), );
    }
}
