package exam03;

public class Ex01 {
    public static void main(String[] args) {
       // C c = new C();
        //A a = new C();
        //B b = new C();
        A ac = new C();
        A ad = new D();

        if (ad instanceof C) {
            C c1 = (C) ad;
        }

        if (ac instanceof C) {
            C c2 = (C) ac;
            System.out.println("numA=" + c2.numA + ", numB=" + c2.numB + ", numC=" + c2.numC);
        }
    }
}
