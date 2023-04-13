package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import mx.com.digitalchallengers.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/factura")
@RestController
@Controller
@Service
public class FacturaControlador {

    @Autowired
    private FacturaRepositorio facturaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Factura> findAllFactura(){
        return facturaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Factura> findByIdFactura(@PathVariable (value = "id") Long id){
        return facturaRepositorio.findById(id);
    }

    @PostMapping(
            value = "/create/{id}",
            consumes = "application/json"
    )
    public void addFactura(@RequestBody Factura factura, @PathVariable int id){

        /*
        List<Producto> productos=new ArrayList<>();
        productos.add(producto);
        factura.setProductos(productos);
        List<Factura> facturas=new ArrayList<>();
        facturas.add(factura);
        cliente=clienteRepositorio.findById(id).orElseThrow();
        cliente.setFacturas(facturas);
        productoRepositorio.save(producto);
        facturaRepositorio.save(factura);
        clienteRepositorio.save(cliente);
        System.out.println("factura = " + factura);
         */
        Factura factura1=new Factura();
        factura1.setFacturaId(factura.getFacturaId());
        factura1.getProductos()
                .addAll(factura.getProductos()
                        .stream()
                        .map(p ->{
                            Producto producto1=productoService.findProductoById(p.getProductoId());
                            producto1.getFacturas().add(factura1);
                            return producto1;
                        }).collect(Collectors.toList()));
        facturaRepositorio.save(factura1);

        /*
        Factura factura1=new Factura();
        factura1.setFechaCompra(factura.getFechaCompra());
        factura1.getProductos().addAll(factura.getProductos().stream().map(p ->{
            Producto producto1=productoService.findProductoById(p.getProductoId()).orElseThrow();
            producto1.getFacturas().add(factura1);
            return producto;
        }).collect(Collectors.toList()));
        facturaRepositorio.save(factura1);
        productoRepositorio.save(producto);
         */
    }

    @PutMapping(path = "update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Factura facturaDos){
        Factura factura = facturaRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente no encontrado"));
        factura.setFechaCompra(facturaDos.getFechaCompra());
        facturaRepositorio.save(factura);
    }
}
