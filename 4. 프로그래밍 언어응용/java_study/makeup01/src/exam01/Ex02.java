package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);
    }

    static int add(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
