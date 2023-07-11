package exam02;

import java.util.function.IntPredicate;

public class Ex04 {
    public static void main(String[] args) {
        // 1. num  >= 10
        IntPredicate cond1 = x -> x >= 10;

        // 2. num <= 100
        IntPredicate cond2 = x -> x <= 100;

        // 3. 10 <= num <= 100
        IntPredicate cond3 = cond1.and(cond2);
        System.out.println(cond3.test(50)); // true
        System.out.println(cond3.test(5)); // false
        System.out.println(cond3.test(120)); // false

        // 4. num > 100
        IntPredicate cond4 = cond2.negate();
        System.out.println(cond4.test(101));
        System.out.println(cond4.test(99));
    }
}
