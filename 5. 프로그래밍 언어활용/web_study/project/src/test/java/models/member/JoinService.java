package models.member;

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
}
