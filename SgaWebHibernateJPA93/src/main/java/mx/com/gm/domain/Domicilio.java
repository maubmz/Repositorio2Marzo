package mx.com.gm.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.*;

@Entity
public class Domicilio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    private String calle;
    @Column(name = "no_calle")
    private String noCalle;
    private String pais;

    public Domicilio(){

    }

    public Domicilio(Integer idDomicilio){
        this.idDomicilio = idDomicilio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domicilio domicilio = (Domicilio) o;
        return idDomicilio.equals(domicilio.idDomicilio);
    }

    @Override
    public int hashCode() {
        return hash(idDomicilio);
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "idDomicilio=" + idDomicilio +
                ", calle='" + calle + '\'' +
                ", noCalle='" + noCalle + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
