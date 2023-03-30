package mx.com.gm.test.ciclovida;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;

        //Recuperar un objeto de la BD
        //detached
        contacto = em.find(Contacto.class, 3);

        //2.modificamos el objeto
        contacto.setEmail("clara@mail.com");

        //se inicia una transaccion
        em.getTransaction().begin();

        //toda modificacion hecha antes del commit, se guardara en la BD
        //2. persistente
        //em.persist(contacto);
        //con merge se sincroniza con la BD y es mas recomendable
        em.merge(contacto);

        em.getTransaction().commit();

        //3. detached (separado)
        System.out.println("contacto = " + contacto);
    }
}
