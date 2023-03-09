package Compras;


import Productos.Producto;

import java.util.ArrayList;

public class Canasta {
    private ArrayList<Producto> lista = new ArrayList<>(10);

    public void Agregar(Producto producto){
        lista.add(producto);
    }

    public int PrecioTotal(){
        int fin = 0;
        for (Producto i:lista) {
           int total =+ i.getPrecio();
           fin += total;
        }
        return fin;
    }
    public void VerCanasta(){
        for (Producto i:lista) {
            System.out.println(i.getNombreProducto() + " -- " +i.getPrecio() );
        }
    }
    public String productosCanasta(){
        StringBuilder temp= new StringBuilder();
        for (Producto i:lista) {
            temp.append(i.getNombreProducto() + " -- " + "$"+i.getPrecio()+"\n");
        }
        return temp.toString();
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }
}
