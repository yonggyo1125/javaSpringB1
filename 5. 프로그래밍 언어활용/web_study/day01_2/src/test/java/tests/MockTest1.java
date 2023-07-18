package tests;

import exam03.Calculator;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MockTest1 {

    @Test
    void test1() {
        Calculator cal = mock(Calculator.class);
    }

}
