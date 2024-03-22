package elisadaria.entities;

import elisadaria.enums.Genre;

public class Book extends LibraryElement{
    //attributes
    private String author;
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
