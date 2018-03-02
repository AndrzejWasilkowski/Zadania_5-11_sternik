package pl.sternik.aw.zadania.zad07;

import java.util.Scanner;

public class Z07 {
    public static void main(String[] args){
        int[] tablica = {10,23,4,6,5,7,0,9};

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj szukaną liczbę");
        int x = in.nextInt();
        Z07 Z07 = new Z07();

        System.out.println(Z07.ZnajdzLiczbe(tablica,x,"1"));
        System.out.println(Z07.ZnajdzLiczbe(tablica,x,"2"));

        in.close();

    }

    public String ZnajdzLiczbe (int[] tablica, int x, String sposob){
        StringBuilder string = new StringBuilder();
        int miejsce;
        if (sposob == "1") {
            miejsce = ZnajdzPodzielnaWhile(tablica, x);
        } else if (sposob == "2") {

            miejsce = ZnajdzPodzielna(tablica, x);
        } else {
            string.append("Wybierz 1 lub 2\n");
            return string.toString();
        }

        if (miejsce > -1) {
            string.append("Liczba " + tablica[miejsce] + " jest podzielna przez " + x + " i znajduje się na miejscu " + miejsce + "\n");
        } else {
            string.append("Nie znaleziono liczby podzielnej\n");
        }
        return string.toString();
    }

    public int ZnajdzPodzielna(int[] tablica, int dzielnik){
        if (dzielnik == 0){
            throw new DivideByZeroException("Dzielenie przez 0!!!");
        }
        for (int i=0;i<tablica.length;i++){
            if (tablica[i] % dzielnik == 0) {
                return i;
            }
        }
        return -1;
    }

    public int ZnajdzPodzielnaWhile(int[] tablica, int dzielnik){
        if (dzielnik == 0){
            throw new DivideByZeroException("Dzielenie przez 0!!!");
        }
        int i = 0;
        while (i < tablica.length && tablica[i] % dzielnik != 0) {
            i++;
        }

        if (i<tablica.length){
            return i;
        } else{
            return -1;
        }
    }
}
