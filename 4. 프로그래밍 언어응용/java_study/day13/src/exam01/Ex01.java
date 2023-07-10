package exam01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // o1.compareTo(o2) * -1;
            }
        };

       // Set<String> names = new TreeSet<>(comp);
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름3");
        names.add("이름4");
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름5");

        System.out.println(names);
    }
}

