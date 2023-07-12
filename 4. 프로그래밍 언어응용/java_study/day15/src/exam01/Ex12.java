package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Ex12 {
    public static void main(String[] args) {
        List<Book> books = getBooks();
        System.out.println("---- 정렬 전 -----");
        books.stream().forEach(System.out::println);

        System.out.println("---- 정렬 후1 -----");
        books.stream().sorted().forEach(System.out::println);

        System.out.println("---- 정렬 후2 -----");
        books.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("---- 정렬 후3 -----");
        books.stream().sorted((b1, b2) -> b2.getPrice() - b1.getPrice()).forEach(System.out::println);
    }

    private static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    int price = 10000 * (int)(Math.random() * 4 + 1);
                    books.add(new Book("책" + x, "저자" + x, "출판사" + x, price));
                });

        Collections.shuffle(books);

        return books;
    }
}
