package exam02;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {
        int total = 0;
        try (FileInputStream fis = new FileInputStream("data6.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            try {
                while (true) {
                    int score = dis.readInt();
                    total += score;
                }
            } catch (EOFException e) {
                // 파일을 다 읽은 상태
                System.out.println("총합 : " + total);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
