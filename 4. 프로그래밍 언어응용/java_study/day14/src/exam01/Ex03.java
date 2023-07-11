package exam01;

public class Ex03 {
    public static void main(String[] args) {
        //MyLamda my1 = s -> System.out.println(s);
        //my1.print("ABC");
        MyLamda my2 = () -> System.out.println("출력");
        my2.print();
    }
}
