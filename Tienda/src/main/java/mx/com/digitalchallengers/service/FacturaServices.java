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
import java.util.List;
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

    public void updateFactura(Long id, Factura factura){
        Factura factura1 = facturaRepositorio.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND,"Factura no encontrada"));
//        Cliente cliente = clienteRepositorio.findById(factura.getCliente().getClienteId()).orElseThrow(()->new ResponseStatusException
//                (HttpStatus.NOT_FOUND,"Cliente no encontrado"));
//        factura1.setCliente(cliente);
        factura1.setFechaCompra(factura.getFechaCompra());

        //Agregar productos a Factura
        List<Producto> productos = new ArrayList<Producto>();
        productos = factura.getProductos();//se guardan los productos de la factura en el list
        List<Long> productosId = new ArrayList<>();//Se guardaran los Id's de los productos
        for (Producto p: productos) {
            productosId.add(p.getProductoId());
        }
        productos.removeAll(productos);//productos se vacia
        for(Long i : productosId){
            productos.add(productoRepositorio.findById(i).orElseThrow());
        }
        factura1.setProductos(productos);
        facturaRepositorio.save(factura1);

    }


}
