package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");


            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
