package mx.com.digitalchallengers.service;

import mx.com.digitalchallengers.entidades.Cliente;
import mx.com.digitalchallengers.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public void facturasFindByIdCliente(Cliente cliente, int id) {
        Cliente cliente1 = new Cliente();
        cliente1.setClienteId(clienteRepositorio.findById(id).orElseThrow().getClienteId());
        cliente1.getFacturas();
    }
}
