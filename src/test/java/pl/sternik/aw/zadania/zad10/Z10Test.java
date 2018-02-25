package pl.sternik.aw.zadania.zad10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Z10Test {

    @Test
    public void oblicz() {
        int[][] liczby = {{10,20,30,40},{5,4,3,2}};
        String[] znaki = {"+","-","*","/"};
        int[] oczekiwany = {15,16,90,20};

        Z10 z10 = new Z10();

        int[] wynik = z10.oblicz(liczby,znaki);
        assertThat(wynik).isEqualTo(oczekiwany);
    }
    @Test(expected = ArithmeticException.class)
    public void obliczDzieleniePrzezZero() {
        int[][] liczby = {{10,20,30,40},{5,4,3,0}};
        String[] znaki = {"+","-","*","/"};
        int[] oczekiwany = {15,16,90,20};

        Z10 z10 = new Z10();

        int[] wynik = z10.oblicz(liczby,znaki);
        assertThat(wynik).isEqualTo(oczekiwany);
    }
}