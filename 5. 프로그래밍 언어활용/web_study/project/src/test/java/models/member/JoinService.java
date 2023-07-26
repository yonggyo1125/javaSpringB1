package models.member;

public class JoinService {
    public void join(Member member) {
        /** 아이디 필수 항목 검증 */
        String userId = member.getUserId();
        if (userId == null || userId.isBlank()) {
            throw new JoinValidationException("아이디를 입력하세요.");
        }
    }
}
