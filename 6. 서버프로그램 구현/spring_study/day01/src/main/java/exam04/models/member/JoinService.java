package exam04.models.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import validators.Validator;

@Service
public class JoinService { // 빈의 이름 joinService

    private Validator<Member> validator;

    private MemberDao memberDao;

    public JoinService(Validator<Member> validator, MemberDao memberDao) {
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
