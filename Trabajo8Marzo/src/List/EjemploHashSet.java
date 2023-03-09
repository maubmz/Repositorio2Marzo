package List;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploHashSet {
    public static void ejemploHashSet(){
        Set<String> nombres= new HashSet<>();
        System.out.println("la lista es vacia?: "+nombres.isEmpty());
        nombres.add("Alexis");
        nombres.add("Jazmin");
        nombres.add("Ivan");
        nombres.add("Gonzalez");
        System.out.println("Hay "+nombres.size()+" elementos en la hashSet");
        for (String a:nombres) {
            System.out.println(a);
        }
        System.out.println("la lista es vacia?: "+nombres.isEmpty());
        nombres.remove("Gonzalez");
        System.out.println("------Lista corregida------");
        for (String a:nombres) {
            System.out.println(a);
        }
        System.out.println("------Buscamos un elemento-----");
        System.out.println("Introduzca un nombre: ");
        Scanner sc=new Scanner(System.in);
        String nombre=sc.nextLine();
        System.out.println("Esta el nombre "+nombre+" en la lista?: "+nombres.contains(nombre));
        System.out.println("----Limpiamos la lista----");
        nombres.clear();
        System.out.println("Hay "+nombres.size()+" elementos en la hashSet");
    }
}