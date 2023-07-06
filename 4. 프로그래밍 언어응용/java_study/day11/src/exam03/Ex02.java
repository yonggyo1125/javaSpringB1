package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple());

        appleBox.printInfo();

    }
}
