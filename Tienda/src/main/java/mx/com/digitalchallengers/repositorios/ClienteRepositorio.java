package mx.com.digitalchallengers.repositorios;

import mx.com.digitalchallengers.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
    List<Cliente> findByNombreContaining(String nombre);

}
