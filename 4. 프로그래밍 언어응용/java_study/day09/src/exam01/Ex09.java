package exam01;

import java.util.Arrays;

public class Ex09 {
    public static void main(String[] args) {
        int result = add(10, 20, 30, 40, 50, 60);
        System.out.println(result);
    }

    public static int add(int... nums) {

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
