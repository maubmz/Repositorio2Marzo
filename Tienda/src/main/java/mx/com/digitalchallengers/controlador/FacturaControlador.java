package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping
    public List<Factura> findAllFactura(){
        return facturaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Factura> findByIdFactura(@PathVariable (value = "id") Long id){
        return facturaRepositorio.findById(id);
    }

    @PostMapping(
            value = "/{id}",
            consumes = "application/json"
    )
    public void addFactura(@RequestBody Factura factura,@PathVariable int id){
        facturaRepositorio.save(factura);
        System.out.println("factura = " + factura);
    }




}
