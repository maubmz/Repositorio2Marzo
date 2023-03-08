package Estatico;

public class Persona {
    private int lugarFila; //se asocia con un objeto y no con la clase, static es con la clase
    private String nombre;
    private static int registro;

    public Persona(String nombre) {
        this.lugarFila=registro++;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return lugarFila;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getRegistro(){
        return registro;
    }

    @Override
    public String toString() {
        return "Persona "+registro +" {" +
                " lugar en la fila:" +lugarFila +
                ", nombre=" + nombre +
                ", registro= "+registro+ '\'' +
                '}' ;
    }
}
