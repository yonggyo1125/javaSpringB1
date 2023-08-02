package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class MemberListService {

    @Autowired
    private Optional<MemberDao> opt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");

    public MemberListService() {}


    public MemberListService(MemberDao memberDao) {
       // this.memberDao = memberDao;
    }
    /*
    @Autowired(required = false)
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }
     */

    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void print() {
        MemberDao memberDao = opt.get();
        List<Member> members = memberDao.gets();
        members.stream().map(this::convert).forEach(System.out::println);
    }

    private Member convert(Member member) {
        if (formatter == null) {
            return member;
        }

        String strDate = formatter.format(member.getRegDt());
        member.setRegDtStr(strDate);
        return member;
    }
}
