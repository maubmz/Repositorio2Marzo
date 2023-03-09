package PalabReservStatic;

public class Jugador {
    private String nombre;
    private int numJugador;

    //static es de la clase
    private static int goles;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.numJugador = ++goles;

    }
//se hacen sus getters y setters
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
        return "Numero de jugador: " +numJugador +" , Nombre del jugador: "+nombre+" , Goles:"+goles;
    }
}
