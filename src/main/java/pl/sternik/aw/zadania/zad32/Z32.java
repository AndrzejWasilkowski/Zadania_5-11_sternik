package pl.sternik.aw.zadania.zad32;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Z32 {
    public static void main(String[] args) {
        String[] tab = {"ala", "ma", "kota", "Pisa","dom"};
        Z32 z32 = new Z32();

        //Tworzenie kopi tablicy i wypisywanie
        String[] tabKopia = z32.kopiowanieTablicy(tab);
        System.out.println(z32.wypiszTabliceFor(tabKopia));

        //Sortwanie tablicy malejąco i wypisywanie For-Each
        z32.sortujTablice(tabKopia, 'M');
        System.out.println(z32.wypiszTabliceForEach(tabKopia));

        //Sortwanie tablicy rosnąco i wypisywanie For-Each
        z32.sortujTablice(tabKopia, 'R');
        System.out.println(z32.wypiszTabliceForEach(tabKopia));
    }

    public String[] kopiowanieTablicy(String[] tablica){
        System.out.println("KOPIOWANIE TABLICY");
        String[] kopiaTablicy = new String[tablica.length];
        System.arraycopy(tablica, 0, kopiaTablicy, 0, tablica.length);
        return kopiaTablicy;
    }

    public String wypiszTabliceFor(String[] tablica){
        StringBuilder wynik = new StringBuilder();
        for (int i=0; i<tablica.length;i++){
            wynik.append(tablica[i] + " ");
        }
        return wynik.toString();
    }

    public String wypiszTabliceForEach(String[] tablica){
        StringBuilder wynik = new StringBuilder();
        for (String s : tablica){
            wynik.append(s + " ");
        }
        return wynik.toString();
    }

    public String[] sortujTablice(String[] tablica, char rodzaj){
        if(rodzaj == 'M') {
            System.out.println("SORTOWANIE TABLICY MALEJĄCO");
            Arrays.sort(tablica, Collections.reverseOrder());
        } else if(rodzaj == 'R') {
            System.out.println("SORTOWANIE TABLICY ROSNĄCO");
            Arrays.sort(tablica);
        } else {
            System.out.println("NIE POSORTOWANO TABLICY ZŁY PARAMETR ('R' LUB 'M')");
        }
        return tablica;
    }
}
