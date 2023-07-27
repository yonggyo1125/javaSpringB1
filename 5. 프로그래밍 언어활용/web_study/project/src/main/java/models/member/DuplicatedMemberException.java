package models.member;

public class DuplicatedMemberException extends RuntimeException {
    public DuplicatedMemberException() {
        super("이미 가입된 회원입니다.");
    }
}