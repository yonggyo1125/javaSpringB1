package exam02;

import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data4.txt", true)) {
            fw.write("안녕하세요.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
