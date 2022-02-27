package cw6.tablice2wymiarowe;

import java.util.Random;

public class tablica2CW {
    int tab2[][];

    public tablica2CW(int wiersze, int kolumny){
        tab2 = new int[wiersze][kolumny];
    }

    public void wypelnij(int intOd, int intDo){
        Random random = new Random();
        for(int i=0;i<tab2.length;i++){
            for(int j=0;j<tab2[i].length;j++){
                tab2[i][j] = random.nextInt(intDo-intOd+1)+intOd;
            }
        }
    }

    public void wypisz(){
        int [] szerokosci = new int [tab2[0].length];

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                String s = Integer.toString(tab2[j][i]);
                if (s.length()>szerokosci[i]){
                    szerokosci[i]=s.length();
                }
            }
        }

        for(int i=0;i<tab2.length;i++) {
            for (int j = 0; j < tab2[i].length; j++) {

                int curS = szerokosci[j];
                String s = Integer.toString(tab2[i][j]);

                for(int k=0;k<curS-s.length();k++){
                    System.out.print(" ");
                }

                System.out.print(tab2[i][j]+"   ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        tablica2CW t = new tablica2CW(10,10);
        for(int i=0;i<15;i++){
            t.wypelnij(59,300);
        }
        t.wypisz();
    }

}
