package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int num = 10;

        boolean result = ++num > 11 || (num = num + 20) > 20;
        System.out.println(num);
    }
}
