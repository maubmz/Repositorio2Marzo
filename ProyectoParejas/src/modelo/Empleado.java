package modelo;
public class Empleado extends Persona{
    private String id;

    public Empleado(String nombre, String apellido, String edad, String id) {
        super(nombre, apellido, edad);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
