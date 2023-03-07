package Herenciax2;

public class Main {
    public static void main(String[] args) {

        Almacenista almacenista=new Almacenista();
        almacenista.setNombre("Damian");
        almacenista.setNumEmpleado(605382);
        almacenista.setEmpresa("OlmosPack");
        almacenista.setCorreo("damian23@gmail.com");

        Sellador sellador=new Sellador();
        sellador.setNombre("Carlos");
        sellador.setEdad(20);
        sellador.setPaga(1200);
        sellador.setTurno("Nocturno");
        sellador.setNomEncargado("Rodrigo");

        System.out.println("Almacenista: "+ almacenista.getNombre() + "\nnumero de empleado: "
                + almacenista.getNumEmpleado() + "\ncorreo: "+ almacenista.getCorreo() +"\nempresa: "+almacenista.getEmpresa()+"\n");

        System.out.println("Sellador: "+sellador.getNombre()+"\nedad: "+sellador.getEdad()+"\npaga: "+sellador.getPaga()
        +"\nturno: "+ sellador.getTurno()+"\nnombre de encargado: "+sellador.getNomEncargado());
    }
}
