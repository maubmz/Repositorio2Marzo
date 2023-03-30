package mx.com.gm.test.ciclovida;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.com.gm.domain.Contacto;


public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("11223344");

        //2. persistimos el objeto
        em.getTransaction().begin();

        em.persist(contacto);

        //hasta que se hace el commit, se guarda realmente la informacion en la BD
        em.getTransaction().commit();

        //3. detachet (separado)
        System.out.println("contacto = " + contacto);

    }

}
