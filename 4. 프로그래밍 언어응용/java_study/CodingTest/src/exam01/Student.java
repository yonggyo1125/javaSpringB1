package exam01;

public class Student {
    static int id;
    String name;
    String subject;

    public static void staticMethod() {
        System.out.println("정적 메서드");
        //this.subject = "A";
        
    }

    public void instanceMethod() {
        System.out.println("인스턴스 메서드");
        staticMethod();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
