package exam06;

public interface Buyer {
    void buy();

    default void order() { // public void order
        System.out.println("주문!");
    }
}
