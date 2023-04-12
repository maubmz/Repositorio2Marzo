package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public void addFactura(@RequestBody Cliente cliente, @RequestBody Factura factura, @RequestBody Producto producto, @PathVariable int id){
        List<Producto> productos=new ArrayList<>();
        productos.add(producto);
        factura.setProducto(productos);
        List<Factura> facturas=new ArrayList<>();
        facturas.add(factura);
        cliente=clienteRepositorio.findById(id).orElseThrow();
        cliente.setFacturas(facturas);

        facturaRepositorio.save(factura);
        clienteRepositorio.save(cliente);
        System.out.println("factura = " + factura);
    }

    @PutMapping(path = "/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Factura facturaDos){
        Factura factura = facturaRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente no encontrado"));
        factura.setFechaCompra(facturaDos.getFechaCompra());
        facturaRepositorio.save(factura);
    }
}
