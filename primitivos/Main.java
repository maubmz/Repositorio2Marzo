package primitivos;

public class Main {


    int primitivo;
    short primitivo1;
    long primitivo2;
    double primitivo3;
    float primitivo4;
    boolean primitivo5;
    byte primitivo6;
    char primitivo7;
    public static void main(String[] args) {
        Main main = new Main();

        main.imprimirValoresPorDefecto();
        main.AgregarValores();

    }
    void imprimirValoresPorDefecto(){
        System.out.println("Metodo imprimirValoresPorDefectos");
        System.out.println("Valor por defecto primitivo: " + primitivo);
        System.out.println("Valor por defecto primitivo1: " + primitivo1);
        System.out.println("Valor por defecto primitivo2: " + primitivo2);
        System.out.println("Valor por defecto primitivo3: " + primitivo3);
        System.out.println("Valor por defecto primitivo4: " + primitivo4);
        System.out.println("Valor por defecto primitivo5: " + primitivo5);
        System.out.println("Valor por defecto primitivo6: " + primitivo6);
        System.out.println("Valor por defecto primitivo7: " + primitivo7);
        System.out.println();
        }


    void AgregarValores(){
        System.out.println("Metodo AgregarValores");
        System.out.println("Valor por defecto primitivo: " + (primitivo = 23546546));
        System.out.println("Valor por defecto test1: " + (primitivo1 = 5454));
        System.out.println("Valor por defecto test2: " + (primitivo2 = 894556565));
        System.out.println("Valor por defecto test3: " + (primitivo3 = 23));
        System.out.println("Valor por defecto test4: " + (primitivo4 = 23));
        System.out.println("Valor por defecto test5: " + (primitivo5 = false));
        System.out.println("Valor por defecto test6: " + (primitivo6 = 23));
        System.out.println("Valor por defecto test7: " + (primitivo7 = 's'));
    }
}