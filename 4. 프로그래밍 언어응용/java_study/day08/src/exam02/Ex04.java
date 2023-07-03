package exam02;

public class Ex04 {
    public static void main(String[] args) {
        try (MyResource my = new MyResource()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
