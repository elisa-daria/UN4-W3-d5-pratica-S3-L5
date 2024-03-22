package elisadaria.entities;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

abstract class LibraryElement {
    //attributes
    private UUID codeISBN;
    private String title;
    private int yearOfPublication;
    private int numberOfPages;
    //constructors

    public LibraryElement() {
    }

    public LibraryElement(String title, int yearOfPublication, int numberOfPages) {
        this.setTitle(title);
        this.setYearOfPublication(yearOfPublication);
        this.setNumberOfPages(numberOfPages);
    }

    //getters

    public UUID getCodeISBN() {
        return codeISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    Random rdm=new Random();
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = rdm.nextInt(15,879);
    }

    //methods

    @Override
    public String toString() {
        return "LibraryElement{" +
                "codeISBN=" + codeISBN +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
