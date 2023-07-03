package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // ArithmethicException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointerException
            System.out.println(str);

        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);

        } catch (NullPointerException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
