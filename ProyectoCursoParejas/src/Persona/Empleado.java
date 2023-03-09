package persona;

public class Empleado extends Persona{
    protected boolean gerente;
    protected String puesto;

    public Empleado(String nombre, String genero, boolean gerente) {
        super(nombre, genero);
        this.puesto = (gerente? "gerente":"Empleado");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
