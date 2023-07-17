package tests;

import members.JoinService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원 가입 테스트")
public class JoinTest {

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccessTest() {
        JoinService joinService = new JoinService();

        assertDoesNotThrow(() -> {
            joinService.join();
        });
    }
    
    @Test
    @DisplayName("단위 테스트 연습")
    void testEx() {
        JoinService joinService = new JoinService();
        //assertEquals(0, joinService.join());

        //assertTrue(joinService.join());
        //assertFalse(joinService.join());
        //fail();
    }
}
