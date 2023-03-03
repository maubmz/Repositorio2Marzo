package ObjetosInmutables;

public class Main {
    public static void main(String[] args) {
        Ninja ninja=new Ninja("Sekiro", "Shura");

        System.out.println(ninja.getNombre());
        System.out.println(ninja.getModo());
    }
}
