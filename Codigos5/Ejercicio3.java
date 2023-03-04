package Codigos5;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ejemplo operador ternario
        int var1 = 25;
        int var2 = 20;
        //Operador ternario ejecutando con otro operador ternario
        System.out.println((var1 < var2 ? var1 : (var1 > var2 ? var1 : var2)));
        //La misma operacion que el del ternario pero con if's
        if (var1 < var2) {
            System.out.println(var1);
        } else if (var1 > var2) {
            System.out.println(var1);
        }else {
            System.out.println(var2);
        }
    }
}
