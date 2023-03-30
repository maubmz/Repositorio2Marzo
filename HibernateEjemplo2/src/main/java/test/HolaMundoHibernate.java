package test;


import jakarta.persistence.*;
import mx.com.gm.domain.Persona;

import java.util.List;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        //hql significa hibernate query lenguage
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();
        //con esto nos podemos conectar a nuestra base de datos

        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p: personas){
            System.out.println("Persona: "+p);

        }

    }
}