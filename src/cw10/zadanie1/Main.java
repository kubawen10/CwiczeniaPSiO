package cw10.zadanie1;

import java.io.*;

//mozna zrobic Scanner(bufferedReader)
//i uzywac metod scannera

public class Main {
    public String wczytajDane(String informacja) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(informacja);
            String input = br.readLine();
            //br.close();
            return input;
        } catch (IOException e) {
            return "";
        } finally {
            try {
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }
    }

    public int liczWyrazy(String line) {
        String[] wyrazy = line.split("\\s+");
        return wyrazy.length;
    }

    public int liczZnakiCzarne(String line) {
        String[] wyrazy = line.split("\\s+");
        int ilosc = 0;

        for (String s : wyrazy) {
            ilosc += s.length();
        }

        return ilosc;
    }

    public int liczWystapienia(String line, String wyraz) {
        String[] wyrazy = line.split("\\s+");
        int ilosc = 0;

        for (String s : wyrazy) {
            if (s.equals(wyraz)) {
                ilosc += 1;
            }
        }

        return ilosc;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();

        int liczbaZnakow = 0;
        int liczbaZnakowCzarnych = 0;
        int liczbaWyrazow = 0;
        int liczbaWierszy = 0;
        int iloscWystapien = 0;


        String nazwaPliku;
        String zliczanyWyraz;
        nazwaPliku = m.wczytajDane("Nazwa pliku: ");
        zliczanyWyraz = m.wczytajDane("Zliczany wyraz: ");

        String sciezka = "src/cw10/zadanie1/";

        BufferedReader br = new BufferedReader(new FileReader(new File(sciezka + nazwaPliku)));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(sciezka + "kopia-" + nazwaPliku)));

        String line;
        while ((line = br.readLine()) != null) {
            liczbaZnakow += line.length();

            liczbaZnakowCzarnych += m.liczZnakiCzarne(line);

            liczbaWyrazow += m.liczWyrazy(line);

            liczbaWierszy += 1;

            iloscWystapien += m.liczWystapienia(line, zliczanyWyraz);
            bw.write(line + "\n");
        }

        System.out.println("Liczba znakow: " + liczbaZnakow);
        System.out.println("Liczba znakow czarnych: " + liczbaZnakowCzarnych);
        System.out.println("Liczba wyrazow: " + liczbaWyrazow);
        System.out.println("Liczba wierszy: " + liczbaWierszy);
        System.out.printf("Liczba wystapien (%s): %d%n", zliczanyWyraz, iloscWystapien);

        br.close();
        bw.close();
    }


}
