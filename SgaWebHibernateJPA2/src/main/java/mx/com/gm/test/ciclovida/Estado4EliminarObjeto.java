package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.*;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //Recuperar un objeto de la base de datos
        //definimos la variable
        Contacto contacto = null;

        //recuperamos el objeto
        //1. detached
        contacto = em.find(Contacto.class, 3);

        em.getTransaction().begin();

        //3. remove
        em.remove(em.merge(contacto));

        em.getTransaction().commit();

        //3. transitivo
        System.out.println("contacto = " + contacto);


    }
}
