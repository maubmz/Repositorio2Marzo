package mx.com.gm.dao;

import jakarta.persistence.Query;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;

import java.util.List;

public class ContactoDAO extends GenericDAO{

    public List<Contacto> listar(){
        String consulta = "SELECT c FROM Contacto c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }


    public void actualizar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void eliminar(Contacto contacto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(contacto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public Contacto buscarporId(Contacto contacto){
        em = getEntityManager();
        return em.find(Contacto.class, contacto.getIdContacto());
    }


}
