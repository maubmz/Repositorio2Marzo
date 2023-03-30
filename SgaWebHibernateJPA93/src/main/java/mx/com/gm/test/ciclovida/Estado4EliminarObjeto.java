package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //RECUPERAR UN REGISTRO(OBJETO) DE LA BD
        //Y ELIMINAMOS EL OBJETO

        //Definimos la variable
        Contacto contacto = null;

        //Recuperamos el objeto
        //1.Estado Transitivo
        contacto = em.find(Contacto.class, 3);

        //Eliminamos el objeto

        em.getTransaction().begin();//Se inicia la transaccion

        //2.Estado Persistente(metodo "remove")
        em.remove(em.merge(contacto));

        em.getTransaction().commit();//Cierra la transaccion

        //3.Estado Transitivo
        System.out.println("contacto = " + contacto);
    }
}
