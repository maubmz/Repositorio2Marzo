package mx.com.gm.dao;

import jakarta.persistence.Query;
import mx.com.gm.domain.Alumno;


import java.util.List;

public class AlumnoDAO extends GenericDAO{

    public List<Alumno> listar(){
        String alumno = "SELECT a FROM Alumno a";
        em = getEntityManager();
        Query query = em.createQuery(alumno);
        return query.getResultList();

    }

    public void insertar (Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        /*finally {
            if (em != null) {
                em.close();
            }
        }*/
    }

    public void actualizar (Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        /*finally {
            if (em != null) {
                em.close();
            }
        }*/
    }
    public void eliminar (Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        /*finally {
            if (em != null) {
                em.close();
            }
        }*/
    }

    public Alumno buscarPorId(Alumno alumno){
        em = getEntityManager();
        return em.find(Alumno.class, alumno.getIdAlumno());
    }

}
