package tests;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("로그인 기능 단위 테스트")
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.WARN)
public class LoginServiceTest {

    private LoginService loginService;
    private JoinService joinService;

    private Member member; // 가입한 회원 정보

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpSession session;

    @BeforeEach
    void init() {
        loginService = ServiceManager.getInstance().loginService();
        joinService = ServiceManager.getInstance().joinService();

        member = Member.builder()
                .userId("user" + System.currentTimeMillis())
                .userNm("사용자")
                .userPw("_aA123456")
                .userPwRe("_aA123456")
                .agree(true)
                .build();
        joinService.join(member);

    }

    private void createRequestData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    @Test
    @DisplayName("로그인 성공시 예외 발생 하지 않음")
    void loginSuccessTest() {
        given(request.getSession()).willReturn(session);
        given(session.getAttribute("member")).willReturn(member);

        assertDoesNotThrow(() -> {
            createRequestData(member.getUserId(), member.getUserPw());
            loginService.login(request);
        });
    }

    @Test
    @DisplayName("로그인 필수 항목(userId, userPw) 체크, 검증 실패시 LoginValidationException")
    void requiredFieldsTest() {
        assertAll(
                // userId 필수 여부 체크
                () -> {
                    createRequestData(null, member.getUserPw());
                    requiredTestEach("아이디를 입력");

                    createRequestData("  ", member.getUserPw());
                    requiredTestEach("아이디를 입력");
                },
                // userPw 필수 여부 체크
                () -> {
                    createRequestData(member.getUserId(), null);
                    requiredTestEach("비밀번호를 입력");

                    createRequestData(member.getUserId(), "    ");
                    requiredTestEach("비밀번호를 입력");
                }
        );
    }

    @Test
    @DisplayName("userId로 회원이 조회되는지 체크, 검증 실패시 MemberNotFoundException")
    void memberExistsCheckTest() {
        assertThrows(MemberNotFoundException.class, () -> {
            createRequestData(member.getUserId() + "ab", member.getUserPw());
            loginService.login(request);
        });
    }
    
    @Test
    @DisplayName("가입된 회원의 비밀번호와 일치하는지 체크, 검증 실패시 LoginValidationException")
    void passwordCheckTest() {
        createRequestData(member.getUserId(), member.getUserPw() + "ab");
        requiredTestEach("아이디 또는 비밀번호");
    }
    
    private void requiredTestEach(String message) {
        LoginValidationException thrown = assertThrows(LoginValidationException.class, () -> {
            loginService.login(request);
        });

        if (thrown != null) {
            assertTrue(thrown.getMessage().contains(message));
        }
    }
}
