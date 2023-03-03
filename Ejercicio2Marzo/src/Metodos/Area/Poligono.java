package Metodos.Area;

import java.sql.SQLOutput;

public class Poligono extends Area {
    private float lado1;
    private float lado2;
    private float lado3;

    public Poligono(){

    }
    public Poligono(float lado1) {
        this.lado1 = lado1;
    }
    public Poligono(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Poligono(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    //estos metodos solo daran el resultado
    public void  perimetroCuadrado(float lado1){
        System.out.println("El perimetro es:");
        perimetro(lado1);
    }
    public void perimetroRectangulo(float lado1, float lado2){
        System.out.println("El perimetro es:");
        perimetro(lado1,lado2);
    }
    public void perimetroTriangulo(float lado1, float lado2, float lado3){
        //System.out.println("El perimetro es:");
        perimetro(lado1,lado2,lado3);
    }

    //sobreesctritura
    //Los metodos explican como se obtienen los perimetros y dan el resultado
    @Override
    public void perimetro(float lado1) {
        System.out.println("El perimetro de un cuadrado se obtiene multiplicando el lado: " +lado1+" por 4");
        super.perimetro(lado1);
    }

    @Override
    public void  perimetro(float lado1, float lado2){
        System.out.println("El perimetro de un rectangulo se obtiene sumando los lados: " +lado1+"+"+ lado1+"+"+lado2+"+"+lado2);
        super.perimetro(lado1, lado2);
    }
    @Override
    public void  perimetro(float lado1, float lado2, float lado3){
        System.out.println("El perimetro de un triangulo se obtiene sumando los lados: " +lado1+"+"+lado2+"+"+lado3);
        super.perimetro(lado1, lado2, lado3);
    }
}
