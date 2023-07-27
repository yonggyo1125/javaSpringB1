package models.member;

import jakarta.servlet.http.HttpServletRequest;
import validators.Validator;

public class JoinService {

    private Validator<Member> validator;
    private MemberDao memberDao;

    public JoinService(Validator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void join(Member member) {

        // 유효성 검사
        validator.check(member);

        // 회원 가입
        memberDao.register(member);

    }

    public void join(HttpServletRequest request) {
        Member member = Member.builder()
                .userId(request.getParameter("userId"))
                .userPw(request.getParameter("userPw"))
                .userPwRe(request.getParameter("userPwRe"))
                .userNm(request.getParameter("userNm"))
                .agree(Boolean.parseBoolean(request.getParameter("agree")))
                .build();
        join(member);
    }
}
