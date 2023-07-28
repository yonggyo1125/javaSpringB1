package models.member;

public class MemberNotFoundException extends RuntimeException {
    public MemberNotFoundException() {
        super("아이디 또는 비밀번호가 일치하지 않습니다.");
    }
}
