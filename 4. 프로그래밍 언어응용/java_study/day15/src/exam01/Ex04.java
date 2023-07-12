package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ex04 {

    private static List<Book> books;
    public static void main(String[] args) {
        books = new ArrayList<>();

        IntStream.rangeClosed(1, 10).forEach(Ex04::addBook);
    }

    private static void addBook(int num) {
        books.add(new Book("책" + num, "저자" + num, "출판사" + num));
    }

}
