public class Zadanie3 {
    public static void main(String[] args) {
        int tab [] = {1, 2, 3, 9, 11, 12, 232, 0};
        int indeks = 4;
        wyswieltZTablicy(tab, indeks);
        wyswieltZTablicy(new int[]{1, 2, 3}, 1);
    }

    public static void wyswieltZTablicy(int tab [], int indeks) {
        System.out.println(tab[indeks]);
    }
}

