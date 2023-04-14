package mx.com.digitalchallengers.controlador;

import lombok.extern.slf4j.Slf4j;
import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.entidades.Factura;
import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import mx.com.digitalchallengers.repositorios.FacturaRepositorio;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import mx.com.digitalchallengers.service.FacturaService;
import mx.com.digitalchallengers.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    @Autowired
    private ProductoService productoService;

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
    public void saveFactura(@RequestBody Factura factura, @PathVariable Integer id){
        log.info("se inicia metodo addFactura");
        facturaService.guardarFactura(factura, id);
    }

    @PutMapping(path = "update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Factura facturaDos){
        Factura factura = facturaRepositorio.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente no encontrado"));
        factura.setFechaCompra(facturaDos.getFechaCompra());
        facturaRepositorio.save(factura);
    }
}
