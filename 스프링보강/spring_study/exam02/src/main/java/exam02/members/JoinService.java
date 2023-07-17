package exam02.members;

public class JoinService {

    private UserDao userDao = new UserDao();

    public void join(Users user) {
        // ...

        userDao.register(user);

        //..
    }
}
