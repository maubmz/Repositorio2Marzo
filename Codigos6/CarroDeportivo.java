package Codigos6;

public class CarroDeportivo extends Carro{
    private int valor;
    private String usoDelCarro;

    public CarroDeportivo(String marca, String modelo, String color, int caballoDeFuerza,int valor, String usoDelCarro) {
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
        System.out.println("Manejar este auto con mucho cuidado en zonas con poco espacio");
    }
    @Override
    public String toString() {
        return "{" +
                "valor=" + valor +
                ", usoDelCarro='" + usoDelCarro + '\'' +
                "} " + super.toString();
    }
}
