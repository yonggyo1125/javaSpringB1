package exam03.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ListService {


    private UserDao userDao;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");

    /*
    @Autowired(required=false)
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }
    */
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Autowired
    //@Qualifier("userDao1")
    public void setUserDao(UserDao userDao) {

        this.userDao = userDao;
    }

    public void print() {
        List<Users> users = userDao.gets();
        users.stream().map(this::convertDateFormat).forEach(System.out::println);
    }

    private Users convertDateFormat(Users user) {
        if (formatter != null) {
            user.setRegDtStr(formatter.format(user.getRegDt()));
        }
        return user;
    }
}
