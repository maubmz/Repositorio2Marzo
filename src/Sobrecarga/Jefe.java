package Sobrecarga;

public class Jefe {

    //variables de la clase principal o padre
    String nombre;
    int antiguedad;
    int edad;

    public Jefe(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public Jefe(int edad) {
        this.edad = edad;
    }
    public void jefazo() {
        System.out.println("El jefe se llama " + nombre + " lleva trabajando " + antiguedad + " años");
    }
        public void jefazo(int inreso){
            System.out.println("Ingreso en el año "+inreso);

    }
}
