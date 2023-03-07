package Codigos6;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Ejemplo heredar
        CarroDeportivo carroDeportivo = new CarroDeportivo("Ferrari","296 GTS","Rojo",
                830,2000000,"Manejar chulamente");
        System.out.println(carroDeportivo);
        //Ejemplo polimorfismo
        CarroNormal carroNormal = new CarroNormal("Volkswagen","Vento","Blanco",
                600,2000000,"Manejar en familia");
        System.out.println("Recomendaciones de: "+ carroDeportivo.getMarca() +" "+carroDeportivo.getModelo()+ " ");
        carroDeportivo.recomendaciones();
        System.out.println("Recomendaciones de: "+ carroNormal.getMarca() +" "+carroNormal.getModelo()+ " ");
        carroNormal.recomendaciones();
        //Ejemplo encapsulamiento
        System.out.println("Color de: "+ carroDeportivo.getMarca() +" "+carroDeportivo.getModelo()+ " "+carroDeportivo.getColor());
        carroDeportivo.setColor("Blanco");
        System.out.println("Color de: "+ carroDeportivo.getMarca() +" "+carroDeportivo.getModelo()+ " "+carroDeportivo.getColor());
        //Ejemplo abstracto
        FiguraGeometrica cuadrado = new Cuadrado("Cuadrado");
        System.out.println(cuadrado);
        cuadrado.dibujar();
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        //Ejemplo interfaz en la clase implementacionDatos
        AccesoDatos datos = new ImplementacionDatos();
        datos.insertar();
        datos.listar();
        System.out.println(AccesoDatos.MAX_REGISTROS);



    }
}
