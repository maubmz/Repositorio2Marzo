package mx.com.gm.dao;

import mx.com.gm.domain.Producto_Factura;

import javax.persistence.Query;
import java.util.List;

public class Producto_FacturaDAO extends GenericDAO {
    public List<Producto_Factura> listar() {
        String consulta = "SELECT p FROM Producto_Factura p";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Producto_Factura producto_factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(producto_factura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void actualizar(Producto_Factura producto_factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(producto_factura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Producto_Factura producto_factura) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(producto_factura));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Object buscarPorId(Producto_Factura producto_factura) {
        em = getEntityManager();
        return em.find(Producto_Factura.class, producto_factura.getIdProdcutoFactura());
    }
}
