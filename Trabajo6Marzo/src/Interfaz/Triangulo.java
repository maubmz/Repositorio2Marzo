package Interfaz;

public class Triangulo implements Figura{
    private float base, altura,lado1,lado2;

    public Triangulo(float base, float altura,float lado1, float lado2) {
        this.base = base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
    }

    @Override
    public float area() {
        float r=(base*altura)/2;
        return r;
    }

    @Override
    public float perimetro() {
        return base+lado1+lado2;
    }
}
