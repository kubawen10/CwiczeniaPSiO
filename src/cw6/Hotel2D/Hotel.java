package cw6.Hotel2D;

public class Hotel {
    int [] pok;
    private Pokoj[][] hotel;

    public Hotel(int [] pokNaPietrze){
        pok = pokNaPietrze;
        hotel = new Pokoj[pokNaPietrze.length][];
        for(int i=0;i<pokNaPietrze.length;i++){
            hotel[i] = new Pokoj[pokNaPietrze[i]];
        }
    }

    public void wypisz(){
        for (int i = 0; i < pok.length; i++) {
            System.out.println(pok[i]);
        }
        pok=null;
    }

    public static void main(String[] args) {
        int [] pokoje = {5,4,3,4};
        Hotel hotel = new Hotel(pokoje);

        for (int i = 0; i < pokoje.length; i++) {
            pokoje[i]=i;
        }

        hotel.wypisz();




    }
}
