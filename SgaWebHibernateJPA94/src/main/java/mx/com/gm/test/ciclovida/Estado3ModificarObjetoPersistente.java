package mx.com.gm.test.ciclovida;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //RECUPERAR UN REGISTRO(OBJETO) DE LA BD
        //Y MODIFICAMOS SUS DATOS

        //Definimos la variable
        Contacto contacto = null;

        //Recuperamos el objeto
        //1.Estado Transitivo
        contacto = em.find(Contacto.class, 3);

        //Modificamos el objeto
        contacto.setEmail("clara@mail.com");
        em.getTransaction().begin();//Se inicia la transaccion
        //2.Estado Persistente
        em.persist(contacto);

        em.getTransaction().commit();//Cierra la transaccion

        //3.Estado Detached
        System.out.println("contacto = " + contacto);
    }
}
