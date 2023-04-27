package mx.com.digitalchallengers.controlador;

import lombok.extern.slf4j.Slf4j;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import mx.com.digitalchallengers.service.FacturaService;
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
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;
    @Autowired
    private FacturaService facturaService;

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
        log.info("Se inicia addFactura");
        facturaService.addFactura(factura,id);
        System.out.println("factura = " + factura);
    }



}
