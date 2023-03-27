package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.listar();

        Persona persona = new Persona();
        persona.setIdPersona(3);

        persona = personaDAO.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = " + persona);

        //persona.setNombre("Carlos");
        // persona.setApellido("Esparza");
        //persona.setEmail("cesparza@email.com");
        //persona.setTelefono("55776836");

        //personaDAO.insertar(persona);

        //personaDAO.modificar(persona);
        personaDAO.eliminar(persona);
        personaDAO.listar();
    }

}
