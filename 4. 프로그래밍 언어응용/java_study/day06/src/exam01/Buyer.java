package exam01;

public interface Buyer {
    void buy();

    default void order() {
        System.out.println("Buyer - 주문!");
    }
}
