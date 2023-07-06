package exam04;

public class Ex01 {
    public static void main(String[] args) {
        FruitBasket<Fruit> appleBasket = new FruitBasket<>(); // Apple, Melon, Fruit
        appleBasket.add(new Apple());
        appleBasket.add(new Melon());
        appleBasket.add(new Apple());

        Juicier.make(appleBasket);
        Juicier.make3(appleBasket);
    }
}
