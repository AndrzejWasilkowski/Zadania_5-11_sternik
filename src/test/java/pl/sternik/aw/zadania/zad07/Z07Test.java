package pl.sternik.aw.zadania.zad07;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Z07Test {

    @Test
    public void znajdzLiczbeNormalny() {
        int[] tablica = {10,23,4,6,5,7,2,9};
        int dzielnik = 3;
        String sposob = "1";
        Z07 z07 = new Z07();
        String wejscie = z07.ZnajdzLiczbe(tablica,dzielnik,sposob);
        String wyjscie = "Liczba 6 jest podzielna przez 3 i znajduje się na miejscu 3\n";

        assertThat(wejscie).isEqualTo(wyjscie);
    }

    @Test
    public void znajdzLiczbeWhile() {
        int[] tablica = {10,23,4,6,5,7,2,9};
        int dzielnik = 3;
        String sposob = "2";
        Z07 z07 = new Z07();
        String wejscie = z07.ZnajdzLiczbe(tablica,dzielnik,sposob);
        String wyjscie = "Liczba 6 jest podzielna przez 3 i znajduje się na miejscu 3\n";

        assertThat(wejscie).isEqualTo(wyjscie);
    }

    @Test
    public void znajdzLiczbeNormalnyBrakZnalezionejLiczby() {
        int[] tablica = {11,3,9,13,15,19};
        int dzielnik = 2;
        String sposob = "2";
        Z07 z07 = new Z07();
        String wejscie = z07.ZnajdzLiczbe(tablica,dzielnik,sposob);
        String wyjscie = "Nie znaleziono liczby podzielnej\n";

        assertThat(wejscie).isEqualTo(wyjscie);
    }

    @Test
    public void znajdzLiczbeWhileBrakZnalezionejLiczby() {
        int[] tablica = {11,3,9,13,15,19};
        int dzielnik = 2;
        String sposob = "1";
        Z07 z07 = new Z07();
        String wejscie = z07.ZnajdzLiczbe(tablica,dzielnik,sposob);
        String wyjscie = "Nie znaleziono liczby podzielnej\n";

        assertThat(wejscie).isEqualTo(wyjscie);
    }

    @Test
    public void znajdzLiczbeZlySposobWybrania() {
        int[] tablica = {10,23,4,6,5,7,2,9};
        int dzielnik = 3;
        String sposob = "123123ads";
        Z07 z07 = new Z07();
        String wejscie = z07.ZnajdzLiczbe(tablica,dzielnik,sposob);
        String wyjscie = "Wybierz 1 lub 2\n";

        assertThat(wejscie).isEqualTo(wyjscie);
    }

    @Test(expected = DivideByZeroException.class)
    public void dzieleniePrzezZeroPierwszySposob(){
        int[] tablica = {10,23,4,6,5,7,2,9};
        int x = 0;
        Z07 Z07 = new Z07();

        System.out.println(Z07.ZnajdzLiczbe(tablica,x,"1"));
    }

    @Test(expected = DivideByZeroException.class)
    public void dzieleniePrzezZeroDrogiSposob(){
        int[] tablica = {10,23,4,6,5,7,2,9};
        int x = 0;
        Z07 Z07 = new Z07();

        System.out.println(Z07.ZnajdzLiczbe(tablica,x,"1"));
    }
}