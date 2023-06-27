package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        s1.showInfo();

        Student s2 = new Student(1001, "학생2", "과목2");
        s2.showInfo();

        Student s3 = s2; // s3은 s2의 주소 값이 저장
        s3.id=1002;
        s3.name="학생3";
        s3.subject = "과목3";

        s3.showInfo();
        s2.showInfo();

        s1 = null;

    }
}
