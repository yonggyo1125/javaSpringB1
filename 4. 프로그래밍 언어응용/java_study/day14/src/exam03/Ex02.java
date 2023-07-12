package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango", "Melon");
        Stream<String> stm = fruits.stream();

        stm.forEach(System.out::println);


    }
}
