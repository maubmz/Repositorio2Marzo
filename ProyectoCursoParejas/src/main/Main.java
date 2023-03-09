package main;

import persona.Cliente;
import persona.Empleado;
import producto.Producto;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer , Producto> listaCompra = new HashMap();
        Empleado empleado1 = new Empleado("Juan","Masculino",true);
        Empleado empleado2 = new Empleado("Karla","Femenina",false);
        Empleado empleado3 = new Empleado("Haziel","Masculino",false);

        Cliente cliente1 = new Cliente("Javier","Maculino",true);
        Cliente cliente2 = new Cliente("Mau","Masculino",false);
        Cliente cliente3 = new Cliente("Danna","Femenino",true);

        Producto producto1 = new Producto("Pan Bimbo",30.4);
        Producto producto2 = new Producto("Nutrileche",24.0);
        Producto producto3 = new Producto("Galletas",20.5);
        Producto producto4 = new Producto("Cafe",30);
        Producto producto5 = new Producto("Azucar",23);

        Producto productosVenta = new Producto();
        productosVenta.mostrarProductosVenta();
        listaCompra.put(1, producto1);
        listaCompra.put(2, producto2);
        listaCompra.put(3, producto3);
        listaCompra.put(4, producto4);
        listaCompra.put(5, producto5);

        cliente1.costoListaProductos(listaCompra);

    }
}