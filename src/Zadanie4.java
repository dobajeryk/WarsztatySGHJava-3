public class Zadanie4 {
    public static void main(String[] args) {
        int kwota = 198;
        wypiszBanknotyIMonety(kwota);
    }

    public static void wypiszBanknotyIMonety(int kwota) {
        int banknot20 = 0;
        int banknot10 = 0;
        int moneta5 = 0;
        int moneta2 = 0;
        int moneta1 = 0;
        while (kwota > 0) {
            if (kwota >= 20) {
                banknot20++;
                kwota -= 20;
            } else if (kwota >= 10) {
                banknot10++;
                kwota -= 10;
            } else if (kwota >= 5) {
                moneta5++;
                kwota -= 5;
            } else if (kwota >= 2) {
                moneta2++;
                kwota -= 2;
            } else if (kwota >= 1) {
                moneta1++;
                kwota -= 1;
            }
        }
        System.out.println("Banknotow 20zł: " + banknot20);
        System.out.println("Banknotow 10zł: " + banknot10);
        System.out.println("Monet 5zł: " + moneta5);
        System.out.println("Monet 2zł: " + moneta2);
        System.out.println("Monet 1zł: " + moneta1);
    }
}
