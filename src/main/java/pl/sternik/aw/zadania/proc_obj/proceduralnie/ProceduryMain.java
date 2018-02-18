package pl.sternik.aw.zadania.proc_obj.proceduralnie;

public class ProceduryMain {
    public static void main(String[] args) {
        Prostokat p = new Prostokat(2, 4);
        System.out.print("Prostokąt pole i obwód: ");
        System.out.print(ProceduryPola.obliczPole(p) + "  ");
        System.out.println(ProceduryObwody.obliczObwod(p));

        Kwadrat k = new Kwadrat(2);
        System.out.print("Kwadrat pole i obwód: ");
        System.out.print(ProceduryPola.obliczPole(k) + "  ");
        System.out.println(ProceduryObwody.obliczObwod(k));

        Kolo ko = new Kolo(4);
        System.out.print("Koło pole i obwód: ");
        System.out.print(ProceduryPola.obliczPole(ko)+ "  ");
        System.out.println(ProceduryObwody.obliczObwod(ko));
    }
}
