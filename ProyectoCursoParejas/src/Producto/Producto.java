package producto;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    protected String nombreProducto;
    protected int anioCaducidad;
    protected double precio;
    Map<String , Double> listaCompra = new HashMap();

    public Producto(String nombreProducto, int anioCaducidad, double precio) {
        this.nombreProducto = nombreProducto;
        this.anioCaducidad = anioCaducidad;
        this.precio = precio;
    }

    public void productosAComprar(Producto producto){
        listaCompra.put(producto.getNombreProducto(), producto.getPrecio());
    }

    public void totalPrecio() {

        double precioTotal;
        precioTotal = listaCompra.get(nombreProducto);
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getAnioCaducidad() {
        return anioCaducidad;
    }

    public double getPrecio() {
        return precio;
    }


}
