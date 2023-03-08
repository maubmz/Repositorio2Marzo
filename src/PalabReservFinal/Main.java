package PalabReservFinal;

public class Main {
    public static void main(String[] args) {

        Heladito.heladeria.setSabor("Gansito");
        System.out.println("El sabor de helado es: "+Heladito.heladeria.getSabor());

        Heladito.heladeria.setSabor("Chongos");
        System.out.println("El otro helado seria de: "+Heladito.heladeria.getSabor());
    }
}
