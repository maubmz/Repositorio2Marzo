package persona;

public class Cliente extends Persona{
    protected boolean membresia;
    protected String tipoCliente;
    public Cliente(String nombre, String genero, boolean membresia) {
        super(nombre, genero);
        this.tipoCliente = (membresia? "Normal":"VIP") ;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "membresia=" + membresia +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
