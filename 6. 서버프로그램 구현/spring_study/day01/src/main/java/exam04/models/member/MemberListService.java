package exam04.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class MemberListService {

    private MemberDao memberDao;



    public MemberListService(MemberDao memberDao) {
       // this.memberDao = memberDao;
    }



    public void print() {
        List<Member> members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }


}
