package exam03;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private transient String author; // 직렬화 배제
    private String publisher;

    private String price;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
