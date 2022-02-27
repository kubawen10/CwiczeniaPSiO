package cw5.hotel;

public class Osoba {
    private int[] pokoje;
    private final String nazwisko;
    private final String imie;

    public Osoba(String nazwisko, String imie){
        this.nazwisko=nazwisko;
        this.imie=imie;
    }

    public int[] getPokoje() {
        return pokoje;
    }

    public void wypiszPokoje(){
        System.out.print("Pokoje: [");
        for (int p: pokoje){
            System.out.print(p+", ");
        }
        System.out.println("]");
    }

    public boolean wynajmujePokoj(int numer){
        for(int p: pokoje){
            if (p==numer) return true;
        }
        return false;
    }

    private void dodajPokoj(int numer){
        int [] nowePokoje;
        if (pokoje!=null){
            nowePokoje = new int[pokoje.length+1];
            for(int i=0;i<pokoje.length;i++){
                nowePokoje[i]=pokoje[i];
            }
        }
        else{
            nowePokoje = new int[1];
        }

        nowePokoje[nowePokoje.length-1]=numer;
        pokoje=null;
        pokoje=nowePokoje;
    }

    private void usunPokoj(int numer){
        int j=0;
        int [] nowePokoje = new int[pokoje.length-1];
        for (int i=0; i<pokoje.length;i++){
            if (pokoje[i]!=numer){
                nowePokoje[j]=pokoje[i];
                j++;
            }
        }
        pokoje=null;
        pokoje=nowePokoje;
    }

    public void setPokoje(boolean dodaj, int numer) {
        if (dodaj) dodajPokoj(numer);
        else usunPokoj(numer);
    }



    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
}
