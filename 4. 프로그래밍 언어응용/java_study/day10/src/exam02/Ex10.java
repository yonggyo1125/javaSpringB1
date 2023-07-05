package exam02;

public class Ex10 {
    public static void main(String[] args) {
        String format = "%d + %d = %d";
        String str = String.format(format, 10, 20, 30);
        System.out.println(str);

        String format2 = "%s(%s)님 로그인...";
        String str2 = String.format(format2, "사용자01", "user01");
        System.out.println(str2);

        System.out.printf("%d + %d = %d%n", 10, 20, 30);
        System.out.printf("%s(%s)님 로그인...%n", "사용자01", "user01");
    }
}
