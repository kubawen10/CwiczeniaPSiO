package cw11.odczytTablicyZPliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static int[][] zPliku(String path) {
        int [][] t=null;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            int wiersze = Integer.parseInt(br.readLine());
            int kolumny = Integer.parseInt(br.readLine());
            t = new int[wiersze][kolumny];

            for (int i = 0; i < wiersze; i++) {
                String [] s = br.readLine().trim().split("\\s+");

                for (int j = 0; j < kolumny; j++) {
                    t[i][j] = Integer.parseInt(s[j]);

                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("eoeo");
        }
        catch (IOException e){
            System.out.println("dupa");
        }
        return t;
    }

    public static void main(String[] args) {
        int [][] t = zPliku("src/cw11/zapisTablicyDoPliku/zapis.txt");

    }
}
