package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 {
    public static void main(String[] args) {
        //BiFunction<Integer, Integer, Integer> cal = (a,b) -> a + b;
        //BinaryOperator<Integer> cal = (a,b) -> a + b;
        //int result = cal.apply(10, 20);
        IntBinaryOperator cal = (a, b) -> a + b;
        int result = cal.applyAsInt(10, 20);

        System.out.println(result);
    }
}
