package cw12.zadanie1.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Firma {
    private HashSet<Pracownik> pracownicy;

    public Firma(int iloscPracownikow) {
        pracownicy = new HashSet<>();
    }

    public void zatrudnijPracownika(Pracownik p) {
        pracownicy.add(p);
    }

    public void zwolnijPracownika(String nazwisko) {
        for (int i = 0; i < pracownicy.size(); i++) {
            /*if (pracownicy.get(i).getNazwisko()==nazwisko){
                pracownicy.remove(i);
                break;
            }*/
        }
    }

    public int iloscZatrudnionych() {
        return pracownicy.size();
    }

    public double sumaPlac() {
        double suma = 0;
        for (int i = 0; i < pracownicy.size(); i++) {
            //suma+=pracownicy.get(i).placa();
        }
        return suma;
    }

    public void wypiszPracownikow() {
        Iterator<Pracownik> iterator = pracownicy.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void wypiszWyplaty() {
        int lp = 1;
        for (Pracownik pracownik : pracownicy) {
            System.out.println(lp + " " + pracownik + " - Wyplata: " + pracownik.placa());
        }
    }

   /* public void sortuj(){
        Collections.sort(pracownicy);
    }*/


}
