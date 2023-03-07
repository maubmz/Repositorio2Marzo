package ClasesAbstractas;

public class Ayudante extends Personaje{

    public Ayudante(){
    super();
    setNombre("Ayudante");
}
    @Override
    public void habilidades() {
        System.out.println("El ayudante usara una habilidad");
    }
}
