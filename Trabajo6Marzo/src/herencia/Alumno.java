package herencia;

public class Alumno extends Persona{
    private String numeroCuenta;

    public Alumno(String nombre, String apellido, int edad, String numeroCuenta) {
        super(nombre, apellido, edad);
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String toString() {
        return "El alumno con nombre " + getNombre()+ " " + getApellido() + "\nCon " + getEdad() + " anios cumplidos"+"\nNumero de cuenta: " + getNumeroCuenta();
    }
}
