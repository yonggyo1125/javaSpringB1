package coding.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {
        String[] strs1 = split("banana");
        System.out.println(Arrays.toString(strs1));

        String[] strs2 = split("aaabbaccccabba");
        System.out.println(Arrays.toString(strs2));
    }

    public static String[] split(String str) {
        // banana // charAt
        List<String> strs = new ArrayList<>();
        while(!str.isBlank()) {
            char x = str.charAt(0);
            int cntX = 1;
            int cntOther = 0;
            for (int i = 1; i < str.length(); i++) {
                if (x == str.charAt(i)) {
                    cntX++;
                } else {
                    cntOther++;
                }

                if (cntX == cntOther) {
                    strs.add(str.substring(0, i+1));
                    str = str.substring(i+1);
                    break;
                }
            }

            if (cntX != cntOther) {
                strs.add(str);
                break;
            }
        }

        return strs.toArray(String[]::new);
    }
}
