package mx.com.digitalchallengers.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_cliente", nullable = false)
    private Integer clienteId;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name ="correo")
    private String correo;

    @OneToMany(
            mappedBy = "cliente",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List<Factura> facturas;


}
