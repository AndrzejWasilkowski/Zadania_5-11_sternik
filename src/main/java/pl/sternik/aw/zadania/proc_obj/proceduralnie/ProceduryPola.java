package pl.sternik.aw.zadania.proc_obj.proceduralnie;

public class ProceduryPola {
    public static int obliczPole(Kwadrat k) {
        return k.a * k.a;
    }

    public static int obliczPole(Prostokat p) {
        return p.a * p.b;
    }

    public static double obliczPole(Kolo k) {
        return k.r * k.r * Math.PI;
    }
}
