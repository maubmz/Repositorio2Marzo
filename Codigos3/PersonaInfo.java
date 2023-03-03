package Codigos3;

import java.time.LocalDateTime;

final public class PersonaInfo {
    private final String nombre;
    private final LocalDateTime nacimiento;

     PersonaInfo(String nombre, LocalDateTime nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacimiento() {
        return nacimiento.getMonthValue() + "/" + nacimiento.getDayOfMonth();
    }

}
