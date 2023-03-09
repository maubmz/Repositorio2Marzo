package List;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void ejemploHashMap(){
        Map<String, String> paises=new HashMap<>();
        paises.put("uk", "reino unido");
        paises.put("mx","mexico");
        paises.put("us","estados unidos");
        paises.put("col","colombia");
        paises.put("ch","chile");
        for (String a:paises.values()) { //values devuleve los valores dentro
            System.out.println(a);
        }
        System.out.println("obtenemos el pais por su abreviatura: mx="+paises.get("mx"));
        Set abreviaturas=paises.keySet();
        System.out.println("las abreviaturas de los paiseas son: "+abreviaturas);
        System.out.println("Hay "+paises.size()+" paises");
        paises.remove("mx", "mexico"); //removemos con la abreviatura
        for (String a:paises.values()) {
            System.out.println(a);
        }
        System.out.println("Hay "+paises.size()+" paises");
        paises.replace("col", "rusia"); //metemos a rusia donde esta la abreviatura de col osea en ellugar de colombia
        for (String a:paises.values()) {
            System.out.println(a);
        }
    }
}
