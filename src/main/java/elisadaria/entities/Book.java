package elisadaria.entities;

import elisadaria.enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
@NamedQuery(name = "get_by_author", query = "SELECT b FROM Book b WHERE b.author=:author")
public class Book extends LibraryElement{
    //attributes
    @Id
    @GeneratedValue
    private long id;
    private String author;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    //constructors
    public Book(){
    }
    public Book(String title, int yearOfPublication, int numberOfPages, String author, Genre genre) {
        super(title, yearOfPublication, numberOfPages);
        this.setAuthor(author);
        this.setGenre(genre);
    }

    //getters

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    //setters

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
