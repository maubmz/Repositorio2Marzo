package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequestMapping("/cliente")
@RestController
@Controller
@Service
public class ClienteCotrolador {
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping
    public List<Cliente> findAllClient(){
        return clienteRepositorio.findAll();
    }

    @PostMapping(
            value = "/create",
            consumes = "application/json"
    )
    public void addCliente(@RequestBody Cliente cliente){
        clienteRepositorio.save(cliente);
        System.out.println("cliente = " + cliente);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorIdCliente(@PathVariable(value = "id") int id){
        return clienteRepositorio.findById(id);
    }

    @GetMapping("/findByName")
    public List<Cliente> findByName(@RequestParam String nombre){
        return clienteRepositorio.findByNombreContaining(nombre);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable int id){

        clienteRepositorio.deleteById(id);
    }


    @PutMapping(path = "/{id}")
    public void updateById(@PathVariable int id, @RequestBody Cliente clienteDos){
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente no encontrado"));
        cliente.setNombre(clienteDos.getNombre());
        cliente.setApellido(clienteDos.getApellido());
        cliente.setCorreo(clienteDos.getCorreo());
        clienteRepositorio.save(cliente);

        clienteRepositorio.deleteById(id);
    }

    @PatchMapping(path = "/{id}")
    public Cliente updateNamepatchById(@PathVariable int id,@RequestBody Cliente clientePatch){
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"No se encontro el CLiente"));
        cliente.setNombre(clientePatch.getNombre());
        cliente.setApellido(clientePatch.getApellido());
        cliente.setCorreo(clientePatch.getCorreo());
        cliente.setFacturas(clientePatch.getFacturas());
        return clienteRepositorio.save(cliente);

    }

    @GetMapping(value = "/productos")
    public List<Producto> getProductos(){
        String url="http://localhost:8080/producto";
        RestTemplate restTemplate=new RestTemplate();
        List productos=restTemplate.getForObject(url, List.class);
        return productos;
    }

    @PostMapping(value = "/createproducto")
    public void addProducto(){
        String url="http://localhost:8080/producto/create";
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.postForObject(url, String.class);
    }


}
