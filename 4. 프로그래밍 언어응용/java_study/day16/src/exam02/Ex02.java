package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("data1.txt")) {
            byte[] buffer = new byte[5];

            while(fis.available() > 0) {
                int len = fis.read(buffer);
                for (int i = 0; i < len; i++) {
                    System.out.print((char)buffer[i]);
                }
                /**
                for (byte b : buffer) {
                    System.out.print((char)b);
                }
                 */
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
