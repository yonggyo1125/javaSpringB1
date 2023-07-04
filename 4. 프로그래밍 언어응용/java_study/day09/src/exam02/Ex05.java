package exam02;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println("주소 : " + System.identityHashCode(sb));

        StringBuffer sb2 = sb.append("ABC");
        System.out.println("주소 : " + System.identityHashCode(sb2));

        StringBuffer sb3 = sb2.append("DEF");
        System.out.println("주소 : " + System.identityHashCode(sb3));

        StringBuffer sb4 = sb3.append("GHI");
        System.out.println("주소 : " + System.identityHashCode(sb4));

        String str = sb4.toString();
        System.out.println(str);
        System.out.println("str 주소 : " + System.identityHashCode(str));
    }
}
