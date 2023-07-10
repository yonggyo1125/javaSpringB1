package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
    public static void main(String[] args) {
        String[] names = {"이름5", "이름3", "이름4", "이름1", "이름2"};
        //Arrays.sort(names); // Comparable::compareTo -> Natural Ordering
        Arrays.sort(names, Comparator.reverseOrder()); // 내림차순

        System.out.println(Arrays.toString(names));
    }
}
