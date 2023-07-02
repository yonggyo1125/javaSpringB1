package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method2();
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
