package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        long stime = System.nanoTime(); // 시작 시간

        try(FileInputStream fis = new FileInputStream("java.compiler.zip");
            FileOutputStream fos = new FileOutputStream("copied_java.compiler.zip")) {

            while(fis.available() > 0) {
                fos.write(fis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long etime = System.nanoTime();
        System.out.println("걸린 시간 : " + (etime - stime));
    }
}
