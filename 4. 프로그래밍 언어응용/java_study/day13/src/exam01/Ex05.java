package exam01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex05 {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        //Map<String, String> members = new TreeMap<>(comp);
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder());
        members.put("user03", "123456");
        members.put("user04", "123456");
        members.put("user01", "123456");
        members.put("user02", "123456");
        members.put("user05", "123456");

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
