package exam04;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> gets() {
        return items;
    }
}
