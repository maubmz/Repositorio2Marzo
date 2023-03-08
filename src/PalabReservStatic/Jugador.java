package PalabReservStatic;

public class Jugador {
    private String nombre;
    private int numJugador;
    private static int goles;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.numJugador = ++goles;
    }

    public int getNumJugador() {
        return this.numJugador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getGoles(){
        return goles;
    }

    public String toString(){
        return "numJugador: " +numJugador +" , nombre: "+nombre+" , goles:"+goles;
    }
}
