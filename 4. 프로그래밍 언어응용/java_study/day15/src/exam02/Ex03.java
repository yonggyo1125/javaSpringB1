package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    books.add(new Book("책" + x, "저자" + x, "출판사" + x));
                });

        Map<Integer, Book> books2 = books.stream()
                .collect(Collectors.toMap(
                        b -> Objects.hash(b.getTitle(), b.getAuthor(), b.getPublisher()),
                        Function.identity()));

        System.out.println(books2);
    }
}
