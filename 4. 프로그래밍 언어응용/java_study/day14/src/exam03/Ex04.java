package exam03;

import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
