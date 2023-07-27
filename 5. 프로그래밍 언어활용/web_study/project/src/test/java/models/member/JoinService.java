package models.member;

import validators.Validator;

public class JoinService {

    private Validator<Member> validator;

    public JoinService(Validator validator) {
        this.validator = validator;
    }

    public void join(Member member) {

        // 유효성 검사
        validator.check(member);

    }
}
