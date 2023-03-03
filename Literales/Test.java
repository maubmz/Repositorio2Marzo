package Literales;

public class Test {
    //enteras
    int literal = 45;
    short literal1 = 4;
    long literal2 = 54626;
    //decimales
    double literal3 = 25.32;
    float literal4 = 73.24f;
    //boleanas
    boolean literal5 = true;
    byte literal6 = 56;
    //caracteres
    char literal7 = 'Y';

    public static void main(String[] args) {

        Test test = new Test();
        test.imprimirValores();

    }

    void imprimirValores(){
        System.out.println("Metodo imprimirValores");
        System.out.println("Valor por defecto literal:  " + literal);
        System.out.println("Valor por defecto literal1: " + literal1);
        System.out.println("Valor por defecto literal2: " + literal2);
        System.out.println("Valor por defecto literal3: " + literal3);
        System.out.println("Valor por defecto literal4: " + literal4);
        System.out.println("Valor por defecto literal5: " + literal5);
        System.out.println("Valor por defecto literal6: " + literal6);
        System.out.println("Valor por defecto literal7: " + literal7);
        System.out.println();
    }


}
