package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;
import javax.persistence.*;

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
        //em.flush();
        em.getTransaction().commit();

        //3. detached (separado)
        System.out.println("contacto = " + contacto);


    }
}
