package PalabReservStatic;

public class EjercicioStatic {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("serresiete");
        System.out.println(jugador);

        Jugador jugador1 = new Jugador("messi");
        System.out.println(jugador1);
        //si se crean mas objetos de tipo jugador, el contador aumentara
    }
}