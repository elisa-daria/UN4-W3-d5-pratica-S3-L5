package elisadaria.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="loans")
public class Loan {
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "beginning_of_loan")
    private LocalDate startOfTheLoan;
    @Column(name = "data_reso_prevista")
    private LocalDate previewedEndOfTheLoan;
    @Column(name = "effettivo_reso")
    private LocalDate endOfTheLoan;
    @ManyToOne
    @JoinColumn(name="id_library_card")
    private User user;
    private LibraryElement elementLoaned;
    //constructors

    public Loan() {
    }

    public Loan(LocalDate startOfTheLoan, LocalDate endOfTheLoan, User user, LibraryElement elementLoaned) {
        this.setStartOfTheLoan(startOfTheLoan);
        this.setPreviewedEndOfTheLoan(startOfTheLoan);
        this.setEndOfTheLoan(endOfTheLoan);
        this.setUser(user);
        this.setElementLoaned(elementLoaned);
    }
    //getters

    public LocalDate getStartOfTheLoan() {
        return startOfTheLoan;
    }

    public LocalDate getPreviewedEndOfTheLoan() {
        return previewedEndOfTheLoan;
    }

    public LocalDate getEndOfTheLoan() {
        return endOfTheLoan;
    }

    public User getUser() {
        return user;
    }

    public LibraryElement getElementLoaned() {
        return elementLoaned;
    }

    //setters

    public void setStartOfTheLoan(LocalDate startOfTheLoan) {
        this.startOfTheLoan = startOfTheLoan;
    }

    public void setPreviewedEndOfTheLoan(LocalDate startOfTheLoan) {
        this.previewedEndOfTheLoan = startOfTheLoan.plusDays(29) ;
    }

    public void setEndOfTheLoan(LocalDate endOfTheLoan) {
        this.endOfTheLoan = endOfTheLoan;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setElementLoaned(LibraryElement elementLoaned) {
        this.elementLoaned = elementLoaned;
    }


    //method(!ricorda il possibile loop con il toString bi)
}
