package exam04;

import java.util.List;

public class Juicier {
    public static void make(FruitBasket<Apple> basket) {
        List<Apple> fruits = basket.gets();
        System.out.println(fruits);
    }
}
