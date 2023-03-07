package Codigos6;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int caballoDeFuerza;

    public Carro(String marca, String modelo, String color, int caballoDeFuerza) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.caballoDeFuerza = caballoDeFuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballoDeFuerza() {
        return caballoDeFuerza;
    }

    public void setCaballoDeFuerza(int caballoDeFuerza) {
        this.caballoDeFuerza = caballoDeFuerza;
    }

    public void recomendaciones(){

    }

    @Override
    public String toString() {
        return "{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", caballoDeFuerza=" + caballoDeFuerza +
                '}';
    }
}
