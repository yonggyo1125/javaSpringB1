package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";

        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
    }
}
