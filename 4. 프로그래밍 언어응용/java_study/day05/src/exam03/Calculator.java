package exam03;

public abstract class Calculator {
    int num = 10;

    public abstract int add(int num1, int num2);

    public void commonMethod() {
        System.out.println("공통 기능!");
    }
}
