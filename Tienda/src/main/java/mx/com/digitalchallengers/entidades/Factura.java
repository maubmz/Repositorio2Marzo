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
    private Long facturaId;
    private String fechaCompra;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "id_cliente",
            referencedColumnName = "clienteId"
    )
    private Cliente cliente;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "factura_producto",
            joinColumns = @JoinColumn(
                    name = "id_factura",
                    referencedColumnName = "facturaId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_producto",
                    referencedColumnName = "productoId"
            )
    )
    private List<Producto> producto;
}
