package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두발로 직립 보행");
    }

    public void readBook() {
        System.out.println("독서를 한다!");
    }
}
