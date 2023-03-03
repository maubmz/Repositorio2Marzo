package ObjetosMutables;

public class Main {
    public static void main(String[] args) {

        Personaje personaje=new Personaje("Artorias", "Espada de lobo");
        personaje.setEnemigo("Gwyn");
        personaje.setArma("Rayo");
        System.out.println(personaje.getArma()+" "+ personaje.getEnemigo());

        String escenario;
        escenario="Valle del dragon";
        System.out.println(escenario);

        escenario= escenario + " con cascada";
        System.out.println(escenario);

    }
}
