package exam01;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        String[] strs = { "AA", "AA", "BB", "BB", "CC" };
        String[] strs2 = Arrays.stream(strs).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(strs2));
    }
}
