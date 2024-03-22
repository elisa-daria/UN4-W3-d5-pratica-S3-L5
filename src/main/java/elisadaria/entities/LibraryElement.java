package elisadaria.entities;


import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name="elemento_libreria")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "LibraryElement.getByISBN", query = "SELECT e FROM LibraryElement e WHERE e.codeISBN = :isbn")
public abstract class LibraryElement {
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_id")
    private long codeISBN;
    private String title;
    @Column(name="anno_di_pubblicazione")
    private int yearOfPublication;
    @Column(name="n_di_pagine")
    private int numberOfPages;
    @OneToOne
    private Loan loan;
    //constructors

    public LibraryElement() {
    }

    public LibraryElement(String title, int yearOfPublication, int numberOfPages) {
        this.setTitle(title);
        this.setYearOfPublication(yearOfPublication);
        this.setNumberOfPages(numberOfPages);
    }

    //getters

    public long getCodeISBN() {
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

    public void setNumberOfPages(int numberOfPages) {
        Random rdm=new Random();
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
