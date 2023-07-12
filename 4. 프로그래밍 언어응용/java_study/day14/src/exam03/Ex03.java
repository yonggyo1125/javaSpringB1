package exam03;

import java.util.function.Consumer;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Orange", "Mango", "Melon" };

        //forEach(s -> System.out.println(s), fruits);
        forEach(System.out::println, fruits);
    }

    public static void forEach(Consumer<String> consumer, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            consumer.accept(strs[i]);
        }
    }
}
