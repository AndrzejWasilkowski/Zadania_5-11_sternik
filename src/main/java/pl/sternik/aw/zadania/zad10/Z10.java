package pl.sternik.aw.zadania.zad10;

public class Z10 {
    public static void main(String[] args){
        int[][] liczby = {{2,3,4,5},{5,4,3,1}};
        String[] znaki = {"+","-","*","/"};
        Z10 z10 = new Z10();
        int[] wynik = z10.oblicz(liczby,znaki);
        wypisz(wynik);
    }
    public static void wypisz(int[] tab){
        for (int i:tab){
            System.out.print(i+" ");
        }
    }

    public int[] oblicz(int[][] liczby, String[] znaki){
        int[] wynik = new int[znaki.length];
        int wybor;

        for (int i=0;i<znaki.length;i++){
            if(znaki[i]=="*"){
                wybor = 1;
            } else if(znaki[i]=="/"){
                wybor = 2;
            } else if(znaki[i]=="-") {
                wybor = 3;
            } else {
                wybor = 4;
            }
            switch (wybor){
                case 1:
                    wynik[i] = liczby[0][i] * liczby[1][i];
                    break;
                case 2:
                    try {
                        wynik[i] = liczby[0][i] / liczby[1][i];
                    } catch (ArithmeticException e){
                        throw e;
                    }
                    /* Można założyć, że jak ktoś planuje dzielić przez 0 to to jakby chciał przez 1. Zawsze jakieś rozwiązanie.
                    if(liczby[1][i]!=0){
                        wynik[i] = liczby[0][i] / liczby[1][i];
                    } else {
                        wynik[i] = liczby[0][i] / 1;
                    }
                    */
                    /* Albo po prostu pomijamy to działanie i w tym miejscu będzie 0
                    if(liczby[1][i]!=0){
                        wynik[i] = liczby[0][i] / liczby[1][i];
                    }
                    */
                    break;
                case 3:
                    wynik[i] = liczby[0][i] - liczby[1][i];
                    break;
                case 4:
                    wynik[i] = liczby[0][i] + liczby[1][i];
                    break;
            }

        }
        return wynik;
    }
}
