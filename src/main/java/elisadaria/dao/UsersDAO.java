package elisadaria.dao;

import elisadaria.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UsersDAO {
    EntityManager em;
    public UsersDAO(EntityManager em){ this.em=em;}
    public void save(User user){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(user);
        transaction.commit();
        System.out.println("Utente "+ user.toString()+" salvato");
    }
}
