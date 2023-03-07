package herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
    }
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
