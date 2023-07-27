package coding.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex10 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"May", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] scores = getScores(name, yearning, photo);
        System.out.println(Arrays.toString(scores));
    }

    public static int[] getScores(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> st = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            st.put(name[i].toUpperCase(), yearning[i]);
        }

        int[] scores = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {

            int score = 0;
            for (String p : photo[i]) {
                score += st.getOrDefault(p.toUpperCase(), 0);
            }
            scores[i] = score;
        }

        return scores;
    }
}
