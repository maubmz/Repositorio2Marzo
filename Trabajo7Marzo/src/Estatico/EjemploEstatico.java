package Estatico;

public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona=new Persona("Pedro");
        System.out.println(persona);

        Persona persona1=new Persona("Maria");
        System.out.println(persona1);

        Persona persona2=new Persona("jazmin");
        System.out.println(persona2);
        System.out.println("Contador="+Persona.getRegistro());
    }
}
