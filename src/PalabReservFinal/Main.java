package PalabReservFinal;

public class Main {
    public static void main(String[] args) {

        Heladito.VAR_HELADERIA.setSabor("Gansito");
        System.out.println("El sabor de helado es: "+Heladito.VAR_HELADERIA.getSabor());

        Heladito.VAR_HELADERIA.setSabor("Chongos");
        System.out.println("El otro helado seria de: "+Heladito.VAR_HELADERIA.getSabor());
    }
}
