public class Metody {
    public static void main(String[] args) {
//        wyswietlTekst("SKNI WARSZTATY", 1);
        // jakis kod
//        wyswietlTekst("SKNI", 3);
        // jakis
//        wyswietlTekst("!!!", 2);
        // jakis

        int wynik = dodaj(2, 3);
        System.out.println(wynik);

        System.out.println(dodaj(5, 7));
    }

    public static int dodaj(int liczba1, int liczba2) {
        int wynik = liczba1 + liczba2;
        return wynik;
    }

    public static void wyswietlTekst(String tekst, int ileRazy) {
        for (int i = 0; i < ileRazy; i++) {
            System.out.println(tekst);
        }
    }
}
