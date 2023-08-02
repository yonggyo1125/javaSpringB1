package exam04.models.member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import validators.Validator;

@Service
@RequiredArgsConstructor
public class JoinService { // 빈의 이름 joinService

    private final Validator<Member> validator;

    private final MemberDao memberDao;


    public void join(Member member) {

        // 유효성 검사
        validator.check(member);

        // 회원 가입
        memberDao.register(member);

    }
}
