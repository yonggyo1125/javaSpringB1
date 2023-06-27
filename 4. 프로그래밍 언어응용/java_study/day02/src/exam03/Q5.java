package exam03;

public class Q5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 =========");
            for (int j = 1; j <= 9; j++) {
                if (i > j) {
                    continue;
                }

                System.out.println(j + " X " + i + " = " + (i * j));

            }
        }
    }
}
