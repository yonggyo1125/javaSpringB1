package exam02.models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberListService {

    @Autowired
    private MemberDao memberDao;

    public MemberListService() {}

    public MemberListService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void print() {
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
}
