package exam01;

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        Random rand = new Random();
        //rand.ints().limit(6).forEach(System.out::println);
        rand.ints(6).forEach(System.out::println);
    }
}
