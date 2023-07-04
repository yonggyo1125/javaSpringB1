package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("주소 : " + System.identityHashCode(str));

        str += "DEF";
        System.out.println("주소 : " + System.identityHashCode(str));

        str += "GHI";
        System.out.println("주소 : " + System.identityHashCode(str));
    }
}
