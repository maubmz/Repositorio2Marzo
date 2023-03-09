import Productos.Producto;
import modelo.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Valeria","Gonzales");
        Producto.INVENTARIO();
        cliente.agregarCanasta(Producto.productos.get(1));
        cliente.agregarCanasta(Producto.productos.get(8));
        cliente.agregarCanasta(Producto.productos.get(9));
        cliente.agregarCanasta(Producto.productos.get(3));
        cliente.agregarCanasta(Producto.productos.get(7));
        cliente.getCanasta();
        System.out.println("Precio total: " +cliente.precioTotal());

    }
}