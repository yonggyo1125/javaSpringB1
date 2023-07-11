package exam01;

public class Ex04 {
    public static void main(String[] args) {
        //Calculator cal = (a,b) -> a + b;
        //int result = add(cal, 10, 20);
        int result = add((a, b) -> a + b, 10, 20);
        System.out.println(result);

        Calculator cal = getCalculator();
    }

    public static int add(Calculator cal, int num1, int num2) {
        return cal.add(10, 20);
    }

    public static Calculator getCalculator() {
        //Calculator cal = (a,b) -> a + b;

        //return cal;
        return (a,b) -> a + b;
    }
}
