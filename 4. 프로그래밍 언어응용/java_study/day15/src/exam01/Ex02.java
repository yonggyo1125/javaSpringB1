package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,40,50);
        int total = nums.stream().mapToInt(x->x).sum();
        System.out.println(total);

    }
}
