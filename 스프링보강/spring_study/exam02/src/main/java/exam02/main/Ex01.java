package exam02.main;

import exam02.members.*;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        /**
        UserDao userDao = new CachedUserDao();
        JoinService joinService = new JoinService(userDao);
        ListService listService = new ListService();
        listService.setUserDao(userDao);
        */

        JoinService joinService = ServiceManager.getInstance().joinService();
        ListService listService = ServiceManager.getInstance().listService();

        Users user = new Users();
        user.setUserId("user01");
        user.setUserPw("1234");
        user.setUserNm("사용자01");
        user.setRegDt(LocalDateTime.now());

        joinService.join(user);

        listService.print();
    }
}
