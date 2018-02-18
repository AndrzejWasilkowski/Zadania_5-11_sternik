package pl.sternik.aw.zadania.proc_obj.obektowo;

public class Kwadrat extends Figura {
    public int a;

    public Kwadrat (int a){
        this.a = a;
    }

    @Override
    public double obliczObwod() {
        return 4 * a;
    }

    @Override
    public double obliczPole() {
        return a * a;
    }
}
