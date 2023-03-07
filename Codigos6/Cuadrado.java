package Codigos6;

public class Cuadrado extends FiguraGeometrica{
    protected Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Aqui se dibujar un: " + this.getClass().getSimpleName());
    }
}
