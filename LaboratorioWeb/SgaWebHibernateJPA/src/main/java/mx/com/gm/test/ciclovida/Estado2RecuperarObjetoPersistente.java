package mx.com.gm.test.ciclovida;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;
        //se inicia una transaccion
        em.getTransaction().begin();

        //Recuperar un objeto de la BD
        contacto = em.find(Contacto.class, 3);

        //toda modificacion hecha antes del commit, se guardara en la BD
        em.getTransaction().commit();

        //detached (separado)
        System.out.println("contacto = " + contacto);
    }
}
