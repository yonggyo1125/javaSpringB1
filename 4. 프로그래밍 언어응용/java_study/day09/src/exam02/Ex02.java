package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

        System.out.println("str1 == str2 : " + (str1 == str2));
    }
}
