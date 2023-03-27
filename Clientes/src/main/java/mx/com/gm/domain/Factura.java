package mx.com.gm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static java.util.Objects.*;
@Entity
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_factura")
    private Integer idFactura;

    @JoinColumn(name = "id_cliente1", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "factura")
    private List<Producto_Factura> productoFacturas;

    public Factura(){}

    public Factura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto_Factura> getProductoFacturas() {
         return productoFacturas;
    }

     public void setProductoFacturas(List<Producto_Factura> productoFacturas) {
        this.productoFacturas = productoFacturas;}

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura)) return false;
        Factura factura = (Factura) o;
        return idFactura.equals(factura.idFactura);
    }

    @Override
    public int hashCode() {
        return hash(idFactura);
    }
}
