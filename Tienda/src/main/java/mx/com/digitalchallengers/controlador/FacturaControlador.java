package mx.com.digitalchallengers.controlador;

import lombok.extern.slf4j.Slf4j;
import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.service.FacturaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/factura")
@RestController
@Controller
@Service
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class FacturaControlador {

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private FacturaServices facturaServices;


    @GetMapping("getFacturas")
    public List<Factura> findAllFactura(){
        return facturaRepositorio.findAll();
    }

    @GetMapping("/findBy/{id}")
    public Optional<Factura> findByIdFactura(@PathVariable (value = "id") Long id){
        return facturaRepositorio.findById(id);
    }

    @PostMapping(
            value = "/create/{idCliente}",
            consumes = "application/json"
    )
    public void addFactura(@RequestBody Factura factura,@PathVariable Integer idCliente){
        log.info("Creacion Factura");
        facturaServices.saveFactura(factura, idCliente);
    }

    @GetMapping("/facturasFindIdCliente/{id}")
    public List<Factura> facturasFindIdCliente(@PathVariable (value = "id") int id) {
        Optional<Cliente> cliente = clienteRepositorio.findById(id);
        return cliente.get().getFacturas();
    }

    @PutMapping(
            value = "/{id}",
            consumes = "application/json")
    public void updateById(@PathVariable Long id, @RequestBody Factura factura){
        facturaServices.updateFactura(id, factura);
        log.info("Update Factura");
    }

}