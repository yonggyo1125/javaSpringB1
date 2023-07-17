package exam03;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        Users users = Users.builder()
                        .userId("user01")
                        .userPw("1234")
                        .userNm("사용자01")
                        .regDt(LocalDateTime.now())
                        .build();
        System.out.println(users);
    }
}
