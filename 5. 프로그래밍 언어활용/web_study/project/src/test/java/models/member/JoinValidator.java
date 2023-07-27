package models.member;

import validators.LengthValidator;
import validators.RequiredValidator;
import validators.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator, LengthValidator {
    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();

        // 아이디 필수 항목 검증
        requiredCheck(userId, new JoinValidationException("아이디를 입력하세요."));

        // 비밀번호 필수 항목 검증
        requiredCheck(member.getUserPw(), new JoinValidationException("비밀번호를 입력하세요."));

        // 비밀번호확인 필수 항목 검증
        requiredCheck(member.getUserPwRe(), new JoinValidationException("비밀번호를 확인하세요."));

        // 회원명 필수 항목 검증
        requiredCheck(member.getUserNm(), new JoinValidationException("회원명을 입력하세요."));

        // 약관 동의 여부
        requiredTrue(member.isAgree(), new JoinValidationException("회원가입 약관에 동의하세요."));

        // 아이디 6자리 이상 체크
        lengthCheck(userId, 6, new JoinValidationException("아이디는 6자리 이상 입력하세요."));

        // 비밀번호 8자리 이상 체크
        lengthCheck(userPw, 8, new JoinValidationException("비밀번호는 8자리 이상 입력하세요."));
    }


}
