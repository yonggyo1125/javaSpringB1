package exam04;

public class Ex01 {
    public static void main(String[] args) {
        FruitBasket<Apple> appleBasket = new FruitBasket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicier.make(appleBasket);
    }
}
