import Interfaz.Rectangulo;
import Interfaz.Triangulo;
import clasesAbstractas.Cuadrado;
import clasesAbstractas.Hexagono;
import herencia.Alumno;
import herencia.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Herencia--------");
        Alumno alumno1=new Alumno("Alexis", "Lombardini", 19,"319160");
        System.out.println(alumno1.toString());
        System.out.println();
        alumno1.setNombre("Mauricio");
        alumno1.setApellido("Baeza");
        System.out.println(alumno1.toString());
        System.out.println();
        System.out.println("--------Clases abstractas--------");
        Cuadrado cuadrado=new Cuadrado();
        System.out.println("El perimetro del cuadrado es:"+cuadrado.perimetro(20.34f));
        Hexagono hexagono=new Hexagono();
        System.out.println("El perimetro del hexagono es:"+hexagono.perimetro(23424.424f));
        System.out.println();
        System.out.println("--------Intefaces--------");
        Rectangulo rectangulo=new Rectangulo(42f, 42.42f);
        System.out.println("El area del rectangulo es: "+rectangulo.area());
        System.out.println("El periemtro del rectangulo es: "+rectangulo.perimetro());
        Triangulo triangulo=new Triangulo(42f,4,42f,42f);
        System.out.println("El area del triangulo es: "+triangulo.area());
        System.out.println("El perimetro del triangulo es: "+triangulo.perimetro());
    }
}