package tests;

import jakarta.servlet.http.HttpServletRequest;
import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("로그인 기능 단위 테스트")
@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {

    private LoginService loginService;

    @Mock
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginService = ServiceManager.getInstance().loginService();
    }

    private void createRequestData(String userId, String userPw) {
        given(request.getParameter("userId")).willReturn(userId);
        given(request.getParameter("userPw")).willReturn(userPw);
    }

    @Test
    @DisplayName("로그인 성공시 예외 발생 하지 않음")
    void loginSuccessTest() {
        assertDoesNotThrow(() -> {
            loginService.login(request);
        });
    }

    @Test
    @DisplayName("로그인 필수 항목(userId, userPw) 체크, 검증 실패시 LoginValidationException")
    void requiredFieldsTest() {
        assertAll(
                // userId 필수 여부 체크
                () -> {
                    createRequestData(null, "12345678");
                    requiredTestEach("아이디를 입력");

                    createRequestData("  ", "12345678");
                    requiredTestEach("아이디를 입력");
                },
                // userPw 필수 여부 체크
                () -> {
                    createRequestData("user01", null);
                    requiredTestEach("비밀번호를 입력");

                    createRequestData("user01", "    ");
                    requiredTestEach("비밀번호를 입력");
                }
        );
        
        
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
