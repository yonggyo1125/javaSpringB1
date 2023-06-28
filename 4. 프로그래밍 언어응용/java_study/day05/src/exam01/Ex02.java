package exam01;

public class Ex02 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();

        if (ad instanceof C) {
            C c1 = (C) ad;
        }

        if (ac instanceof C) {
            C c2 = (C)ac;
            System.out.println(c2.numA + "," + c2.numB + "," + c2.numC);

            B b1 = (B)ac;
            
        }
    }
}
