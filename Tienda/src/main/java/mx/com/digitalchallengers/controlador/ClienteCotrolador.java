package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

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
        return clienteRepositorio.save(cliente);

    }

    @GetMapping("/callProducto")
    public Object getProducto() {
        String uri = "http://localhost:8080/producto";
        RestTemplate restTemplate = new RestTemplate();
        Object resultado = restTemplate.getForObject(uri, Objects.class);
        System.out.println(resultado);
        return resultado;
    }

    @GetMapping("/urlExterno")
    public Object getJson(){
        String url = "https://jsonplaceholder.typicode.com/todos/1?fbclid=IwAR0qRd-niFl8CPpruvWD1wrMC0R6xzA-nLk-7Sz9nIUpYOMdUN2s9ksNJo4";
        RestTemplate restTemplate = new RestTemplate();

        Object json = restTemplate.getForObject(url, Object.class);
        return json;
    }

    @PostMapping("/urlexterno/create")
    public void setJson() {
        String url = "https://jsonplaceholder.typicode.com/todos/1?fbclid=IwAR0qRd-niFl8CPpruvWD1wrMC0R6xzA-nLk-7Sz9nIUpYOMdUN2s9ksNJo4";
        
    }

}
