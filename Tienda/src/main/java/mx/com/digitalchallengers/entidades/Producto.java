package mx.com.digitalchallengers.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_producto",unique = true, nullable = false)
    private Long productoId;
    @Column(name = "nom_producto")
    private String nombreProducto;
    private Integer precio;

    @ManyToMany(
            mappedBy = "productos",
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private List<Factura> facturas;


}
