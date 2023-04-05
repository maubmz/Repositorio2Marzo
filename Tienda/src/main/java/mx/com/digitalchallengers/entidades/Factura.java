package mx.com.digitalchallengers.entidades;

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
public class Factura {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id_factura",unique = true, nullable = false)
    private Long facturaId;
    private String fechaCompra;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
     @JoinColumn(
            name = "id_cliente",
            referencedColumnName = "id_cliente"
    )
    private Cliente cliente;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "factura_producto",
            joinColumns = @JoinColumn(
                    name = "id_factura",
                    referencedColumnName = "id_factura"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_producto",
                    referencedColumnName = "id_producto"
            )
    )
    private List<Producto> producto;
}
