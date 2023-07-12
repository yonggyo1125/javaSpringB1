package exam01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09 {
    public static void main(String[] args) {
        String[] fruits = Stream.of("Apple", "Orange", "Mango", "Melon")
                                .skip(2)
                                //.toArray(x -> new String[x]);
                                .toArray(String[]::new);
        System.out.println(Arrays.toString(fruits));
    }
}
