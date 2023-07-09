package exam02;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("이름5");
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");


        System.out.println(names);
    }
}
