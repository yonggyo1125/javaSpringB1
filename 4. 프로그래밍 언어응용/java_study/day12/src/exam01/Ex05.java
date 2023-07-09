package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            names.add("이름" + i);
        }

        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        itr = names.iterator();
        while(itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
