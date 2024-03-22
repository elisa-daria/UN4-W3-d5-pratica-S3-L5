package elisadaria.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="users")
public class User {
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_library_card")
    private long id;

    private String name;
    private String surname;
    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy="user")
    private List<Loan> loans;


    //constructors

    public User() {
    }

    public User(String name, String surname, LocalDate dateOfBirth) {
        this.setName(name);
        this.setSurname(surname);
        this.setDateOfBirth(dateOfBirth);


    }
    //getters


    public long getLibraryCard() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    //method
    @Override
    public String toString() {
        return "User{" +
                "libraryCard=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
