package pl.sternik.aw.zadania.zad24;

import pl.sternik.aw.zadania.zad07.DivideByZeroException;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Z24 {
    private int[] tab = {1,2,3,4};

    public static void main(String[] args) {
        Z24 z24 = new Z24();
        int x = 1;
        int y = 0;
        try {
            if(y == 0) {
                throw new DivideByZeroException("Dzielenie przez 0!!!!");
            }
            z24.podziel(x, y);
        } catch (DivideByZeroException e){
            System.out.println("Tak nie wolno!");
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(z24.dajElement(4));

        System.out.println();
        System.out.println(z24.wczytaj());

    }

    public double podziel(int i, int i1) throws ArithmeticException {
        double wynik = 0;
        wynik = i / i1;
        return wynik;
    }

    public int dajElement(int i){
        try {
            return tab[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException. Nie ma tekiego indexu: " + i);
            return 0;
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
            System.out.println("Wywołanie finally");
            in.close();
        }
    }
}
