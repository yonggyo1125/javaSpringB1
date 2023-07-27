package models.member;

/**
 * 회원가입 유효성 검사 실패시 발생하는 예외
 *
 */
public class JoinValidationException extends RuntimeException {
    public JoinValidationException(String message) {
        super(message);
    }
}
