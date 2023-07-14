package exam02;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        File file0 = new File("D:" + File.separator + "fileex" + File.separator + "file1.txt");
        file0.createNewFile();

        Thread.sleep(3000);
        file0.delete(); // 바로 삭제

        File dir = new File("D:" + File.separator + "fileex");
        File file = File.createTempFile("tmp_", ".log", dir);
        file.deleteOnExit(); // 애플리케이션 종료 후 삭제

        Thread.sleep(5000);
    }
}
