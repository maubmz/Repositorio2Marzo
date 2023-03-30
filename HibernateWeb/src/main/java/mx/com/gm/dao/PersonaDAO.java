package mx.com.gm.dao;

import jakarta.persistence.*;
import mx.com.gm.domain.Persona;

import java.util.List;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public List<Persona> listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
//        for (Persona p : personas) {
//            System.out.println("p = " + p);
//        }
        return personas;
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();//Iniciamos la transaccion
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();//Iniciamos la transaccion
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
        }
    }

    public Persona buscarPersonaPorId(Persona p) {
        return em.find(Persona.class, p.getIdPersona());
    }

    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();//Iniciamos la transaccion
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
        }
    }

}
