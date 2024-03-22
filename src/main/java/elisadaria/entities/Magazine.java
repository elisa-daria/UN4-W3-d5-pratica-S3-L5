package elisadaria.entities;

import elisadaria.enums.MagType;
import jakarta.persistence.*;

@Entity
@Table(name="rivista")
public class Magazine extends LibraryElement{
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mag_id")
    private long id;
    private MagType periodicity;
    //constructors
    public Magazine(){
    }

    public Magazine(String title, int yearOfPublication, int numberOfPages, MagType periodicity) {
        super(title, yearOfPublication, numberOfPages);
        this.setPeriodicity(periodicity);
    }
    //getters

    public long getId() {
        return id;
    }

    public MagType getPeriodicity() {
        return periodicity;
    }

    //setters


    public void setPeriodicity(MagType periodicity) {
        this.periodicity = periodicity;
    }
}
