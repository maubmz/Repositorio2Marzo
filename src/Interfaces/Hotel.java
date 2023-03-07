package Interfaces;

public class Hotel implements Habitacion{

    public Hotel(){

    }

    @Override
    public void numero() {
        System.out.println("La habitacion tiene un numero");
    }

    @Override
    public void tipo() {
        System.out.println("La habitacion puede ser sencilla o vip");
    }
}
