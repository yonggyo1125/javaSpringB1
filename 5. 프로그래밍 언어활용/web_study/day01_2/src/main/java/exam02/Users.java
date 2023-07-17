package exam02;

import java.time.LocalDateTime;

public class Users {
    private String userId; // 아이디
    private String userPw; // 비밀번호
    private String userNm; // 회원명
    private LocalDateTime regDt; // 회원 가입일시

    private Users() {}

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userNm='" + userNm + '\'' +
                ", regDt=" + regDt +
                '}';
    }

    static class Builder {
        private Users instance = new Users();

        public Builder userId(String userId) {
            instance.userId = userId;

            return this;
        }

        public Builder userPw(String userPw) {
            instance.userPw = userPw;

            return this;
        }

        public Builder userNm(String userNm) {
            instance.userNm = userNm;

            return this;
        }

        public Builder regDt(LocalDateTime regDt) {
            instance.regDt = regDt;

            return this;
        }

        public Users build() {
            return instance;
        }
    }
}