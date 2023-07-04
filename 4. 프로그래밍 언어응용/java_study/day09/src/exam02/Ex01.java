package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

        System.out.println("str1 == str2 : " + (str1 == str2));
    }
}
