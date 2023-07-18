package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class TempFileTest {
    @TempDir
    File tmpFile;

    @Test
    void test1() {
        String path = tmpFile.getAbsolutePath();
        System.out.println(path);
    }

    @AfterEach
    void cleanupTemp() {
        if (tmpFile.exists()) {
            tmpFile.delete();
        }
    }
}
