package exam03;

public class UserIdIncorrectException extends RuntimeException {
    public UserIdIncorrectException(String message) {
        super(message);
    }
}
