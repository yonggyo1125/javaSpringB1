package exam07;

public interface Buyer {
    void buy(); // public abstract

    default void order() {
        System.out.println("Buyer 주문!");
    }
}
