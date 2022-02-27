package cw10.zadanie3;

import java.io.*;
import java.util.Random;

public class Main {
    public static void wypelnij(double[][] t) {
        Random r = new Random();
        double n;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                n = r.nextDouble() * 15;

                t[i][j] = n;
            }
        }
    }
    public static void wypisz(double [][] t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%.2f\t", t[i][j]);
            }
            System.out.println();
        }
    }

    public static double liczSrednia(double [][] t){
        double suma=0;
        double ilosc=0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                suma+=t[i][j];
                ilosc+=1;
            }
        }
        return suma/ilosc;
    }

    public static double liczOdchylenie(double [][] t, double srednia){
        double suma=0;
        int ilosc=0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                suma+=Math.pow((t[i][j]-srednia), 2);
                ilosc+=1;
            }
        }
        return Math.sqrt(suma/ilosc);
    }

    public static void main(String[] args) throws IOException {
        zadanie3a();
        System.out.println();
        System.out.println();
        zadanie3b();

    }

    public static void zadanie3b() throws IOException{
        FileReader fileReader = new FileReader("src/cw10/zadanie3/input.txt");
        BufferedReader br = new BufferedReader(fileReader);
        double[][] tab=null;
        int wiersze=0;
        int kolumny=0;
        int obecnyWiersz=0;
        String wiersz;
        while((wiersz = br.readLine()) != null){
            if (wiersz.equals("Macierz")){
                wiersze = Integer.parseInt(br.readLine());
                kolumny = Integer.parseInt(br.readLine());
                tab = new double[wiersze][kolumny];
            }
            else if(obecnyWiersz<wiersze){
                String [] liczby = wiersz.split("\\s+");
                for (int i = 0; i < kolumny; i++) {
                    tab[obecnyWiersz][i] = Double.parseDouble(liczby[i].replace(",", ""));
                }
                obecnyWiersz+=1;
            }

        }

        wypisz(tab);
        System.out.println();
        double srednia = liczSrednia(tab);
        System.out.printf("srednia: %.2f%n", srednia);
        double odchylenie = liczOdchylenie(tab, srednia);
        System.out.printf("odchylenie: %.2f%n", odchylenie);
        br.close();
    }

    public static void zadanie3a() throws IOException {
        FileWriter fileWriter = new FileWriter("src/cw10/zadanie3/input.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);

        double[][] tab = new double[10][10];
        wypelnij(tab);
        wypisz(tab);

        bw.write("Macierz\n");
        bw.write(tab.length + "\n");
        bw.write(tab[0].length + "\n");

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                bw.write(String.format("%.2f\t", tab[i][j]));
            }
            bw.write("\n");
        }
        bw.close();
    }
}
