package elisadaria.entities;

import elisadaria.enums.MagType;

public class Magazine extends LibraryElement{
    //attributes
    private MagType periodicity;
    //constructors
    public Magazine(){
    }

    public Magazine(String title, int yearOfPublication, int numberOfPages, MagType periodicity) {
        super(title, yearOfPublication, numberOfPages);
        this.setPeriodicity(periodicity);
    }
    //getters

    public MagType getPeriodicity() {
        return periodicity;
    }

    //setters


    public void setPeriodicity(MagType periodicity) {
        this.periodicity = periodicity;
    }
}
