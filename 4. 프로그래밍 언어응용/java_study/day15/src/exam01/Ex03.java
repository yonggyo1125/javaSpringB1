package exam01;

import java.util.stream.IntStream;

public class Ex03 {
    public static void main(String[] args) {
        //IntStream.range(0, 10).forEach(n -> System.out.println((n + 1) + "번 반복"));
        int total = IntStream.rangeClosed(1, 100).sum();
        System.out.println(total);
    }
}
