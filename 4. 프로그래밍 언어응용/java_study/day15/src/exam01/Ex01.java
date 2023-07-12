package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            books.add(new Book("책" + i, "저자" + i, "출판사" + i));
        }

        //books.stream().map(b -> b.getAuthor());
        books.stream().map(Book::getAuthor).limit(5).forEach(System.out::println);

    }
}
