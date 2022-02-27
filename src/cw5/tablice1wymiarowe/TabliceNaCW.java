package cw5.tablice1wymiarowe;

import java.util.Random;

public class TabliceNaCW {
    private int[] tab;

    public TabliceNaCW(int n){
        tab = new int[n];
    }

    public void wypelnij(int zakres){
        for(int i=0;i<tab.length;i++){
            Random generator = new Random();
            tab[i] = generator.nextInt(zakres);
        }
    }

    public String toString(){
        String napis = "";

        for (int i=0;i<tab.length;i++){
            napis+=tab[i];
            if (i!=tab.length-1){
                napis+=", ";
            }
        }
        return napis;
    }

    public int szukajElement(int e){
        for(int i=0;i<tab.length;i++){
            if (tab[i]==e) return i;
        }
        return -1;
    }

    public void usunElement(int e){
        int index = szukajElement(e);

        if (index==-1) return;

        int [] nowaTablica = new int[tab.length-1];

        for (int i=0;i<index;i++){
            nowaTablica[i]=tab[i];
        }
        for(int i=index+1;i<tab.length;i++){
            nowaTablica[i-1]=tab[i];
        }

        tab=null;
        tab=nowaTablica;

    }

    public static void main(String[] args) {
        TabliceNaCW t = new TabliceNaCW(10);

        t.wypelnij(10);

        System.out.println(t);

        t.usunElement(4);

        System.out.println(t);
    }
}
