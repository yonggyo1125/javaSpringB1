package exam03.members;

public class JoinService {

    private UserDao userDao;

    public JoinService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void join(Users user) {
        // ...

        userDao.register(user);

        //..
    }
}
