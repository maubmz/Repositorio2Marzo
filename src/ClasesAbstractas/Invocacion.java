package ClasesAbstractas;

public class Invocacion extends  Personaje{

    public Invocacion(){
        super();
        setNombre("Hawks");
    }
    @Override
    public void habilidades() {
        System.out.println("La invocacion tiene el poder del fuego");
    }
}
