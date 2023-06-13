package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/producto")
@RestController
@Controller
@Service
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    @GetMapping
    public List<Producto> findAllProducto() {
        return productoRepositorio.findAll();
    }

    @GetMapping({"/{id}"})
    public Optional<Producto> findByIdProducto(@PathVariable Long id){
        return productoRepositorio.findById(id);
    }

    @GetMapping("/productosFindIdFactura/{id}")
    public List<Producto> productosFindIdFactura(@PathVariable (value = "id") Long id) {
        Optional<Factura> factura = facturaRepositorio.findById(id);
        return factura.get().getProductos();
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public void addProducto(@RequestBody Producto producto){
        productoRepositorio.save(producto);
        System.out.println("producto = " + producto);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Producto productoDos){
        Producto producto = productoRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Producto no encontrado"));
        producto.setNombreProducto(productoDos.getNombreProducto());
        producto.setPrecio(productoDos.getPrecio());
        productoRepositorio.save(producto);
    }

    

}
