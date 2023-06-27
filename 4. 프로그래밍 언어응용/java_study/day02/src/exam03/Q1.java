package exam03;

public class Q1 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.0;

        //int result = (int)(num1 * num2); // 정답
        //int result2 = num1 * (int)num2; // 오답

        int num3 = 3;
        double num4 = 3.4;
        //int result3 = num3 * (int)num4;
        int result3 = (int)(num3 * num4);
        System.out.println(result3);
        System.out.println(num3 * num4);

    }
}
