package MutablesInmutables;

final class Inmutable {
    final double radio;
    Inmutable(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
            return radio;
        }

        //no hay setters por lo tanto no se puede modificar
        //solo hay un getter y su atributo es de tipo final
    }

