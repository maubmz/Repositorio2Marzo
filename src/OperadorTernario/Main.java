package OperadorTernario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var1=5;
        int var2=15;
        String[] arreglo = new String[5];
        Scanner consola = new Scanner((System.in));
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = consola.nextLine();
            System.out.println("Alumno: " + arreglo[i]);
        }
        String s="nada";
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

            s = (arreglo[i].equals("Haziel")) ? "Ya se encuentra aqui" : "No se encuentra aqui";
            System.out.println(s);
        }
        //if((var1 < var2 ? var1 : (var1 > var2 ? var1 : var2)))
        if (var1 < var2)
            System.out.println(var1);
        else if (var1 > var2)
            System.out.println(var1);
        else
            System.out.println(var2);

    }
}

