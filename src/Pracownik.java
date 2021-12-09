public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    int pensja;

    Pracownik() {

    }

    public Pracownik(String imie, String nazwisko, int wiek, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public void wypiszImieINazwisko() {
        System.out.println(imie + " " + nazwisko);
    }
}
