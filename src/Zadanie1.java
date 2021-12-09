public class Zadanie1 {
    public static void main(String[] args) {
        int[] tablica = {1, 5, 9, 11, 18, 19, 20, 192, 2812, 0};
        // zadanie 3.1
        {
            int suma = 0;
            for (int i = 0; i < tablica.length; i += 2) {
                suma = suma + tablica[i];
            }
            System.out.println(suma);
        }
        // zadanie 3.2
        {
            int suma = 0;
            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] % 2 == 1) {
                    suma += tablica[i];
                }
            }
            System.out.println(suma);
        }
    }
}
