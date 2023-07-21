package exam02.members;

import java.util.List;

public class ListService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {

        this.userDao = userDao;
    }

    public void print() {
        List<Users> users = userDao.gets();
        users.stream().forEach(System.out::println);
    }
}
