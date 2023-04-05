package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.ManyToMany;
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
        Cliente cliente= clienteRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "no se encontro cliente"));
        cliente.setNombre(clienteDos.getNombre());
        cliente.setApellido(clienteDos.getApellido());
        cliente.setCorreo(clienteDos.getCorreo());
        clienteRepositorio.save(cliente);
    }

    @PatchMapping(path = "/{id}")
    public Cliente actualizarNombreById(@PathVariable int id, @RequestBody Cliente clientePatch){
        Cliente cliente=clienteRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "no se encontro cliente"));
        cliente.setNombre(clientePatch.getNombre());
        return clienteRepositorio.save(cliente);
    }
}
