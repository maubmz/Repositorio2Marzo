package main;

import persona.Cliente;
import persona.Empleado;
import producto.Producto;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan","Masculino",true);
        Empleado empleado2 = new Empleado("Karla","Femenina",false);
        Empleado empleado3 = new Empleado("Haziel","Masculino",false);
        Producto producto1 = new Producto("Pan Bimbo",2024,30.4);
        Producto producto2 = new Producto("Nutrileche",2024,24.0);
        Producto producto3 = new Producto("Galletas",2025,20.5);
        Cliente cliente1 = new Cliente("Javier","Maculino",true);
        Cliente cliente2 = new Cliente("Mau","Masculino",false);
        Cliente cliente3 = new Cliente("Danna","Femenino",true);

    }
}