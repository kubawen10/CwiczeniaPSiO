package cw5.hotel.hotelNaCW;

public class Pokoj {
    private int nr;
    private Osoba o;

    public Pokoj(int numer) {
        nr = numer;
        o = null;
    }

    public Osoba getO() {
        return o;
    }

    public int getNr(){
        return nr;
    }

    public void setO(Osoba o) {
        this.o = o;
    }
}
