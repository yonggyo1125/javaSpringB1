package exam04.members;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserDao userDao;

    /*
    public JoinService(UserDao userDao) {
        this.userDao = userDao;
    }
    */
    public void join(Users user) {
        // ...

        userDao.register(user);

        //..
    }
}
