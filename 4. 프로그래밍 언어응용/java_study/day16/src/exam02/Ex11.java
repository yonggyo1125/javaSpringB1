package exam02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 56, 70, 80 };
        try (FileOutputStream fos = new FileOutputStream("data6.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {

            for (int score : scores) {
                dos.writeInt(score);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
