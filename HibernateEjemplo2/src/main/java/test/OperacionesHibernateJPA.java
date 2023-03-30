package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        //primero se lista los objetos
        personaDao.listar();

        //declaramos un objeto de tipo persona
        Persona persona = new Persona();
        //especificando el id de la persona que queremos recuperar
        persona.setIdPersona(3);

        //se manda a buscar a la persona
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = " + persona);

        //persona.setNombre("Carlos");
        //persona.setApellido("Esparza");
        //persona.setEmail("cesparza@mail.com");
        //persona.setTelefono("55443322");

        //personaDao.insertar(persona);

        //personaDao.modificar(persona);

        personaDao.eliminar(persona);
        personaDao.listar();

    }
}
