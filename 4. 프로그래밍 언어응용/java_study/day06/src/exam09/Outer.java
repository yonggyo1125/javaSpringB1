package exam09;

public class Outer {
    int num1 = 10;

    class Inner {
        int num1 = 20;
        static int num2 = 30; // JDK15 - 오류, JDK16 - 오류 X
        void method() {
            System.out.println(num1); // 20
            System.out.println(Outer.this.num1); // 10
            //outerMethod();
        }
    }

    public void outerMethod() {
        System.out.println("outerMethod()");
    }
}
