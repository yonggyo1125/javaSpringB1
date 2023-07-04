package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Book book1 = new Book("책1", "저자1", "출판사1");
        Book book2 = new Book("책1", "저자1", "출판사1");
        System.out.println("book1 == book2 : " + (book1 == book2));
        System.out.println("book1.equals(book2) : " + book1.equals(book2));

        System.out.println("book1 주소 : " + System.identityHashCode(book1));
        System.out.println("book2 주소 : " + System.identityHashCode(book2));
    }
}
