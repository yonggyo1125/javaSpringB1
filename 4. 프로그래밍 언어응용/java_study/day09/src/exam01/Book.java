package exam01;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
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

    @Override
    public boolean equals(Object obj) { // Object obj = book2
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (title.equals(book.title) && author.equals(book.author)
                    && publisher.equals(book.publisher)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }
}
