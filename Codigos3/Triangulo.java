package Codigos3;

public class Triangulo extends Figura {
    Triangulo(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Dentro del area de Triangulo");
        return dim1 * dim2 / 2;
    }
}
