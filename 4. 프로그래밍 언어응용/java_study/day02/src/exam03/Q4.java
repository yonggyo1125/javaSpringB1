package exam03;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i + "단 =========");
            for (int j = 1; j <= 9; j++) {
                System.out.println(j + " X " + i + " = " + (i * j));
            }
        }
    }
}
