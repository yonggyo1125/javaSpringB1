package exam03.models.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import validators.Validator;

@Service
public class JoinService { // 빈의 이름 joinService

    @Autowired
    private Validator<Member> validator;

    @Autowired
    private MemberDao memberDao;

    public void join(Member member) {

        // 유효성 검사
        validator.check(member);

        // 회원 가입
        memberDao.register(member);

    }
}
