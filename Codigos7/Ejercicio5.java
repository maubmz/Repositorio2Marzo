package Codigos7;

public class Ejercicio5 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Oscar",19,165,"07/12/03","Morado");
        System.out.println("Empleado: "+empleado.getNombre());
        //Se llama al metodo estatico el cual solo pertenece a la clase y no al objeto
        System.out.println("No. de persona: "+Empleado.getContadorPersonas());
        System.out.println(empleado);
        // Ejemplo Final
        System.out.println(ClaseFinal.VARIABLE_INT);
        ClaseFinal.CONST_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.CONST_PERSONA.getNombre());
        ClaseFinal.CONST_PERSONA.setNombre("Pedro");
        System.out.println(ClaseFinal.CONST_PERSONA.getNombre());
        int var1 = 0;
        System.out.println(++var1);
        System.out.println(var1);


    }

}
