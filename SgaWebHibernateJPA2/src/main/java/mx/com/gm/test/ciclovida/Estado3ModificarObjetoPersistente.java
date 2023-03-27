package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //Recuperar un objeto de la base de datos
        //definimos la variable
        Contacto contacto = null;

        //recuperamos el objeto
        //1. detached
        contacto = em.find(Contacto.class, 3);

        //2.modificamos el objeto
        contacto.setEmail("clara@email.com");

        em.getTransaction().begin();

        //2.persistente
        //em.persist(contacto);
        em.merge(contacto);


        em.getTransaction().commit();

        //detached
        System.out.println("contacto = " + contacto);


    }
}
