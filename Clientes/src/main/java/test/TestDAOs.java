package test;

import mx.com.gm.dao.ClienteDAO;
import mx.com.gm.dao.FacturaDAO;
import mx.com.gm.dao.ProductoDAO;
import mx.com.gm.dao.Producto_FacturaDAO;
import mx.com.gm.domain.Factura;
import mx.com.gm.domain.Producto_Factura;

import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        System.out.println("Cliente:");
        imprimir(clienteDAO.listar());

        ProductoDAO productoDAO = new ProductoDAO();
        System.out.println("Producto:");
        imprimir(productoDAO.listar());

        FacturaDAO facturaDAO = new FacturaDAO();
        System.out.println("Factura:");
        imprimir(facturaDAO.listar());

        Producto_FacturaDAO productoFactura = new Producto_FacturaDAO();
        System.out.println("productoFactura:");
        imprimir(productoFactura.listar());

    }

    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("valor = " + o );
        }
    }
}
