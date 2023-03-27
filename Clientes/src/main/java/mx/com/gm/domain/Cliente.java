package mx.com.gm.domain;

import javax.persistence.*;
import java.io.Serializable;

import static java.util.Objects.*;

@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_cliente")
    private Integer idCliente;

    private String nombre;

    private String apellido;

    private String tarjeta_pago;

    public Cliente(){}

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjeta_pago() {
        return tarjeta_pago;
    }

    public void setTarjeta_pago(String tarjeta_pago) {
        this.tarjeta_pago = tarjeta_pago;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tarjeta_pago='" + tarjeta_pago + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return idCliente.equals(cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return hash(idCliente);
    }
}
