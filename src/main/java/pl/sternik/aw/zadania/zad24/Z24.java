package pl.sternik.aw.zadania.zad24;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Z24 {
    private int[] tab = {1,2,3,4};

    public static void main(String[] args) {

        Z24 z24 = new Z24();
        z24.podziel(1,0);


    }

    public double podziel(int i, int i1) {
        double wynik = i / i1;
        return wynik;
    }

    public int dajElement(int i) {
        try {
            System.out.println(tab[i]);
            return tab[i];
        } catch (IndexOutOfBoundsException e){
            System.out.println("Błąd indexu");
            System.out.println(e);
            return -1;
        }
    }
    public static Date wczytaj() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj datę(dd.mm.rrrr): ");
        String text = in.nextLine();
        DateFormat dataFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        Date data;
        try {
            data = dataFormat.parse(text);
            return data;
        } catch (ParseException e) {
            System.out.println("Błąd:" + e);
            return null;
        } finally {
            in.close();
        }
    }
}
