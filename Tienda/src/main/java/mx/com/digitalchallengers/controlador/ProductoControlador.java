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
    public Optional<Producto> buscarPorIdProducto(@PathVariable(value = "id") Long id){
        return productoRepositorio.findById(id);
    }

    @PostMapping
            (value = "/create",
                    consumes = "application/json"
            )
    public void addProducto(@RequestBody Producto producto){
        productoRepositorio.save(producto);
        System.out.println("producto = " + producto);
    }

    @PutMapping(path = "/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Producto producto2){
        Producto producto = productoRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Producto no encontrado"));
        producto.setNombreProducto(producto2.getNombreProducto());
        producto.setPrecio(producto2.getPrecio());
        productoRepositorio.save(producto);
        productoRepositorio.deleteById(id);
    }

    @PatchMapping(path = "/{id}")
    public Producto updateNamepatchById(@PathVariable Long id,@RequestBody Producto productoPatch) {
        Producto producto = productoRepositorio.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el Producto"));
        producto.setNombreProducto(productoPatch.getNombreProducto());
        return productoRepositorio.save(producto);
    }

}
