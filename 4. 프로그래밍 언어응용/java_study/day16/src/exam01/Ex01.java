package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(x -> books.add(new Book(x, "책" + x)));

        Map<Integer, String> books2 = books.stream()
                .collect(Collectors.toMap(Book::getId, Book::getTitle));

        books2.entrySet().stream()
                .forEach(b -> System.out.println(b.getKey() + ":" + b.getValue()));



    }
}
