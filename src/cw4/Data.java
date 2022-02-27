package cw4;

import java.util.Scanner;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;

    public Data(){
        dzien=29;
        miesiac=10;
        rok=2021;
    }

    public Data(int dzien, int miesiac, int rok){
        this.dzien=dzien;
        this.miesiac=miesiac;
        this.rok=rok;
    }

    public Data(int rok){
        this.rok=rok;
        dzien=1;
        miesiac=1;
    }

    public boolean czyPrzestepny(){
        return ((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0);
    }

    public static boolean czyPrzestepny(int rok){
        return ((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0);
    }

    public int ileDniMaMiesiac(){
        int [] miesiace = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (miesiac==2){
            return czyPrzestepny()?miesiace[1]+1:miesiace[1];
        }
        return miesiace[miesiac - 1];
    }

    public static int ileDniMaMiesiac(int miesiac, int r) {
        int [] miesiace = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (miesiac == 2) {
            return czyPrzestepny(r) ? miesiace[1] + 1 : miesiace[1];
        }
        return miesiace[miesiac - 1];
    }

    public boolean czyDataPoprawna(){

        if (!(miesiac>0 && miesiac <=12)) return false;

        return (dzien>0) && (dzien<=ileDniMaMiesiac());
    }

    public static boolean czyDataPoprawna(int d, int m, int r){
        if (!(m>0 && m <=12)) return false;

        return d<=ileDniMaMiesiac(m,r);
    }

    public int ktoryDzienRoku(){
        int suma=0;
        for (int i=1;i<miesiac;i++){
            suma+=ileDniMaMiesiac(i,rok);
        }
        suma+=dzien;
        return suma;
    }

    public static int ktoryDzienRoku(int d, int m, int r){
        int suma=0;
        for (int i=1; i<m; i++){
            suma+=ileDniMaMiesiac(i, r);
        }
        suma+=d;

        return suma;
    }

    public void ustawDate(){
        int d;
        int m;
        int r;
        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("Podaj dzien: ");
            d = sc.nextInt();
            System.out.println("Podaj miesiac: ");
            m = sc.nextInt();
            System.out.println("Podaj rok: ");
            r = sc.nextInt();
        }
        while(czyDataPoprawna(d, m, r));

        dzien=d;
        miesiac=m;
        rok=r;
    }

    public static int compareDates(Data d1, Data d2){   //-1 -> d1 is greater
        if(d1.rok>d2.rok){                              //1  -> d2 is greater
            return -1;                                  //0  -> same dates
        }
        else if (d1.rok<d2.rok){
            return 1;
        }
        else {
            if (d1.miesiac>d2.miesiac){
                return -1;
            }
            else if (d1.miesiac<d2.miesiac){
                return 1;
            }
            else{
                if (d1.dzien>d2.dzien){
                    return -1;
                }
                else if (d1.dzien<d2.dzien){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
    }

    private static int calculateDays(Data d1, Data d2){
        int suma=0;

        //dodaje do sumy tyle dni ile ma dany rok, jezeli miedzy datami jest jeden caly rok roznicy
        for (int i=d1.rok+1; i<d2.rok; i++){
            suma+=czyPrzestepny(i)?366:365;
        }

        //jezeli daty sa rozne dodaje tyle dni ile jest do konca roku d1 i ktoryDzienRoku d2
        if (d1.rok!=d2.rok){
            suma+=d1.czyPrzestepny()?366-d1.ktoryDzienRoku():365-d1.ktoryDzienRoku();
            suma+=d2.ktoryDzienRoku();
        }else{ //w przeciwnym raze dodaje roznice miedzy ktoryDzienRoku obu dat
            suma+=d2.ktoryDzienRoku()-d1.ktoryDzienRoku();
        }
        return suma;
    }

    public static int daysBetween(Data d1, Data d2){
        int suma=0;
        if (compareDates(d1, d2) == -1 ){ //d1 is later than d2
            return calculateDays(d2, d1);
        }
        else if (compareDates(d1, d2) == 1){ //d2 is later than d1
            return calculateDays(d1, d2);
        }
        else{ //same dates
            return 0;
        }
    }

    public String dzienTygodnia(){
        String [] daysNames = {"Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela"};
        Data d1 = new Data(1900); //poniedzialek
        int days = daysBetween(d1, this);
        return daysNames[days%7];
    }

    @Override
    public String toString(){
        return dzien+ "" +miesiac+"."+rok;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public static void main(String[] args) {
        Data data1 = new Data(3,1,1900);
        Data data2 = new Data(25, 2, 2002);
        System.out.println(data2.dzienTygodnia());
    }
}
