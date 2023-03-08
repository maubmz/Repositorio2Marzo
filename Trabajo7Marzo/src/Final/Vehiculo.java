package Final;

public class Vehiculo {
    protected final int velodidadMaxima=100;
    private String nombre;
    private String tipo;

    public Vehiculo(String tipo, String nombre) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public final void arrancar(){
        System.out.println("El/la "+nombre+" esta en marcha");
        System.out.println("Velocidad maxima permitida="+velodidadMaxima);
    }
}
