package cw8;

public class Robotnik extends Pracownik {
    private int podstawowaLiczbaGodzin = 168;
    private double stawka;

    public Robotnik(String nazwisko, double czescEtatu, double stawka) {
        super(nazwisko, czescEtatu);
        this.stawka = stawka;
    }

    public int getPodstawowaLiczbaGodzin() {
        return podstawowaLiczbaGodzin;
    }

    public void setPodstawowaLiczbaGodzin(int podstawowaLiczbaGodzin) {
        this.podstawowaLiczbaGodzin = podstawowaLiczbaGodzin;
    }

    public double getStawka() {
        return stawka;
    }

    public void setStawka(double stawka) {
        this.stawka = stawka;
    }

    public String toString(){
        return nazwisko + " - Robotnik - Etat: " + czescEtatu;
    }

    public double placa() {
        double przepracowaneGodziny = czescEtatu * podstawowaLiczbaGodzin;
        double nadgodziny = czescEtatu > 1 ? przepracowaneGodziny - podstawowaLiczbaGodzin : 0;

        if (nadgodziny > 0) {
            return stawka * ((nadgodziny) * 1.5 + podstawowaLiczbaGodzin);
        } else {
            return stawka * przepracowaneGodziny;
        }

    }


}
