package exam02.models.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import validators.Validator;

public class JoinService {

    @Autowired
    private Validator<Member> validator;

    @Autowired
    @Qualifier("memberDao2")
    private MemberDao memberDao;

    public JoinService() {}

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
