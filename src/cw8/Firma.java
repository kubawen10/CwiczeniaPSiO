package cw8;

import java.util.Arrays;

public class Firma {
    private Pracownik[] pracownicy;

    public Firma(int iloscPracownikow) {
        pracownicy = new Pracownik[iloscPracownikow];
    }

    public void zatrudnijPracownika(Pracownik p) {
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] == null) {
                pracownicy[i] = p;
                return;
            }
        }
        System.out.println("Za duzo pracownikow");
    }

    public void zwolnijPracownika(String nazwisko) {
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i].getNazwisko().equals(nazwisko)) {
                pracownicy[i] = null;
                return;
            }
        }
        System.out.println("Nie ma takiego pracownika");
    }

    public int iloscZatrudnionych() {
        int suma = 0;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] != null) {
                suma += 1;
            }
        }
        return suma;
    }

    public double sumaPlac() {
        double suma = 0;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] == null) continue;
            suma += pracownicy[i].placa();
        }
        return suma;
    }

    public void wypiszPracownikow() {
        int lp = 1;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] == null) continue;

            System.out.println(lp + " " + pracownicy[i]);
            lp+=1;
        }
    }

    public void wypiszWyplaty() {
        int lp = 1;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] == null) continue;

            System.out.println(lp + " " + pracownicy[i] + " - Wyplata: " + pracownicy[i].placa());
        }
    }

    public void sortuj(){
        Arrays.sort(pracownicy, new PracownicyNazwiskoComparator());
    }


}
