package exam02;

public class Ex08 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1, j = 1; i <= 100 && j <= 50; i++, j++) {
            total += i;
            System.out.println(j + "회");
        }

        System.out.println(total);
    }
}
