package exam02;

public class Outer {

    public Calculator cal = new Calculator() {
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public void method() {
        class Inner {
            void method() {
                System.out.println("지역 내부 클래스!");
            }
        }

        Inner in = new Inner();
        in.method();
    }
    /*
    public Calculator method2() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        return cal;
    }
    */
    public Calculator method2() {
       return new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
    }

    public Calculator method3(int num3) {
        return new Calculator() {
            public int add(int num1, int num2) {
                //num3 = 30; // final int num3;
                return num1 + num2 + num3;
            }
        };
    }
}
