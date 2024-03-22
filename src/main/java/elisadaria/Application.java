package elisadaria;

import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("library-project");

    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();
        Faker faker= new Faker();
        System.out.println(faker.artist().name());
        System.out.println("Hello World!");
        emf.close();
        em.close();
    }
}
