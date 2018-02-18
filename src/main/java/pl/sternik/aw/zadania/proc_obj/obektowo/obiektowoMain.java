package pl.sternik.aw.zadania.proc_obj.obektowo;

public class obiektowoMain {
    public static void main(String[] args) {
        Figura f = new Prostokat(2, 4);
        System.out.print("Prostokąt pole i obwód: ");
        System.out.print(f.obliczObwod() + "  ");
        System.out.println(f.obliczObwod());

        f = new Kwadrat(2);
        System.out.print("Kwadrat pole i obwód: ");
        System.out.print(f.obliczObwod() + "  ");
        System.out.println(f.obliczObwod());

        f = new Kolo(4);
        System.out.print("Koło pole i obwód: ");
        System.out.print(f.obliczObwod() + "  ");
        System.out.println(f.obliczObwod());
    }
}
