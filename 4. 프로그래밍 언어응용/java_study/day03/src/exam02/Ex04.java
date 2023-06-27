package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showInfo();
        System.out.println("s1=" + System.identityHashCode(s1));

        Student s2 = new Student();
        s2.showInfo();
        System.out.println("s2=" + System.identityHashCode(s2));
        System.out.println(s1 == s2);
    }
}
