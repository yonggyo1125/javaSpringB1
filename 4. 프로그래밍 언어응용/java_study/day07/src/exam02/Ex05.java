package exam02;

public class Ex05 {
    public static void main(String[] args) {
        A a = new A() {
            public void method() {
                System.out.println("(수정)A메서드!");
            }
        };

        a.method();
    }
}
