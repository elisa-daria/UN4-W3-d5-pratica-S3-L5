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
    public void delete(int id){
        LibraryElement eToDelete=this.getByISBN(id);
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.remove(eToDelete);
        transaction.commit();
        System.out.println("Elemento "+ eToDelete.toString()+" eliminato");
    }

    public List<LibraryElement> getByAuthor(String author){
        TypedQuery<LibraryElement>query=em.createNamedQuery("get_by_author",LibraryElement.class);
        query.setParameter("author",author);
        return query.getResultList();
    }
    public LibraryElement getByISBN(long isbn) {
        TypedQuery<LibraryElement> query = em.createNamedQuery("getByISBN", LibraryElement.class);
        query.setParameter("isbn", isbn);
        return query.getSingleResult();
    }

    public List<LibraryElement> getByYear(int year) {
        TypedQuery<LibraryElement> query = em.createNamedQuery("getByPublicationYear", LibraryElement.class);
        query.setParameter("year", year);
        return query.getResultList();
    }
    public List<LibraryElement> getByTitle(String title) {
        TypedQuery<LibraryElement> query = em.createNamedQuery("getByTitle", LibraryElement.class);
        query.setParameter("title", "%" + title + "%");
        return query.getResultList();
    }
}
