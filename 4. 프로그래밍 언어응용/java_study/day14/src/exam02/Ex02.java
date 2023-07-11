package exam02;

import java.util.function.Function;

public class Ex02 {
    public static void main(String[] args) {
        // 1번째 함수 -> 문자열 ->  문자열 갯수
        Function<String, Integer> func1 = s -> s.length();
        System.out.println(func1.apply("ABC"));

        // 2번째 함수 -> 정수 -> 제곱
        Function<Integer, Integer> func2 = x -> x * x;
        System.out.println(func2.apply(10));

        // 3번째 함수 : 문자열 -> 문자열 갯수 -> 제곱
        Function<String, Integer> func3 = func1.andThen(func2);
        System.out.println(func3.apply("ABCD"));
    }
}
