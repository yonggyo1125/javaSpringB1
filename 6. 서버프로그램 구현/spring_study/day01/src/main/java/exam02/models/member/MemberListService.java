package exam02.models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MemberListService {

    //@Autowired
    //private MemberDao memberDao;
    @Autowired
    private Optional<MemberDao> opt;

    public MemberListService() {}


    public MemberListService(MemberDao memberDao) {
       // this.memberDao = memberDao;
    }

    public void print() {
        MemberDao memberDao = opt.get();
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
}
