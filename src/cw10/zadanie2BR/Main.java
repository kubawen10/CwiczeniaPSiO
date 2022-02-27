package cw10.zadanie2BR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Liczba wierszy: ");
        int wiersze = Integer.parseInt(br.readLine());


        System.out.print("Liczba kolumn: ");
       int kolumny = Integer.parseInt(br.readLine());


        int tab[][]=new int[wiersze][kolumny];
        double suma=0;

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                tab[i][j] = Integer.parseInt(br.readLine());
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

        br.close();
    }
}