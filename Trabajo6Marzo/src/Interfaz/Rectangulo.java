package Interfaz;

public class Rectangulo implements Figura{
    private float valorLado, valorLado1;

    public Rectangulo(float valorLado, float valorLado1) {
        this.valorLado = valorLado;
        this.valorLado1=valorLado1;
    }
    @Override
    public float area() {
        return valorLado*valorLado1;
    }
    @Override
    public float perimetro() {
        float largo=valorLado*2;
        float ancho=valorLado1*2;
        return largo+ancho;
    }
}
