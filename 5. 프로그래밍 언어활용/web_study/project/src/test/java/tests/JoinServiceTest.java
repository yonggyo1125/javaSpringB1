package tests;

import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JoinServiceTest {

    private JoinService joinService;
    
    @BeforeEach
    void init() {
        joinService = new JoinService(new JoinValidator());
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
    @DisplayName("필수항목(userId, userPw, userPwRe, userNm, agree) 검증, 검증 실패시 JoinValidationException")
    void requiredFieldTest() {

        assertAll(
                () -> { // userId 필수 검증
                    Member member = getMember();
                    member.setUserId(null);
                    requiredTestEach(member, "아이디를 입력");

                    member.setUserId("    ");
                    requiredTestEach(member, "아이디를 입력");
                   
                },
                () -> { // userPw 필수 검증
                    Member member = getMember();
                    member.setUserPw(null);
                    requiredTestEach(member, "비밀번호를 입력");

                    member.setUserPw("    ");
                    requiredTestEach(member, "비밀번호를 입력");
                },
                () -> { // userPwRe 필수 검증
                    Member member = getMember();
                    member.setUserPwRe(null);
                    requiredTestEach(member, "비밀번호를 확인");

                    member.setUserPwRe("    ");
                    requiredTestEach(member, "비밀번호를 확인");
                },
                () -> { // userNm 필수 검증
                    Member member = getMember();
                    member.setUserNm(null);
                    requiredTestEach(member, "회원명을 입력");

                    member.setUserNm("    ");
                    requiredTestEach(member, "회원명을 입력");
                },
                () -> { // agree 필수 검증
                    Member member = getMember();
                    member.setAgree(false);
                    requiredTestEach(member, "회원가입 약관");
                }
        );
        
        
        
       
    }



    @Test
    @DisplayName("userId는 6자리 이상 입력 체크, 검증 실패시 JoinValidationException")
    void userIdLengthCheckTest() {
        Member member = getMember();
        member.setUserId("user");
        lengthTest(member, "아이디는 6자리");
    }

    @Test
    @DisplayName("userPw는 8자리 이상 입력, 검증 실패시 JoinValidationException")
    void userPwLengthCheckTest() {
        Member member = getMember();
        member.setUserPw("1234");
        lengthTest(member,"비밀번호는 8자리");
    }

    @Test
    @DisplayName("비밀번호와 비밀번호 확인 일치여부 체크, 검증 실패시 JoinValidationException")
    void userPwCorrectCheckTest() {
        Member member = getMember();
        member.setUserPwRe(member.getUserPw() + "1234");
        requiredTestEach(member, "비밀번호가 정확하지");
    }

    @Test
    @DisplayName("중복된 아이디로 가입하면 DuplicatedMemberException 발생")
    void duplicateUserIdTest() {
        assertThrows(DuplicatedMemberException.class, () -> {
            Member member = getMember();
            joinService.join(member);

            joinService.join(member); // 중복 가입
        });
    }

    private void requiredTestEach(Member member, String message) {
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
            joinService.join(member);
        });
        if (thrown != null) {
            assertTrue(thrown.getMessage().contains(message));
        }
    }

    private void lengthTest(Member member, String message) {
        requiredTestEach(member, message);
    }
}
