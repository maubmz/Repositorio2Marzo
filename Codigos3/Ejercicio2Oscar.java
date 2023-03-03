package Codigos3;

import java.time.LocalDateTime;

public class Ejercicio2Oscar {

    public static void main(String[] args) {
        //Ejemplo de Sobrecarga
        Producto producto = new Producto("Catsup" ,25.5);
        Bolsa bolsa = new Bolsa();
        bolsa.anadirProductos(producto);
        bolsa.anadirProductos("Pelota",99.99);
        //Ejemplo de sobreescritura
        Figura figura = new Figura(10,10);
        Rectangulo rectangulo = new Rectangulo(10,5);
        Triangulo triangulo = new Triangulo(8 ,5);

        Figura figref;
        figref = rectangulo;
        System.out.println("El area es: " + figref.area());
        figref = triangulo;
        System.out.println("El area es: " + figref.area());
        figref = figura;
        System.out.println("El area es: " + figref.area());
        //Ejemplo de objetos inmutables
        String h = "HOLA";
        System.out.println(h);
        h.concat(" Y ADIOS");
        System.out.println(h);
        PersonaInfo personaInfo = new PersonaInfo("Juan", LocalDateTime.now());
        System.out.println(personaInfo.getNacimiento());
        //No se puede modificar la clase para el objeto ya creado
        //Ejemplo de objetos mutables
        PersonaInfoMut persona = new PersonaInfoMut("Oscar","23/07");
        persona.setNombre("Gabriel");
        persona.setNacimiento("25/06");
        System.out.println(persona.getNacimiento() +"  "+ persona.getNombre());
        String s = "HOLA";
        System.out.println(s);
        s = s + " Y ADIOS";
        System.out.println(s);
    }
}
