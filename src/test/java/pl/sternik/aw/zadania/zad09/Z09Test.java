package pl.sternik.aw.zadania.zad09;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Z09Test {

    @Test
    public void zamien() {
        int[][] tab = {{2,3,4},{4,3,2,6},{7,5,6,8,7},{3,4,2}};
        int[][] tab1 = tab.clone();
        int w1 = 1;
        int w2 = 2;
        Z09.zamien(w1,w2,tab);
        assertThat(tab[w1]).isEqualTo(tab1[w2]);
    }
}