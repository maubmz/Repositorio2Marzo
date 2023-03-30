package mx.com.gm.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.*;

@Entity
public class Curso implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer idCurso;
    private String nombre;
    private Double precio;

    @OneToMany(mappedBy = "curso")
    private List<Asignacion> asignaciones;

    public Curso(){
    }

    public Curso(Integer idCurso){
        this.idCurso = idCurso;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return idCurso.equals(curso.idCurso);
    }

    @Override
    public int hashCode() {
        return hash(idCurso);
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
