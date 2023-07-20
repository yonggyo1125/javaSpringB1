package exam03.members;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class JoinService {


    //@Autowired
    //private UserDao userDao;
    @Autowired
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
