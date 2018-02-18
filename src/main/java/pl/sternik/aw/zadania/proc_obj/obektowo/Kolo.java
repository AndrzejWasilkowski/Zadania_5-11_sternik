package pl.sternik.aw.zadania.proc_obj.obektowo;

public class Kolo extends Figura {
    public int r;
    public Kolo(int r) {
        this.r = r;
    }

    @Override
    public double obliczObwod() {
        return Math.PI * 2 * r;
    }

    @Override
    public double obliczPole() {
        return r * r * Math.PI;
    }
}
