package elisadaria.dao;

import elisadaria.entities.LibraryElement;
import elisadaria.entities.Loan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LibraryElementsDAO {
    EntityManager em;

    public LibraryElementsDAO(EntityManager em) {
        this.em = em;
    }
    public void save(LibraryElement libraryElement){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(libraryElement);
        transaction.commit();
        System.out.println("Elemento Catalogo "+ libraryElement.toString()+" salvato");
    }
}
