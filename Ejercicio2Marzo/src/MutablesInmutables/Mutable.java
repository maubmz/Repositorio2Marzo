package MutablesInmutables;

public class Mutable {

    //clase mutable
    //tiene un private y set para q sea mutable
    private int num;
    public Mutable (int num) {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void numero() {
        System.out.println("El numero es:" +num);
    }
}

