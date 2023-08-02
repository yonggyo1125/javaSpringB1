package exam05;

public class Message2 {
    public void init() {
        System.out.println("init!");
    }

    public void send(String message) {
        System.out.printf("메세지 전송 : %s%n", message);
    }

    public void close() {
        System.out.println("close!");
    }
}
