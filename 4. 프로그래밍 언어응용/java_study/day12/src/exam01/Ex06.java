package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex06 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            names.add("이름" + i);
        }

        ListIterator<String> itr = names.listIterator();
        while(itr.hasNext()) { // 순방향
            String name = itr.next();
            int index = itr.nextIndex();
            System.out.printf("name=%s,index=%d%n", name, index);
        }

        while(itr.hasPrevious()) { // 역방향
            String name = itr.previous();
            int index = itr.previousIndex();
            System.out.printf("name=%s,index=%d%n", name, index);
        }
    }
}
