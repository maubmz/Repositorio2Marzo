package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //RECUPERAR UN REGISTRO(OBJETO) DE LA BD

        //Definimos la variable
        Contacto contacto = null;

        em.getTransaction().begin();

        //Recuperamos el objeto(Estado Persistente)
        contacto = em.find(Contacto.class, 3);

        em.getTransaction().commit();

        //Estado Detached
        System.out.println("contacto = " + contacto);

    }
}
