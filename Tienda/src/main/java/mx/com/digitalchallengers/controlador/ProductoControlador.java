package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/producto")
@RestController
@Controller
@Service
public class ProductoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping
    public List<Producto> findAllProducto(){
        return productoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findByIdProducto(@PathVariable(value = "id") Long id){
        return productoRepositorio.findById(id);
    }

    @PostMapping(
            value = "/{id}",
            consumes = "application/json"
    )
    public void addProducto(@RequestBody Producto producto,@PathVariable int id){
        productoRepositorio.save(producto);
        System.out.println("producto = " + producto);
    }

    @GetMapping("/findByName")
    public List<Producto> findByName(@RequestParam String nombreProducto){
        return productoRepositorio.findByNombreProductoContaining(nombreProducto);
    }
}

