package mx.com.digitalchallengers.service;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepositorio facturaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public void addFacturaCliente(Factura factura, int id){//Guarda las facturas del cliente
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow();
        List<Factura> facturas = new ArrayList<>();
        facturas = cliente.getFacturas();
        facturas.add(factura);
        cliente.setFacturas(facturas);
        clienteRepositorio.save(cliente);
        facturaRepositorio.save(factura);
    }

    public void comprobarProducto(List<Producto> productosFactura, Long id){
//        List<Producto> productosNuevaFactura = new ArrayList<>();
//        for(Producto producto: productosFactura){
//            if(producto.equals(producto.getProductoId())){
//                productosNuevaFactura.add(producto);
//            }else{
//
//            }
//        }

//        factura = facturaRepositorio.findById(id).orElseThrow();
//        List<Producto> productos = new ArrayList<>();
//        productos = factura.getProducto();
//        productos.add(producto);

    }
}
