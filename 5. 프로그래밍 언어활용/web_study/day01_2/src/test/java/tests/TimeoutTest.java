package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {

    @Test
    @Timeout(value=2000, unit=TimeUnit.MILLISECONDS)
    void test1() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
