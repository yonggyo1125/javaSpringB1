package exam03.members;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ListService {


    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {

        this.userDao = userDao;
    }

    public void print() {
        List<Users> users = userDao.gets();
        users.stream().forEach(System.out::println);
    }
}
