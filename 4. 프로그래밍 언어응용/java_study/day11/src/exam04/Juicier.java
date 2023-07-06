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
    public static void make(FruitBasket<? extends Fruit> basket) { // ? Apple, Melon, Fruit
        List<?> fruits = basket.gets();
        System.out.println(fruits);
    }

    public static <T extends Fruit> void make3(FruitBasket<T> basket) {
        List<T> fruits = basket.gets();
        System.out.println(fruits);
    }

    public static void make2(FruitBasket<? super Apple> basket) { // ? Apple, Fruit, Object
        List<?> fruits = basket.gets();
        System.out.println(fruits);
    }
}
