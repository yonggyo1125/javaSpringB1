package exam01;

public class Student {
    static int id;
    String name;
    String subject;

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }


    public void instanceMethod() {
        //System.out.println(System.identityHashCode(this));
        /// 인스턴스 자원을 접근하기 위해 this가 필요, 접근하는 자원이 명확 -> this  생략 가능
        System.out.println(name + "," + subject + ", " + id);
        staticMethod();
    }

    public static void staticMethod() {
        //this.name = "이이름"; // 인스턴스 자원 접근 X
        id = 1000;
        System.out.println("정적 메서드!");
    }
}
