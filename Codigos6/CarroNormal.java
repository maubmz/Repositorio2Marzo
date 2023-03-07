package Codigos6;

public class CarroNormal extends Carro{

    private int valor;
    private String usoDelCarro;
    public CarroNormal(String marca, String modelo, String color, int caballoDeFuerza,int valor, String usoDelCarro) {
        super(marca, modelo, color, caballoDeFuerza);
        this.valor = valor;
        this.usoDelCarro = usoDelCarro;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getUsoDelCarro() {
        return usoDelCarro;
    }

    public void setUsoDelCarro(String usoDelCarro) {
        this.usoDelCarro = usoDelCarro;
    }

    @Override
    public void recomendaciones() {
        System.out.println("Llevarlo a mantenimiento cada 6 meses para cualquier anomalia que se presente");
    }
    @Override
    public String toString() {
        return "{" +
                "valor=" + valor +
                ", usoDelCarro='" + usoDelCarro + '\'' +
                "} " + super.toString();
    }
}
