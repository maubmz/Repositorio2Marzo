package mx.com.gm.test.ciclovida;

import mx.com.gm.domain.Contacto;

import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //Recuperar un objeto de la base de datos
        //definimos la variable
        Contacto contacto = null;
       //recuperamos el objeto
        contacto = em.find(Contacto.class, 3);

        //em.getTransaction().begin();
        //detached
        System.out.println("contacto = " + contacto);


    }
}
