package exam04;

public class Ex02 {
    public static void main(String[] args) {
        FruitBasket<Melon> melonBasket = new FruitBasket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make(melonBasket);
    }
}
