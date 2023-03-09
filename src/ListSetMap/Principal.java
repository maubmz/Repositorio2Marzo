package ListSetMap;

import jdk.jfr.Percentage;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //list
        List<Alumno> listaAlum = new ArrayList<>();

        listaAlum.add(new Alumno("Mario", 18));
        listaAlum.add(new Alumno("Carlos", 22));
        listaAlum.add(new Alumno("Omar", 20));
        listaAlum.add(new Alumno("Cesar", 25));
        listaAlum.add(new Alumno("Haziel", 19));
        //tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaAlum.size());

        /*for (int i = 0; i < listaAlum.size(); i++) {
            Alumno al = listaAlum.get(i);
            System.out.println(al.getNombre() + "\n");
        }*/
        //ordenarlos

        for (Alumno a : listaAlum) {
            System.out.println(a);
        }
        //ordenarlos solo con nombre
        Iterator<Alumno> iterator = listaAlum.iterator();
        while (iterator.hasNext()) {
            Alumno alum = iterator.next();
            System.out.println(alum.getNombre());
        }

        //map
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Javier");
        persona.put("apellido", "Arreguin");
        persona.put("correo", "javiernila@gmail.com");
        persona.put("direccion", "ecatepec");

        System.out.println("Persona: " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre: " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido: " + apellido);

        System.out.println("Tamaño de la lista: " + persona.size());
        String direccion = persona.remove("direccion");
        System.out.println("eliminar: " + direccion);
        System.out.println("Persona: " + persona);

        //set
        Set<String> personajes = new HashSet<>();
        personajes.add("sekiro");
        personajes.add("Dante");
        personajes.add("MarioBros");
        personajes.add("Pacman");

        System.out.println("Personajes de videojuegos: " + personajes);
        System.out.println("Tamaño de la lista: " + personajes.size());

    }
}