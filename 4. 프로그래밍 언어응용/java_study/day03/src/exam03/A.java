package exam03;

public class A {
    public int  num1 = 10; // 패키지 외부에서도 접근 가능
    int num2 = 20; // default - 동일 패키지에서만 접근 가능
    private int num3 = 30; // private - 클래스 내부

    protected int num4 = 40; // 동일패키지 + 상속 : 클래스 내부

    public A() {
        num3 = 10;
    }
}
