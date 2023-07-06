package exam04;

import java.util.List;

public class Juicier {
    /*
    public static void make(FruitBasket<Apple> basket) {
        List<Apple> fruits = basket.gets();
        System.out.println(fruits);
    }

    public static void make(FruitBasket<Melon> basket) {
        List<Melon> fruits = basket.gets();
        System.out.println(fruits);
    }*/
    public static void make(FruitBasket<?> basket) {
        List<?> fruits = basket.gets();
        System.out.println(fruits);
    }
}
