package elisadaria.dao;

import elisadaria.entities.Loan;
import elisadaria.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LoansDAO {
    EntityManager em;

    public LoansDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Loan loan){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(loan);
        transaction.commit();
        System.out.println("Prestito "+ loan.toString()+" salvato");
    }

}
