package Codigos7;

import Codigos2.Persona;

public class Empleado extends Persona {

    private int idPersona;
    private static int contadorPersonas; //Este pertence a la clase y no a la instancia en otra clase

    public Empleado(String nombre, int edad, int estatura, String nacimiento, String colorfav) {
        super(nombre, edad, estatura, nacimiento, colorfav);
        ++contadorPersonas;
        idPersona = contadorPersonas;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return super.toString() + "|" +
                "idPersona=" + idPersona +
                "} ";
    }
}
