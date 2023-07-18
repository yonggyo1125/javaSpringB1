package members;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Users {
    private String userId; // 아이디 
    private String userPw; // 비번
    private String userNm; // 사용자명
    private LocalDateTime regDt; // 가입일시
}
