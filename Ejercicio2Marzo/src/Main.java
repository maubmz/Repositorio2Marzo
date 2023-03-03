import Metodos.Area.Poligono;
import MutablesInmutables.Mutable;

public class Main {
    public static void main(String[] args) {
        Poligono cuadrado=new Poligono(5);
        cuadrado.perimetro(cuadrado.getLado1());
        Poligono rectangulo=new Poligono(4.72F, 3.54F);
        rectangulo.perimetro(rectangulo.getLado1(), rectangulo.getLado2());
        Poligono triangulo=new Poligono(374.45F, 5252.52F, 22.24F);
        triangulo.perimetroTriangulo(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3());

        //pruebas de objetos mutables
        Mutable mutable=new Mutable(5);
        mutable.numero();
        mutable.setNum(9);
        mutable.numero();
    }

}