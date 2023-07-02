package exam01;

public class Outer {
    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        void method() {
            System.out.println("정적 내부 클래스!");
            num2 = 30;
        }
    }
}
