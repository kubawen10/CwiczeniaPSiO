package cw12.zadanie1.Hashset;

public abstract class Pracownik implements Comparable<Pracownik>{
    protected String nazwisko;
    protected double czescEtatu;

    public Pracownik(String nazwisko, double czescEtatu) {
        this.nazwisko = nazwisko;
        this.czescEtatu = czescEtatu;
    }

    @Override
    public int compareTo(Pracownik other){
        return nazwisko.compareTo(other.getNazwisko());
    }


    public boolean equals(Pracownik a){
        if (this==a){
            return true;
        }
        if (nazwisko==a.getNazwisko()) {
            return true;
        }
        return false;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getCzescEtatu() {
        return czescEtatu;
    }

    public void setCzescEtatu(double czescEtatu) {
        this.czescEtatu = czescEtatu;
    }

    public abstract double placa();
}
