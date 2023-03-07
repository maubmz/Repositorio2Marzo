package Codigos6;

public class Triangulo extends FiguraGeometrica{
    protected Triangulo(String tipoFigura) {
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Aqui se dibujar un: " + this.getClass().getSimpleName());
    }
}
