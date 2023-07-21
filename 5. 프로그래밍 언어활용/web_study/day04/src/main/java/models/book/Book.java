package models.book;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Book {
    private String title;
    private String author;
    private String publisher;
}
