package exam03;

public class Box<T extends Fruit & Eatable> { // Apple, Fruit
    private T item;

    //private T[] nums = new T[3];
    //private static T item2;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void printInfo() {
        String itemNm = item.get(); // Fruit apple = new Apple()
        System.out.println(itemNm);
    }
}
