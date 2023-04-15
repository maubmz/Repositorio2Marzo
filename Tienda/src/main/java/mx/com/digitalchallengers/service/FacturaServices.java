package mx.com.digitalchallengers.service;

import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class FacturaServices {
    @Autowired
    private FacturaRepositorio facturaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public void saveFactura(Factura factura, int id){
        Factura factura1 = new Factura();
        factura1.setCliente(clienteRepositorio.findById(id).orElseThrow());
        factura1.setFechaCompra(factura.getFechaCompra());

        factura1.getProductos()
                .addAll(factura
                        .getProductos()
                        .stream()
                        .map(p -> {
                            Producto producto = productoRepositorio.findById(p.getProductoId()).orElseThrow();
                            producto.getFacturas().add(factura1);
                            return p;
                        }).collect(Collectors.toList()));
        facturaRepositorio.save(factura1);
    }

    public void updateFactura(Factura factura, int id){

    }

}
