package exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        List<Book> books = Arrays.asList(
               new Book("책1", "저자1", "출판사1"),
                new Book("책2", "저자2", "출판사2")
        );

        data.put("books", books);
        data.put("book3", new Book("책3", "저자3", "출판사3"));
        data.put("str", "문자열!");

        try(FileOutputStream fos = new FileOutputStream("data.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
