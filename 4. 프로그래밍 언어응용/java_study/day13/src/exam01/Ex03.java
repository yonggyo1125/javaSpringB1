package exam01;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01", "123456");
        members.put("user02", "123456");
        members.put("user03", "123456");
        members.put("user04", "123456");
        members.put("user05", "123456");

        members.put("user02", "234567");

        members.remove("user02");

        String password = members.get("user02");
        System.out.println(password);

    }
}
