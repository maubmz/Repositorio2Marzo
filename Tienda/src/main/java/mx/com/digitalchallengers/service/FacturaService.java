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

    public void addFactura(Factura factura, int id){
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow();
        List<Factura> facturas = new ArrayList<>();
        if(cliente.getFacturas().isEmpty()){
            facturas.add(factura);
        }
        facturas = cliente.getFacturas();
        facturas.add(factura);
        cliente.setFacturas(facturas);
        clienteRepositorio.save(cliente);
        facturaRepositorio.save(factura);
    }

    public void addProducto(Long idProducto, Long idFactura){
        Producto producto = productoRepositorio.findById(idProducto).orElseThrow();
        Factura factura = facturaRepositorio.findById(idFactura).orElseThrow();
        List<Producto> productos = new ArrayList<>();
        if(factura.getProducto().isEmpty()){
            productos.add(producto);
        }
        productos = factura.getProducto();
        productos.add(producto);
        factura.setProducto(productos);
        facturaRepositorio.save(factura);
    }

}
