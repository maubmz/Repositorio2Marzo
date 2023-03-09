package modelo;

import Compras.Canasta;
import Productos.Producto;

public class Cliente extends Persona{
    private float totalCuenta;
    private Canasta canasta = new Canasta();

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        this.totalCuenta = totalCuenta;
    }

    public float getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(float totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
    public void canasta(){
        if(canasta.getLista().isEmpty()){
            System.out.println("Canasta");
        }else {
            canasta.VerCanasta();
        }
    }
    public void getCanasta(){
        canasta.VerCanasta();
    }
    public String canastaString(){
        return canasta.productosCanasta();
    }
    public void agregarCanasta(Producto producto){
        canasta.Agregar(producto);
    }

    public int precioTotal(){
        return canasta.PrecioTotal();
    }

}
