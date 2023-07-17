package exam01;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
       //Users users2 = new Users();
        Users users = new Users("user01", "1234", "사용자01", LocalDateTime.now());
        //users.setUserId("user01");
        //users.setUserPw("1234");
        //users.setUserNm("사용자01");
        //users.setRegDt(LocalDateTime.now());
        System.out.println(users);
        users.printMethod();
    }
}
