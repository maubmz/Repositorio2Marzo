package Codigos3;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

    private List<Producto> lista = new ArrayList<Producto>();

    public void anadirProductos(Producto p){

        lista.add(p);

    }

    public void anadirProductos(String nombre, double precio){

        lista.add(new Producto(nombre, precio));

    }

}
