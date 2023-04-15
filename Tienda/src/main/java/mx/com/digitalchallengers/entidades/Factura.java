package mx.com.digitalchallengers.entidades;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "factura")
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
            name = "id_cliente1",
            referencedColumnName = "id_cliente"
    )
    @JsonBackReference
    private Cliente cliente;

    @ManyToMany(
            cascade = CascadeType.MERGE
    )
    @JoinTable(
            name = "producto_factura",
            joinColumns = @JoinColumn(
                    name = "id_factura1",
                    referencedColumnName = "id_factura"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_producto1",
                    referencedColumnName = "id_producto"
            )
    )
    private List<Producto> productos = new ArrayList<>();


}
