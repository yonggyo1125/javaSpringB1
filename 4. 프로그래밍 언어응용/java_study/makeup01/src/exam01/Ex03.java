package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        s1.study();
        System.out.println(System.identityHashCode(s1));

        Student s2 = new Student(1001, "학생2", "과목2");
        s2.study();
        System.out.println(System.identityHashCode(s2));

        Student s3 = s2;
        s3.name="학생3";
        s3.study();
        s2.study();
        System.out.println(System.identityHashCode(s3));

        s1 = null;
    }
}
