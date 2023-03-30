package mx.com.gm.dao;

import jakarta.persistence.Query;
import mx.com.gm.domain.Curso;

import java.util.List;

public class CursoDAO extends GenericDAO{

    public List<Curso> listar(){
        String curso = "SELECT c FROM Curso c";
        em = getEntityManager();
        Query query = em.createQuery(curso);
        return query.getResultList();

    }

    public void insertar (Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curso);
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

    public void actualizar (Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
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
    public void eliminar (Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(curso));
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

    public Curso buscarPorId(Curso curso){
        em = getEntityManager();
        return em.find(Curso.class, curso.getIdCurso());
    }
}

