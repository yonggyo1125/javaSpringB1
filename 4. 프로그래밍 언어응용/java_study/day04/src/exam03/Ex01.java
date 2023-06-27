package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        Student s2 = new Student(1001, "학생2", "과목2");

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        s1.id = 1002;
    }
}
