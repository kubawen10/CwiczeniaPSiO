package cw10.zadanie2Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Liczba wierszy: ");
        int wiersze = scan.nextInt();
        scan.nextLine();

        System.out.print("Liczba kolumn: ");
        int kolumny = scan.nextInt();
        scan.nextLine();

        int tab[][]=new int[wiersze][kolumny];
        double suma=0;

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                tab[i][j] = scan.nextInt();
                suma+=tab[i][j];
            }
        }

        System.out.println(suma/(wiersze*kolumny));
        System.out.println();

        for (int i = 0; i < kolumny; i++) {
            for (int j = 0; j < wiersze; j++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
