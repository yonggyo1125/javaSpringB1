package exam01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Melon", "Mango"};

        String str = Arrays.stream(fruits)
                .collect(Collectors.joining("#"));
        System.out.println(str);
    }
}
