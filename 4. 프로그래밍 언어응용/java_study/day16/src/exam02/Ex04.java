package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data3.txt")) {
            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            System.out.println((int)'안');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
