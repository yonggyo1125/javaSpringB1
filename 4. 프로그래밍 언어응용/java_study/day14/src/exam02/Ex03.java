package exam02;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        //Function<String, String> func1 = s -> s;
        Function<String, String> func1 = Function.identity();
        String str = func1.apply("ABC");
        System.out.println(str);

    }
}
