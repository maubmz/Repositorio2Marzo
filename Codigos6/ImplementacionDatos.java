package Codigos6;

public  class ImplementacionDatos implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }
}
