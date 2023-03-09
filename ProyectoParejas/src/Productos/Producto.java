package Productos;

import java.util.HashMap;
import java.util.Map;

public class Producto extends Productos{
    public Producto(String nombreProducto, int precio) {

        super(nombreProducto, precio);
    }
    public static void INVENTARIO(){
        Map<Integer,Producto> productos = new HashMap<>();
        productos.put(1,new Producto("leche", 25));
        productos.put(2,new Producto("cereal", 50));
        productos.put(3,new Producto("agua", 10));
        productos.put(4,new Producto("galletas oreo", 25));
        productos.put(5,new Producto("croquetas", 100));
        productos.put(6,new Producto("monster", 38));
        productos.put(7,new Producto("caguama", 37));
        productos.put(8,new Producto("picafresa", 5));
        productos.put(9,new Producto("cafe", 23));
        productos.put(10,new Producto("cheetos", 21));
        for (Integer key : productos.keySet()){
            System.out.println(key + " => " + productos.get(key).getNombreProducto()+" $"+productos.get(key).getPrecio());
        }
    }
}
