import Productos.Producto;
import modelo.Cliente;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        controller();
    }

    static public void controller(){
        String nombre=JOptionPane.showInputDialog("Nombre del cliente");
        String apellido=JOptionPane.showInputDialog("Apellido del cliente");
        Cliente cliente = new Cliente(nombre,apellido);
        Producto.INVENTARIO();
        cliente.getCanasta();
        System.out.println("Precio total: " +cliente.precioTotal());
        JOptionPane.showMessageDialog(null, Producto.invetarioString());
        String n=JOptionPane.showInputDialog("Cuantos producctos quieres?");
        int numeroProductos= Integer.parseInt(n);
        for (int i = 0; numeroProductos > i; i++) {
            String n1=JOptionPane.showInputDialog("Numero del prodcuto");
            int numeroProductos1= Integer.parseInt(n1);
            cliente.agregarCanasta(Producto.productos.get(numeroProductos1));
        }
        JOptionPane.showMessageDialog(null, "Cliente: " +cliente.getNombre()+" "+cliente.getApellido()+"\n"
                +cliente.canastaString() + "\n\n" + "Total a PAGAR: " + "$"+ cliente.precioTotal());

    }
}