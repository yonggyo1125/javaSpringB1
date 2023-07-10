package exam03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
        Collections.shuffle(names);

        System.out.println("Before : " + names);

        Collections.sort(names);

        System.out.println("After : " + names);

        Collections.sort(names, Collections.reverseOrder());

        System.out.println("After : " + names);
    }
}
