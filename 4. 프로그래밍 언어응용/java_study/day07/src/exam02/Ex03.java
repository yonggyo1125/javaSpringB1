package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Calculator cal = out.method3(10);
        int result = cal.add(20, 30);// 20 + 30 + 10
        System.out.println(result);
    }
}
