package Productos;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codigo {
    static public void getCodigo(Producto producto){
        Map <String,Producto>mapeo = new HashMap<>();
        Random rd = new Random();
        int randi = rd.nextInt(100) + 1;
        mapeo.put(Integer.toString(randi), producto);
    }

}
