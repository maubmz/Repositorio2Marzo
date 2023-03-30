package mx.com.gm.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

import static java.util.Objects.*;

@Entity
public class Alumno implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    private String nombre;
    private String apellido;

    @JoinColumn(name = "id_domicilio1", referencedColumnName = "id_domicilio")
    @ManyToOne
    private Domicilio domicilio;

    @JoinColumn(name = "id_contacto1", referencedColumnName = "id_contacto")
    @ManyToOne
    private Contacto contacto;

    @OneToMany(mappedBy = "alumno")
    private List<Asignacion> asignaciones;

    public Alumno(){
    }

    public Alumno(Integer idAlumno){
        this.idAlumno = idAlumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return idAlumno.equals(alumno.idAlumno);
    }

    @Override
    public int hashCode() {
        return hash(idAlumno);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", contacto=" + contacto +
                '}';
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
}
