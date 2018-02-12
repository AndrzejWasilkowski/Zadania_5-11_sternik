package pl.sternik.aw.zadania.zad05;

public class Z05 {
    public static void main(String[] args){
        String[] tablica = {"Jeden","Dwa","Trzy","Cztery","Pięć"};

        System.out.println(PetlaFor(tablica));
        System.out.println(PetlaWhile(tablica));
        System.out.println(PetlaForeach(tablica));
    }

    static String PetlaFor(String[] tablica){
        StringBuilder wynik = new StringBuilder("Petla For:\n");
        for(int i=0;i<tablica.length;i++){
            wynik.append(tablica[i]);
            wynik.append("\n");
        }
        return wynik.toString();
    }
    static String PetlaWhile(String[] tablica){
        StringBuilder wynik = new StringBuilder("Petla While:\n");
        int i = 0;
        while(i < tablica.length ) {
            wynik.append(tablica[i]);
            wynik.append("\n");
            i++;
        }
        return wynik.toString();
    }
    static String PetlaForeach(String[] tablica){
        StringBuilder wynik = new StringBuilder("Petla ForEach:\n");
        for (String slowo:tablica ) {
            wynik.append(slowo);
            wynik.append("\n");
        }
        return wynik.toString();
    }
}
