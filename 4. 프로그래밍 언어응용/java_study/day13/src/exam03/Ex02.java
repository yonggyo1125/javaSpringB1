package exam03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");
        Collections.shuffle(names);

        String max = Collections.max(names); // 정렬 -> 가장 아래쪽
        String min = Collections.min(names); // 정렬 -> 가장 위쪽
        System.out.printf("max=%s,min=%s%n", max,min);
    }
}
