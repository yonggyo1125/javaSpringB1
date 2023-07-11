package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex06 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("책1");
        book.setAuthor("저자1");

        //Function<Book, String> func1 = b -> b.getTitle();
        //Function<Book, String> func1 = Book::getTitle;
       // Function<Book, String> func1 = book::getTitle;
        //Function<Book, String> func1 = book::toString;
        //Supplier<String> func1 = book::getTitle;
        //System.out.println(func1.get());

        //Supplier<Book> func1 = () -> new Book();
        Supplier<Book> func1 = Book::new;

        BiFunction<String, String, Book> func2 = (s1, s2) -> new Book(s1, s2);
        BiFunction<String, String, Book> func3 = Book::new;
    }
}
