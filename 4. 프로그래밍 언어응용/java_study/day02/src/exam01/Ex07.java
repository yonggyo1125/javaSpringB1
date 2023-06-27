package exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num = 10;

        String str = num == 10 ? "10입니다." : "10이 아닙니다.";
        System.out.println(str);

        if (num == 10) {
            System.out.println("10입니다.");
        } else {
            System.out.println("10이 아닙니다.");
        }
    }
}
