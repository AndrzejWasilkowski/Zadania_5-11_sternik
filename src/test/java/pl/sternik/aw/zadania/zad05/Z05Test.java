package pl.sternik.aw.zadania.zad05;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Z05Test {

    @Test
    public void testPetlaFor() {
        String[] tablica = {"Jeden","Dwa","Trzy","Cztery","Pięć"};
        String wynik = "Petla For:\nJeden\nDwa\nTrzy\nCztery\nPięć\n";

        String obecnie = Z05.PetlaFor(tablica);
        assertThat(obecnie).isEqualTo(wynik);
    }

    @Test
    public void testPetlaWhile() {
        String[] tablica = {"Jeden","Dwa","Trzy","Cztery","Pięć"};
        String wynik = "Petla While:\nJeden\nDwa\nTrzy\nCztery\nPięć\n";

        String obecnie = Z05.PetlaWhile(tablica);
        assertThat(obecnie).isEqualTo(wynik);
    }

    @Test
    public void testPetlaForeach() {
        String[] tablica = {"Jeden","Dwa","Trzy","Cztery","Pięć"};
        String wynik = "Petla ForEach:\nJeden\nDwa\nTrzy\nCztery\nPięć\n";

        String obecnie = Z05.PetlaForeach(tablica);
        assertThat(obecnie).isEqualTo(wynik);
    }
}