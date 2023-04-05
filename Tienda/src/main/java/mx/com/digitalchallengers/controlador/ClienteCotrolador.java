package mx.com.digitalchallengers.controlador;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/cliente")
@Controller
@Service
public class ClienteCotrolador {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @GetMapping()
    public List<Cliente> findAllClient(){
        return clienteRepositorio.findAll();
    }

    @PostMapping
    public void addCliente(){

    }


}
