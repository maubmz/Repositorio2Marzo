package mx.com.gm.dao;


import mx.com.gm.domain.Cliente;

import javax.persistence.Query;
import java.util.List;

public class ClienteDAO extends GenericDAO {
     public List<Cliente> listar(){
        String consulta = "SELECT c FROM Cliente c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return ((Query) query).getResultList();
    }

    public void insertar(Cliente cliente){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        }catch (Exception ex){
            ex.printStackTrace(System.out);
        }
            finally {
               if(em != null){
                em.close();
             }
          }
    }
    public void actualizar(Cliente cliente){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        }catch (Exception ex){
            ex.printStackTrace(System.out);
        }
        finally {
            if(em != null){
                em.close();
            }
        }
    }

    public void eliminar(Cliente cliente){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
        }catch (Exception ex){
            ex.printStackTrace(System.out);
        }
        finally {
            if(em != null){
                em.close();
            }
        }
    }

    public Object buscarPorId(Cliente cliente){
        em = getEntityManager();
        return em.find(Cliente.class,cliente.getIdCliente());
    }

}
