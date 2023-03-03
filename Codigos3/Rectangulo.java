package Codigos3;

public class Rectangulo extends Figura{

    Rectangulo(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Dentro del area de Rectangulo");
        return dim1 * dim2;
    }
}
