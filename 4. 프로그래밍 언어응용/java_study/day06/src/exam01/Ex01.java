package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();

        order.buy();
        order.sell();

        Buyer buyer = order;
        Seller seller = order;

        order.order();
    }
}
