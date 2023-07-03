package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println(fis instanceof AutoCloseable);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
