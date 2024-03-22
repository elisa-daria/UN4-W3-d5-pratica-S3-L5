package elisadaria;

import com.github.javafaker.Faker;
import elisadaria.dao.UsersDAO;

import elisadaria.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("library-project");

    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();
        Faker faker= new Faker();
        UsersDAO usd= new UsersDAO(em);
        User u =new User(faker.artist().name(),faker.buffy().celebrities(),LocalDate.of(1998,5,2));
        User ua =new User(faker.artist().name(),faker.buffy().celebrities(), LocalDate.now());

//        usd.save(u);
       System.out.println( u.getLibraryCard() );System.out.println( ua.getLibraryCard() );
        System.out.println(u.toString());
        System.out.println(faker.artist().name());
        System.out.println("Hello World!");
        emf.close();
        em.close();
    }
}
