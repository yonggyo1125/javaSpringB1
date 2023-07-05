package exam03;

public class Ex05 {
    public static void main(String[] args) {
        double result = add(10, 123.12F);
        System.out.println(result);

        double result2 = add(10.1234, 10L);
        System.out.println(result2);

        double result3 = add(10, 20L);
        System.out.println(result3);
    }

    public static double add(Number num1, Number num2) {
        double result = num1.doubleValue() + num2.doubleValue();

        return result;
    }
}
