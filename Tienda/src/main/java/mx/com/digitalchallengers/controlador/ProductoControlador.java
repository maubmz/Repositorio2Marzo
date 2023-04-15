package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
            value = "/create",
            consumes = "application/json"
    )
    public void addProducto(@RequestBody Producto producto){
        productoRepositorio.save(producto);
        System.out.println("producto = " + producto);
    }

    @GetMapping("/findByName")
    public List<Producto> findByName(@RequestParam String nombreProducto){
        return productoRepositorio.findByNombreProductoContaining(nombreProducto);
    }

    @PutMapping(path = "/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Producto productoDos){
        Producto producto = productoRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"producto no encontrado"));
        producto.setNombreProducto(productoDos.getNombreProducto());
        producto.setPrecio(productoDos.getPrecio());
        productoRepositorio.save(producto);
    }

}

