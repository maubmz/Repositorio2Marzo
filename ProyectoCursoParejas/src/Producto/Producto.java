package producto;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    protected String nombreProducto;
    protected double precio;
    static Map<String , Double> listaProductosVenta = new HashMap();

    public Producto() {

    }

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        listaProductosVenta.put(nombreProducto, precio);
    }

    public void mostrarProductosVenta(){
        System.out.println(listaProductosVenta.entrySet());
    }

    public void productosAComprar(Producto producto){
        listaProductosVenta.put(producto.getNombreProducto(), producto.getPrecio());
    }

    public void infoProducto(){
        System.out.println("El nombre del producto es: "+getNombreProducto());
        System.out.println("El precio del producto es: "+getPrecio());
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

}
