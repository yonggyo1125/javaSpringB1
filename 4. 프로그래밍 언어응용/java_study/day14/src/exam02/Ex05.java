package exam02;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        //Function<String, Integer> func1 = s -> s.length();
        Function<String, Integer> func1 = String::length;
        System.out.println(func1.apply("가나다"));

        Function<String, Integer> func2 = s -> s.length() * -1; // 메서드 참조 사용 불가

        //BiPredicate<String, String> func3 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> func3 = String::equals;
        System.out.println(func3.test("ABC", "ABC"));
    }
}
