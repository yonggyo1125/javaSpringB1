package exam04.members;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListService {

    @NonNull
    private UserDao userDao;


    /*
    public void setUserDao(UserDao userDao) {

        this.userDao = userDao;
    }
    */

    public void print() {
        List<Users> users = userDao.gets();
        users.stream().forEach(System.out::println);
    }
}
