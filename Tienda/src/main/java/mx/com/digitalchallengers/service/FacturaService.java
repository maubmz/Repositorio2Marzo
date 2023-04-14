package mx.com.digitalchallengers.service;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        factura.setCliente(cliente);
        factura = addProductoFactura(factura);
        List<Factura> facturas = new ArrayList<>();
        facturas = cliente.getFacturas();
        facturas.add(factura);
        cliente.setFacturas(facturas);
        facturaRepositorio.save(factura);
    }

    public void addProducto(List<Integer> productosK, Long idFactura){
        Factura factura = facturaRepositorio.findById(idFactura).orElseThrow();
        List<Producto> productos = new ArrayList<>();
        productos = factura.getProductos();
        for (Integer p:productosK) {
            productos.add(productoRepositorio.findById(Long.valueOf(p)).orElseThrow());
        }
        factura.setProductos(productos);
        //facturaRepositorio.save(factura);
    }

    public Factura addProductoFactura(Factura factura){
        List<Producto> productos = new ArrayList<>();
        List<Long> productos2 = new ArrayList<>(factura.getProductos().size());
        productos = factura.getProductos();
        for (Producto p: productos) {
            //System.out.println("ciclo");
            productos2.add(p.getProductoId());
        }
        productos.removeAll(productos);
        for (Long p:productos2) {
            productos.add(productoRepositorio.findById(p).orElseThrow());
        }
        factura.setProductos(productos);
        return factura;
    }

    public void updateFactura(Factura facturaUpd,Long id){
        Factura factura = facturaRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Factura no encontrada"));
        Cliente cliente = clienteRepositorio.findById(facturaUpd.getCliente().getClienteId()).orElseThrow(()->new ResponseStatusException
                (HttpStatus.NOT_FOUND,"Cliente no encontrado"));
        factura.setCliente(cliente);
        factura.setFechaCompra(facturaUpd.getFechaCompra());
        Factura tempFac = addProductoFactura(facturaUpd);
        factura.setProductos(tempFac.getProductos());
        facturaRepositorio.save(factura);
    }


}
