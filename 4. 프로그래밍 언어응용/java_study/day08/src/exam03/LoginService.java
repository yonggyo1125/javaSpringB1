package exam03;

public class LoginService {
    public void login(String userId, String userPw) {
        try {
            // userId - user01, userPw - 1234
            if (!userId.equals("user01")) { // 아이디 불일치
                throw new UserIdIncorrectException("아이디가 일치하지 않습니다.");
            }

            if (!userPw.equals("1234")) { // 비밀번호 불일치
                throw new UserPwIncorrectException("비밀번호가 일치하지 않습니다.");
            }
        } catch (UserIdIncorrectException | UserPwIncorrectException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
