package exam03;

public class Ex01 {
    public static void main(String[] args) {
        LoginService s1 = LoginService.getInstance();
        LoginService s2 = LoginService.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1 : " + System.identityHashCode(s1));
        System.out.println("s2 : " + System.identityHashCode(s2));
    }
}
