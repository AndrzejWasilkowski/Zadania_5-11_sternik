package pl.sternik.aw.zadania.proc_obj.obektowo;

public class Prostokat extends Figura {
    public int a;
    public int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczObwod() {
        return 2 * a + 2 * b;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }
}
