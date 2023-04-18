package mx.com.digitalchallengers.controlador;

import lombok.extern.slf4j.Slf4j;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.service.FacturaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/factura")
@RestController
@Controller
@Service
@Slf4j
public class FacturaControlador {

    @Autowired
    private FacturaRepositorio facturaRepositorio;

    @Autowired
    private FacturaServices facturaServices;


    @GetMapping
    public List<Factura> findAllFactura(){
        return facturaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Factura> findByIdFactura(@PathVariable (value = "id") Long id){
        return facturaRepositorio.findById(id);
    }

    @PostMapping(
            value = "/create/{id}",
            consumes = "application/json"
    )
    public void addFactura(@RequestBody Factura factura,@PathVariable Integer id){
        log.info("Creacion Factura");
        facturaServices.saveFactura(factura, id);

    }

    @PutMapping(
            value = "/{id}",
            consumes = "application/json")
    public void updateById(@PathVariable Long id, @RequestBody Factura factura){
        facturaServices.updateFactura(id, factura);
        log.info("Update Factura");
    }

}