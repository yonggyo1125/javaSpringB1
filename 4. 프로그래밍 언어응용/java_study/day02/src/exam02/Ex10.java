package exam02;

public class Ex10 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 짝수
                continue; // 건너띄기
            }

            total += i;
            /*
            if (i % 2 == 1) { // 홀수
                total += i;
            }
             */
        }
        System.out.println(total);
    }
}
