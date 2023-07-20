package coding.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex08 {
    public static void main(String[] args) {
        int[] winNums = getWinNums();
        int[] lottos1 = { 44, 1, 0, 0, 31, 25 };
        int[] result1 = getLottoRanks(lottos1, winNums);
        System.out.println(Arrays.toString(winNums));
        System.out.println(Arrays.toString(lottos1));
        System.out.println(Arrays.toString(result1));

        int[] result2 = getLottoRanks(winNums, winNums);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] getLottoRanks(int[] lottos, int[] winNums) {
        int hidden = 0; // 0의 갯수
        int match = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                hidden++;
            } else {
                boolean result = Arrays.stream(winNums).anyMatch(x -> x == lotto);
                if (result) match++;
            }
        }

        int maxRank = 7 - match - hidden;
        int minRank = 7 - match;

        return new int[]{maxRank, minRank > 6 ? 6 : minRank};
    }

    public static int[] getWinNums() {
        Set<Integer> winNums = new HashSet<>();

        while(winNums.size() < 6) {
            int num = (int)(Math.random() * 45) +1; // 1~45
            winNums.add(num);
        }

        int[] lottos = winNums.stream().mapToInt(x -> x).toArray();
        return lottos;
    }
}
