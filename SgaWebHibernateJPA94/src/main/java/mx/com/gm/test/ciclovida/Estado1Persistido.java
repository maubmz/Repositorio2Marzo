package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //AGREGAR UN REGISTRO(OBJETO) EN LA BD

        //1.Estado transitivo (No esta en la base de datos)
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
//        contacto.setTelefono("1122334455");

        //2.Estado Persistente del objeto
        em.getTransaction().begin();
        em.persist(contacto);
//        em.flush();   //Solo se sincroniza lo que se tiene pendiente en la BD
        em.getTransaction().commit();
        
        //3.Estado Detached (Separado)
        System.out.println("contacto = " + contacto);
        

    }
}
