package mx.com.gm.dao;

import mx.com.gm.domain.Factura;

import javax.persistence.Query;
import java.util.List;

public class FacturaDAO extends GenericDAO {
    public List<Factura> listar() {
        String consulta = "SELECT f FROM Factura f";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Factura factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(factura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Factura factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(factura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Factura factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(factura));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Factura factura) {
        em = getEntityManager();
        return em.find(Factura.class, factura.getIdFactura());
    }
}
