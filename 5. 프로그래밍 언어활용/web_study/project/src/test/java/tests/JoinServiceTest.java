package tests;

import models.member.JoinService;
import models.member.JoinValidationException;
import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoinServiceTest {

    private JoinService joinService;
    
    @BeforeEach
    void init() {
        joinService = new JoinService();
    }

    /**
     * 회원가입시 정상 데이터
     *
     * @return
     */
    private Member getMember() {
        return Member.builder()
                .userId("user01")
                .userPw("_aA123456")
                .userPwRe("_aA123456")
                .userNm("사용자01")
                .agree(true)
                .build();
    }
    

    @Test
    @DisplayName("회원 가입 성공시 예외가 발생하지 않음")
    void joinSuccessTest() {

        assertDoesNotThrow(() -> {
            joinService.join(getMember());
        });
    }

    @Test
    @DisplayName("필수항목(userId, userPw, userPwRe, userNm) 검증, 검증 실패시 JoinValidationException")
    void requiredFieldTest() {
        // null, ''(빈값)
        // userId 필수 항목 검증 S
        assertThrows(JoinValidationException.class, () -> {
            Member member = getMember();
            member.setUserId(null);
            joinService.join(member);
        });

        assertThrows(JoinValidationException.class, () -> {
            Member member = getMember();
            member.setUserId("      ");
            joinService.join(member);
        });
        // userId 필수 항목 검증 E
    }
}
