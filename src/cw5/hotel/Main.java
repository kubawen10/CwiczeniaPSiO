package cw5.hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);
        Osoba o = new Osoba("Wengrzyn", "Jakub");

        System.out.println(hotel.czyWBazieDanych(o));

        hotel.wynajmijPokoj(0, o);
        hotel.wynajmijPokoj(1, o);
        hotel.wynajmijPokoj(1, o);
        hotel.wynajmijPokoj(2, o);
        hotel.wynajmijPokoj(5, o);
        hotel.wynajmijPokoj(11,o);
        o.wypiszPokoje();

        System.out.println(hotel.czyWBazieDanych(o));

        //System.out.println(hotel.wynajmujePokoj("Wengrzyn"));

        hotel.wyrzucOsobe(o);
        System.out.println(hotel.wynajmujePokoj("Wengrzyn"));
        System.out.println(hotel.czyWBazieDanych(o));
    }
}
