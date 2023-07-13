package exam02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex10 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data5.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            byte num = dis.readByte(); // 1
            //int num = dis.readInt(); // 4
            char ch = dis.readChar();
            String str = dis.readUTF();

            System.out.printf("num=%d, ch=%c, str=%s%n", num, ch, str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
