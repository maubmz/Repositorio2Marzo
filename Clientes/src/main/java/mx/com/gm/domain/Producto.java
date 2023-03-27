package mx.com.gm.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static java.util.Objects.*;
@Entity
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_Producto")
    private Integer idProducto;

    private String nombre_producto;

    private String precio;

    @OneToMany(mappedBy = "producto")
    private List<Producto_Factura> productoFacturas;

    public Producto(){}

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    // public List<Producto_Factura> getProductoFacturas() {
    //    return productoFacturas;
    // }

// public void setProductoFacturas(List<Producto_Factura> productoFacturas) {
    //    this.productoFacturas = productoFacturas;
    // }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return idProducto.equals(producto.idProducto);
    }

    @Override
    public int hashCode() {
        return hash(idProducto);
    }
}
