package cw12.zadanie1.Araylista;

import java.util.Comparator;

public class PracownicyNazwiskoComparator implements Comparator<Pracownik> {

    @Override
    public int compare(Pracownik p1, Pracownik p2){
        if (p1 == null && p2 == null) {
            return 0;
        }
        if (p1 == null) {
            return 1;
        }
        if (p2 == null) {
            return -1;
        }
        return p1.compareTo(p2);
    }

}
