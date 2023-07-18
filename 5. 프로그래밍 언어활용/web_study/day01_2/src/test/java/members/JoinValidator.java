package members;

import validators.Validator;

public class JoinValidator implements Validator<Users> {

    @Override
    public void check(Users user) {
        String userId = user.getUserId();
        if (userId == null || userId.isBlank()) {
            throw new ValidationException("아이디를 입력하세요.");
        }

        String userPw = user.getUserPw();
        if (userPw == null || userPw.isBlank()) {
            throw new ValidationException("비밀번호를 입력하세요.");
        }
    }
}
