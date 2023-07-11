package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int c = 10;

        Calculator cal = (a,b) -> {
            //c = 20; // final int c = 20;
            return a + b + c;
        };

        Calculator cal2 = new Calculator() {
            @Override
            public int add(int num1, int num2) {
               // c = 20;
                return num1 + num2 + c;
            }
        };
    }
}
