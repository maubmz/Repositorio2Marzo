package Metodos.Area;

public class Area {
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;

    //sobrecarga de metodos
    public void perimetro(float lado1){
        System.out.println(lado1*4);
    }
    public void perimetro(float lado1, float lado2){
        System.out.println(lado1+lado1+lado2+lado2);
    }
    public void perimetro(float lado1, float lado2, float lado3){
        System.out.println(lado1+lado2+lado3);
    }
}
