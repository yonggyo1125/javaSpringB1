package exam01;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        Class cls1 = Book.class;

        Book book = new Book();
        Class cls2 = book.getClass();
        */

        Class cls = Class.forName("exam01.Book");
    }
}
