package exam03.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JoinService {


    //@Autowired
    //private UserDao userDao;
    @Autowired
   // @Qualifier("userDao1")
    private Optional<UserDao> opt;

    public JoinService() {}

    public JoinService(UserDao userDao) {

       // this.userDao = userDao;
    }

    public void join(Users user) {
        // ...
        UserDao userDao = opt.get();

        userDao.register(user);

        //..
    }
}
