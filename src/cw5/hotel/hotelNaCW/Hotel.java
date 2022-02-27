package cw5.hotel.hotelNaCW;

public class Hotel {
    private Pokoj [] hotel;

    public Hotel(int ilePokoi){
        hotel=new Pokoj[ilePokoi];

        for (int i=0;i<ilePokoi;i++){
            hotel[i] = new Pokoj(i);
        }
    }

    public int czyJestWolnyPokoj(){
        for (Pokoj p: hotel){
            if (p.getO()==null) return p.getNr();
        }
        return -1;
    }

    public boolean wynajmijPokoj(Osoba o){
        int wolnyPokoj = czyJestWolnyPokoj();

        if (wolnyPokoj==-1) return false;

        hotel[wolnyPokoj].setO(o);
        return true;
    }

    public int ileWolnychPokoi(){
        int suma = 0;
        for(Pokoj p: hotel){
            if(p.getO()!=null) suma+=1;
        }

        return suma;
    }
}
