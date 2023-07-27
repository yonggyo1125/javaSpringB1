package models.member;

import validators.LengthValidator;
import validators.RequiredValidator;
import validators.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator, LengthValidator {

    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userPwRe = member.getUserPwRe();

        // 아이디 필수 항목 검증
        requiredCheck(userId, new JoinValidationException("아이디를 입력하세요."));

        // 비밀번호 필수 항목 검증
        requiredCheck(userPw, new JoinValidationException("비밀번호를 입력하세요."));

        // 비밀번호확인 필수 항목 검증
        requiredCheck(userPwRe, new JoinValidationException("비밀번호를 확인하세요."));

        // 회원명 필수 항목 검증
        requiredCheck(member.getUserNm(), new JoinValidationException("회원명을 입력하세요."));

        // 약관 동의 여부
        requiredTrue(member.isAgree(), new JoinValidationException("회원가입 약관에 동의하세요."));

        // 아이디 6자리 이상 체크
        lengthCheck(userId, 6, new JoinValidationException("아이디는 6자리 이상 입력하세요."));

        // 비밀번호 8자리 이상 체크
        lengthCheck(userPw, 8, new JoinValidationException("비밀번호는 8자리 이상 입력하세요."));

        // 비밀번호와 비밀번호 확인 일치 여부 체크
        if (!userPw.equals(userPwRe)) {
            throw new JoinValidationException("비밀번호가 정확하지 않습니다.");
        }

        // 아이디의 중복 가입 여부 체크
        if (memberDao.exists(userId)) {
            throw new DuplicatedMemberException();
        }

    }
}
