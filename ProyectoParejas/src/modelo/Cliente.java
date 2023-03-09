package modelo;
public class Cliente extends Persona{
    private float totalCuenta;

    public Cliente(String nombre, String apellido, float totalCuenta) {
        super(nombre, apellido);
        this.totalCuenta = totalCuenta;
    }

    public float getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(float totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
}
