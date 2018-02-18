package pl.sternik.aw.zadania.proc_obj.proceduralnie;

public class ProceduryObwody {
    public static int obliczObwod(Kwadrat k){
        return 4*k.a;
    }

    public static int obliczObwod(Prostokat p){
        return 2*p.a + 2*p.b;
    }

    public static double obliczObwod(Kolo k){
        return Math.PI * 2 * k.r;
    }
}
