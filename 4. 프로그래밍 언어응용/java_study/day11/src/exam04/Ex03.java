package exam04;

public class Ex03 {
    public static void main(String[] args) {
        FruitBasket<Object> basket = new FruitBasket<>();
        basket.add(new Apple());
        basket.add(new Melon());
        basket.add(new Apple());

        Juicier.make2(basket); // Apple, Fruit, Object  <? super Fruit>
        //Juicier.make(basket); // Apple, Melon, Fruit    <? extends Fruit>
    }
}
