package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        //usa el primer constructor de Jefe
    Jefe jefe=new Jefe("Marcelo",18);
     jefe.jefazo();

     //Usa el segundo constructor de Jefe
     Jefe jefe2=new Jefe(38);
     jefe2.jefazo(2012);
    }
}
