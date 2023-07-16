package exam03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Map<String, Object> data = (Map<String, Object>)ois.readObject();

            Book book3 = (Book)data.get("book3");
            System.out.println(book3);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
