package exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01", "123456");
        members.put("user02", "123456");
        members.put("user03", "123456");
        members.put("user04", "123456");
        members.put("user05", "123456");

        /**
        Set<String> keys = members.keySet();
        for (String key : keys) {
            String value = members.get(key);
            System.out.printf("key=%s, value=%s%n", key, value);
        }
         */
        Set<Map.Entry<String, String>> entries = members.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
