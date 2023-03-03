package Codigos3;

public class PersonaInfoMut {

        private  String nombre;
        private  String nacimiento;

        PersonaInfoMut(String nombre, String nacimiento) {
            this.nombre = nombre;
            this.nacimiento = nacimiento;
        }

        public String getNombre() {
            return nombre;
        }
        public String getNacimiento() {
            return nacimiento;
        }

        public void setNombre(String nombre) {
           this.nombre = nombre;
        }

        public void setNacimiento(String nacimiento) {
           this.nacimiento = nacimiento;
     }
}
