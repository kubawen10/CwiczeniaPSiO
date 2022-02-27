package cw11.zapisTablicyDoPliku;

import java.io.*;
import java.util.Random;

public class Main {
    public static int[][] generuj(int a, int b){
        int [][] tab = new int[a][b];
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j]=r.nextInt(100);
            }
        }
        return tab;
    }

    public static void zapisz(int [][] t, String plik){
        try (PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(plik)))){
            p.println("Macierz");
            p.println(t.length);
            p.println(t[0].length);

            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    p.printf("%5d", t[i][j]);
                }
                p.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        int [][] t = generuj(10,10);
        zapisz(t, "src/cw11/zapisTablicyDoPliku/zapis.txt");

    }
}
