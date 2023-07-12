package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Ex13 {
    public static void main(String[] args) {
        List<Book> books = getBooks();
        int[] prices = books.stream()
                            .peek(b -> System.out.println(b.getTitle()))
                            .mapToInt(Book::getPrice)
                            .toArray();
        System.out.println(Arrays.toString(prices));
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
