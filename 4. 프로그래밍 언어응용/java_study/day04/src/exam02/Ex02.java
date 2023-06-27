package exam02;

public class Ex02 {
    public static void main(String[] args) {
       // Schedule2 s2 = new Schedule2(2023, 6, 27);
        Schedule2 s2 = new Schedule2();
        /*
        s2.setYear(2023);
        s2.setMonth(6);
        s2.setDay(27);
        */

        System.out.println("---- s2 ----");
        System.out.println(s2); // s2.toString()

        System.out.println("---- this ----");
        s2.printThis();
    }
}
