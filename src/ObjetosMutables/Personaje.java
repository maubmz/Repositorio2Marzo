package ObjetosMutables;

public class Personaje {

    private String enemigo;
    private String arma;

    public Personaje(String enemigo, String arma) {
        this.enemigo = enemigo;
        this.arma = arma;
    }

    public String getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
