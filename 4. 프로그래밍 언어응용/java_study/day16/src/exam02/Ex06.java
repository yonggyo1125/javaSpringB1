package exam02;

import java.io.FileReader;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("data4.txt")) {
            int ch = 0;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
