package ObjetosInmutables;

public class Ninja {
    private final String nombre;
    private final String modo;


    public Ninja(String nombre, String modo) {
        this.nombre = nombre;
        this.modo = modo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getModo() {
        return modo;
    }


}
