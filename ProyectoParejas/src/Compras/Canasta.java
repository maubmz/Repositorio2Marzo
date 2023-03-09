package Compras;

import Productos.Productos;

import java.util.ArrayList;

public class Canasta {
    final ArrayList<Productos> lista = new ArrayList<>(10);

    public void Agregar(Productos productos){
        lista.add(productos);
    }

    public void PrecioTotal(Productos productos){
        for (Productos i:lista) {
           int total =+ i.getPrecio();
        }
    }
}
