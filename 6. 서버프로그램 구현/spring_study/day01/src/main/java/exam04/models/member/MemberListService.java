package exam04.models.member;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class MemberListService {

    @NonNull
    private MemberDao memberDao;


    public void print() {
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
}
