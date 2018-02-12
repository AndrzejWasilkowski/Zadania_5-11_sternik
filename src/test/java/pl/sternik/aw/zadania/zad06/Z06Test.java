package pl.sternik.aw.zadania.zad06;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Z06Test {

    @Test
    public void znajdzMin() {
        int[][] tab = {{2,31},{4,7,3},{6,5,4,1},{3}};
        int max = Z06.ZnajdzMin(tab);

        assertThat(max).isEqualTo(1);
    }

    @Test
    public void znajdzMax() {
        int[][] tab = {{2,31},{4,7,3},{6,5,4,1},{3}};
        int max = Z06.ZnajdzMax(tab);

        assertThat(max).isEqualTo(31);
    }
}