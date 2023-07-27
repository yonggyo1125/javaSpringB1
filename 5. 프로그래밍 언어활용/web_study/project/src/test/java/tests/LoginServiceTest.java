package tests;

import jakarta.servlet.http.HttpServletRequest;
import models.member.LoginService;
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
        loginService = new LoginService();
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

    }
}
