package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());
        Calculator cal2 = new ProxyCalculator(new RecCalculator());

        long result1 = cal1.factorial(10);
        System.out.println("cal1 : " + result1);

        long result2 = cal2.factorial(10);
        System.out.println("cal2 : " + result2);
    }
}
