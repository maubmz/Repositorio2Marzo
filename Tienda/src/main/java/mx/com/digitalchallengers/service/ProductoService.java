package mx.com.digitalchallengers.service;

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
public class ProductoService {
    @Autowired
    private FacturaRepositorio facturaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Factura> eliminarProducto(Long id){
        Producto producto = productoRepositorio.findById(id).orElseThrow();
        List<Factura> facturasList = producto.getFacturas();
        List<Factura> facturas = producto.getFacturas();
        for (Factura a: facturas) {
            a.getProductos().remove(producto);
        }
        producto.setFacturas(facturas);
        productoRepositorio.save(producto);
        return facturasList;
    }

    public List<Factura> reorganizarFactura(List<Factura> facturas , Producto producto){
        for (Factura f: facturas) {
            f.getProductos().add(producto);
            facturaRepositorio.save(f);
        }
        return facturas;
    }
}
