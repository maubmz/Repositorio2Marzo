package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
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

        //clienteRepositorio.deleteById(id);
    }

    @PatchMapping(path = "/{id}")
    public Cliente updateNamepatchById(@PathVariable int id,@RequestBody Cliente clientePatch){
        Cliente cliente = clienteRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"No se encontro el CLiente"));
        cliente.setNombre(clientePatch.getNombre());
        return clienteRepositorio.save(cliente);
    }

    @GetMapping(value = "/Titulos")
    public List<Object> getTitulos(){
        String url = "https://jsonplaceholder.typicode.com/todos";
        RestTemplate restTemplate = new RestTemplate();
        List<Object> titulos = restTemplate.getForObject(url, List.class);
        return titulos;
    }

    @GetMapping(value = "/Titulo")
    public Object getTitulo(){
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        RestTemplate restTemplate = new RestTemplate();
        Object titulo = restTemplate.getForObject(url, Object.class);
        return titulo;
    }
    @PostMapping(value = "/creatingResource")
    public Object crearRecurso(@RequestBody Object objeto){
        String url = "https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate = new RestTemplate();
        Object post = restTemplate.postForEntity(url,objeto,Object.class);
        return post;
    }

}
