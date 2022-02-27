package cw12.zadanie3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class PrzetwarzaniePliku {
    ArrayList<String> slowa = new ArrayList<>();

    public static void main(String[] args) {
        PrzetwarzaniePliku m = new PrzetwarzaniePliku();
        m.wczytaj("src/cw12/zadanie3/text.txt");
        System.out.println("Ilosc slow: " + m.slowa.size());
        HashSet<String> hs = new HashSet<>(m.slowa);
        System.out.println("Ilosc unikalnych slow: "+ hs.size());
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String s: hs){
            int sum = 0;
            for (String ss: m.slowa){
                if (ss.equals(s)){
                    sum+=1;
                }
            }
            map.put(s, sum);
        }

        for (Map.Entry<String, Integer> i: map.entrySet()){
            System.out.println(i.getKey()+ " "+ i.getValue());
        }

        for (Map.Entry<String, Integer> i: map.entrySet()){
            System.out.println(i.getKey()+ " "+ i.getValue());
        }

    }

    public void wczytaj(String nazwaPliku){
        try{
            File plik = new File(nazwaPliku);
            BufferedReader br = new BufferedReader(new FileReader(plik));
            String wiersz = null;
            while((wiersz=br.readLine()) != null){
                dodajPiosenke(wiersz);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void dodajPiosenke(String wiersz){
        String [] s = wiersz.split("\\s+");
        for (String i: s){
            slowa.add(i);
        }
    }

}
