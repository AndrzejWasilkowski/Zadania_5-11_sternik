package pl.sternik.aw.zadania.zad24;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Z24Test {
    private Z24 z24 = new Z24();
    private int x = 1;
    private int y = 0;
    private int[] tab = {1,2,3,4};
    private int index = 4;

    @Test(expected = ArithmeticException.class)
    public void testDzieleniePrzezZero() throws ArithmeticException {
        z24.podziel(x, y);
    }

    @Test
    public void testDajElementOutOfBoundException() {
        assertThat(z24.dajElement(index)).isEqualTo(0);
    }
}