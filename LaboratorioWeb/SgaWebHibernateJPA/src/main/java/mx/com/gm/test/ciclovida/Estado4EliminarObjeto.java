package mx.com.gm.test.ciclovida;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;

        //Recuperar un objeto de la BD
        //detached
        contacto = em.find(Contacto.class, 3);

        //se inicia una transaccion
        em.getTransaction().begin();

        //toda modificacion hecha antes del commit, se guardara en la BD
        //3. remove
        //para eliminar, es recomendable sincronizar con la BD con merge
        em.remove(em.merge(contacto));

        em.getTransaction().commit();

        //3. transitivo
        System.out.println("contacto = " + contacto);
    }
}
