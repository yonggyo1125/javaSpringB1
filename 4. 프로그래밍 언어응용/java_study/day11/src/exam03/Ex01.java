package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.put(new Apple());
        //appleBox.put(new Melon());

        Apple apple = appleBox.get();
        System.out.println(apple.get());
    }
}
