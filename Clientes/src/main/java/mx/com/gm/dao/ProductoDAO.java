package mx.com.gm.dao;

import mx.com.gm.dao.GenericDAO;
import mx.com.gm.domain.Producto;

import javax.persistence.Query;
import java.util.List;

public class ProductoDAO extends GenericDAO {
    public List<Producto> listar() {
        String consulta = "SELECT p FROM Producto p";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Producto producto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Producto producto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Producto producto) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(producto));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Producto producto) {
        em = getEntityManager();
        return em.find(Producto.class, producto.getIdProducto());
    }
}
