package mx.com.gm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.*;
@Entity
public class Producto_Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto_factura")
    private Integer idProdcutoFactura;
    @JoinColumn(name = "id_factura1", referencedColumnName = "id_factura")
    @ManyToOne
    private Factura factura;

    @JoinColumn(name = "id_producto1", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;

    public Producto_Factura(){}

    public Producto_Factura(Integer idProdcutoFactura) {
        this.idProdcutoFactura = idProdcutoFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getIdProdcutoFactura() {
        return idProdcutoFactura;
    }

    public void setIdProdcutoFactura(Integer idProdcutoFactura) {
        this.idProdcutoFactura = idProdcutoFactura;
    }

    @Override
    public String toString() {
        return "Producto_Factura{" +
                "idProdcutoFactura=" + idProdcutoFactura +
                ", factura=" + factura +
                ", producto=" + producto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto_Factura)) return false;
        Producto_Factura that = (Producto_Factura) o;
        return idProdcutoFactura.equals(that.idProdcutoFactura);
    }

    @Override
    public int hashCode() {
        return hash(idProdcutoFactura);
    }
}
