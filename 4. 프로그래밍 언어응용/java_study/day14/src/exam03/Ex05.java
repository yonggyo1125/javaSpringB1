package exam03;

import java.util.stream.Stream;

public class Ex05 {
    public static void main(String[] args) {
        Stream.of("Apple", "Orange", "Melon").forEach(System.out::println);
    }
}
