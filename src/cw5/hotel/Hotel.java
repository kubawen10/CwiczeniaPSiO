package cw5.hotel;

public class Hotel {
    private final Pokoj [] pokoje;
    private Osoba[] osoby;

    public Hotel(int ilePokoi){
        pokoje = new Pokoj[ilePokoi];

        for(int i=0; i<pokoje.length;i++){
            pokoje[i]= new Pokoj(i, false);
        }
    }

    public boolean czySaWolnePokoje(){
        for(Pokoj p: pokoje){
            if(!p.isWynajety()){
                return true;
            }
        }
        return false;
    }

    public boolean czyPokojWolny(int numer){
        return !pokoje[numer].isWynajety();
    }

    public int ileWolnychPokoi(){
        int suma=0;
        for (int i=0;i<pokoje.length;i++){
            if (czyPokojWolny(i)){
                suma+=1;
            }
        }
        return suma;
    }



    public boolean czyWBazieDanych(Osoba o){
        if (osoby == null) return false;
        for (Osoba os: osoby){
            if (os==o) return true;
        }
        return false;
    }

    private void dodajOsobe(Osoba o){ //nie ma metody usun osobe dla przechowywania danych ez?
        if(czyWBazieDanych(o)) return;

        Osoba [] noweOsoby;
        if (osoby==null){
            noweOsoby = new Osoba[1];
            noweOsoby[0]=o;
        }
        else{
            noweOsoby = new Osoba[osoby.length+1];
            for (int i=0;i< osoby.length;i++){
                noweOsoby[i]=osoby[i];
            }
            noweOsoby[osoby.length]=o;
        }

        osoby = noweOsoby;
    }

    public boolean wynajmijPokoj(int numer, Osoba osoba){
        if(numer>=pokoje.length) return false;
        if (!czyPokojWolny(numer)) return false;
        pokoje[numer].setWynajety(true);

        osoba.setPokoje(true, numer);
        dodajOsobe(osoba);

        return true;
    }

    public boolean zwolnijPokoj(int numer){
        if(czyPokojWolny(numer)) return false;

        pokoje[numer].setWynajety(false);

        for(Osoba o: osoby){
            if(o.wynajmujePokoj(numer)){
                o.setPokoje(false, numer);
                return true;
            }
        }
        return false;
    }

    public boolean wynajmujePokoj(String nazwisko){
        for(Osoba o: osoby){
            if(o.getNazwisko() == nazwisko){
                if(o.getPokoje().length>0) return true;
                return false;
            }
        }
        return false;
    }

    public void wyrzucOsobe(Osoba o){
        for(int pokoj: o.getPokoje()){
            zwolnijPokoj(pokoj);
        }
    }


    public Pokoj[] getPokoje() {
        return pokoje;
    }
}
