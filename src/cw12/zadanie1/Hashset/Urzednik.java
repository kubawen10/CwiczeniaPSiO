package cw12.zadanie1.Hashset;

public class Urzednik extends Pracownik {
    private double podstawowaPlaca = 3000;
    public Urzednik(String nazwisko, double czescEtatu){
        super(nazwisko, czescEtatu);
    }

    public double placa(){
        return czescEtatu * podstawowaPlaca;
    }

    public String toString(){
        return nazwisko + " - Urzednik - Etat: " + czescEtatu;
    }


}
