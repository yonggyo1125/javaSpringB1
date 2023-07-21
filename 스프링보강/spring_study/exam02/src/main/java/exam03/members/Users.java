package exam03.members;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
public class Users {
    private String userId; // 아이디
    private String userPw; // 비밀번호
    private String userNm; // 사용자이름
    @ToString.Exclude
    private LocalDateTime regDt; // 가입일시
    private String regDtStr;
}
