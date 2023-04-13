package mx.com.digitalchallengers.service;

import mx.com.digitalchallengers.entidades.Producto;
import mx.com.digitalchallengers.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public Producto findProductoById(Long id){
        return productoRepositorio.findById(id).orElseThrow();
    }
}
