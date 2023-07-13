package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Melon", "Mango"};
        ArrayList<String> fruits2 = Arrays.stream(fruits)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(fruits2);
    }
}
