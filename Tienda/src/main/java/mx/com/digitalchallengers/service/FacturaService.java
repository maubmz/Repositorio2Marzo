package mx.com.digitalchallengers.service;

import lombok.extern.slf4j.Slf4j;
import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class FacturaService {
    @Autowired
    private FacturaRepositorio facturaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Autowired
    private ProductoService productoService;

    public void addFactura(Factura factura, int id){
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow();
        List<Factura> facturas = new ArrayList<>();
        facturas = cliente.getFacturas();
        facturas.add(factura);
        cliente.setFacturas(facturas);
        clienteRepositorio.save(cliente);
        facturaRepositorio.save(factura);
    }

    public void addProducto(Producto producto, Long idFactura, Long idProducto, int idCliente){
        List<Producto> productos = new ArrayList<>();
        Producto producto1=productoRepositorio.findById(idProducto).orElseThrow();
        productos.add(producto);
        Factura factura = facturaRepositorio.findById(idFactura).orElseThrow();
        factura.setProductos(productos);
        Cliente cliente = clienteRepositorio.findById(idCliente).orElseThrow();
        List<Factura> facturas = new ArrayList<>();
        facturas=cliente.getFacturas();
        facturas.add(factura);
        cliente.setFacturas(facturas);
        clienteRepositorio.save(cliente);
        facturaRepositorio.save(factura);
    }

    public void guardarFactura(Factura factura, int id){
        Factura factura1=new Factura();
        factura1.setCliente(clienteRepositorio.findById(id).orElseThrow());
        factura1.setFechaCompra(factura.getFechaCompra());
        factura1.getProductos()
                .addAll(factura
                        .getProductos()
                        .stream()
                        .map(p ->{
                            Producto producto=productoRepositorio.findById(p.getProductoId()).orElseThrow();
                            producto.getFacturas().add(factura1);
                            factura1.getProductos().add(p);
                            return p;
                        }).collect(Collectors.toList()));
        facturaRepositorio.save(factura1);
    }
}
