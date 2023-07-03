package exam03;

public class UserPwIncorrectException extends RuntimeException {
    public UserPwIncorrectException(String message) {
        super(message);
    }
}
