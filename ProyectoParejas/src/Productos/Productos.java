package Productos;

public class Productos {

    private String nombreProducto;
    private int precio;
    private String codigo;

    public Productos() {
    }
    public Productos(String nombreProducto, int precio, String codigo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.codigo = codigo;
    }
    public Productos(String nombreProducto,int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    public Productos(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
