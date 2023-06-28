package exam01;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();// C, B, A

        System.out.println(ac instanceof A);
        System.out.println(ac instanceof B);
        System.out.println(ac instanceof C);
        System.out.println(ac instanceof D); // false
    }
}
