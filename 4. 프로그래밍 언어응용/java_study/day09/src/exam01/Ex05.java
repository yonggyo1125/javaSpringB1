package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        //System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str1 주소 : " + str1.hashCode());
        //System.out.println("str2 주소 : " + System.identityHashCode(str2));
        System.out.println("str2 주소 : " + str2.hashCode());
    }
}
