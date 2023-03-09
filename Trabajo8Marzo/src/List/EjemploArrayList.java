package List;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void ejemploArraylist(){
        List <String> animales=new ArrayList<>();
        animales.add("leon");
        animales.add("pez");
        animales.add("perro");
        //introdcuir un objeto en la posicion que queramos
        animales.add(1, "gato");
        System.out.println("Hay "+animales.size()+" elementos en el array");
        for (String a:animales) {
            System.out.println(a);
        }
        System.out.println("Que animal esta en la posicion 3?: " +animales.get(2));
        System.out.println("En que lugar de la lista esta el perro?:"+animales.indexOf("perro"));

    }
}
