package Codigos7;

public final class ClaseFinal {

    //Marcada con final para no poder mover la variable
    public final int varFin = 20;
    //Constante
    public static final int VARIABLE_INT = 80;
    public static final Persona CONST_PERSONA = new Persona();
    //En este metodo no se puede sobreescribir el comportamiento en su clasehija
    //en este caso no se puede heredar por la palabra ´final´ pero en caso de no tenerla
    public final void metodoFinal(){}

}
