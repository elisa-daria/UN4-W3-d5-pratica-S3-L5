package elisadaria.dao;

import elisadaria.entities.LibraryElement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

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

    public List<LibraryElement> getByAuthor(String author){
        TypedQuery<LibraryElement>query=em.createNamedQuery("get_by_author",LibraryElement.class);
        query.setParameter("author",author);
        return query.getResultList();
    }
    public LibraryElement getByISBN(long isbn) {
        TypedQuery<LibraryElement> query = em.createNamedQuery("LibraryElement.getByISBN", LibraryElement.class);
        query.setParameter("isbn", isbn);
        return query.getSingleResult();
    }
}
