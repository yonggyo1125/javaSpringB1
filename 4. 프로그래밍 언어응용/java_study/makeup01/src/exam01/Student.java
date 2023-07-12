package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 전공과목

    public Student() { // 기본 생성자
        // 객체 생성 이후 진행될 작업
        // 멤버 변수의 초기화 작업
        id = 1000;
        name = "이름1";
        subject = "과목1";
    }

    public Student(int _id, String _name, String _subject) {
        id = _id;
        name = _name;
        subject = _subject;
    }

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
