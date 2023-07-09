package exam01;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            names.add("이름" + i);
        }

        names.stream().forEach(System.out::println);
        /*
        for (String name : names) {
            System.out.println(name);
        }
         */
    }
}
