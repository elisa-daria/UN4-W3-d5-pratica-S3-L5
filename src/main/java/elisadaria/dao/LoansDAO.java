package elisadaria.dao;

import elisadaria.entities.Loan;
import elisadaria.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

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

    public List<Loan> getLoansByLibraryCard(long libraryCardId) {
        TypedQuery<Loan> query = em.createQuery("SELECT l FROM Loan l WHERE l.user.id = :libraryCardId", Loan.class);
        query.setParameter("libraryCardId", libraryCardId);
        return query.getResultList();
    }
}
