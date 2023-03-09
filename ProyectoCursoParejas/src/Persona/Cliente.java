package persona;

import producto.Producto;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona {
    protected boolean membresia;
    protected String tipoCliente;
    protected Producto producto;
    public Map<Integer , Producto> listaProductosComprar = new HashMap<>();

    public void setListaProductosComprar(Map<Integer, Producto> listaProductosComprar) {
        this.listaProductosComprar = listaProductosComprar;
    }

    public Cliente(String nombre, String genero, boolean membresia) {
        super(nombre, genero);
        this.tipoCliente = (membresia? "Normal":"VIP") ;
    }

    public void costoListaProductos(Map<Integer, Producto> listaProductosComprar){
        //Metodo que sumara el costo de los productos
        double sumaTotal = 0;
        for (Integer clave : listaProductosComprar.keySet()){
            Producto producto1 = listaProductosComprar.get(clave);
            sumaTotal += producto1.getPrecio();
        }
        System.out.println("El total a pagar sobre los productos es: "+sumaTotal);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "membresia=" + membresia +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }


}
