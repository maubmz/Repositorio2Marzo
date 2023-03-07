package ClasesAbstractas;

public abstract class Personaje {
    private String personaje;
    public Personaje(){}

    public void arma(){
        System.out.println("El "+personaje+" usa un arma");
    }
    public abstract void habilidades();
        public void setNombre(String s){
            personaje = s;
        }

    public String getNombre() {
        return personaje;
    }
}
