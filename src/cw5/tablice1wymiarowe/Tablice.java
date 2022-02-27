package cw5.tablice1wymiarowe;

//biblioteka arrays

public class Tablice {
    public static String toString(int [] tab){
        String napis="";
        napis += "Tablica: [";
        for(int i=0; i<tab.length;i++){
            napis+= tab[i] + (i== tab.length-1?"]":", ");
        }
        return napis;
    }

    public static int znajdzIndex(int [] tab, int szukana){
        for(int i=0;i<tab.length;i++){
            if (tab[i]==szukana) return i;
        }
        return -1;
    }

    public static int znajdzIndexPosortowana(int [] tab, int szukana, boolean rosnaca){
        int l = 0;
        int p = tab.length-1;
        int sr;
        while(l<=p){
            sr=(l+p)/2;
            if(tab[sr]==szukana){
                return sr;
            }
            else if (rosnaca?tab[sr]>szukana:tab[sr]<szukana){
                p=sr-1;
            }
            else{
                l=sr+1;
            }
        }
        return -1;

    }

    public static int[] dodajElementNaIIndexie(int [] tab, int element, int index){
        int [] newTab = new int[tab.length+1];
        //dodaj elementy przed indeksem
        for(int i=0; i<index;i++){
            newTab[i]=tab[i];
        }
        //dodaj dany element na danym indeksie
        newTab[index]=element;
        //dodaj elementy po indeksie
        for(int i=index+1; i<newTab.length;i++){
            newTab[i]=tab[i-1];
        }
        return newTab;
    }

    public static int[] dodajElementNaKoncu(int [] tab, int element){
        return dodajElementNaIIndexie(tab, element, tab.length);
    }

    public static int[] dodajElementNaPoczatku(int [] tab, int element){
        return dodajElementNaIIndexie(tab,element,0);
    }

    public static int[] dodajElementDoPosortowanej(int [] tab, int element, boolean rosnaco){
        int index=-1;
        for(int i=0;i<tab.length;i++){
            if(rosnaco?tab[i]>=element:tab[i]<=element){
                index=i;
                break;
            }
        }
        if (index==-1){
            index=tab.length;
        }
        return dodajElementNaIIndexie(tab,element,index);
    }

    public static int[] usunElementNaIIndexie(int [] tab, int index) {
        int[] newTab = new int[tab.length - 1];

        for (int i = 0; i < index; i++) {
            newTab[i] = tab[i];
        }
        for(int i=index;i<newTab.length;i++){
            newTab[i]=tab[i+1];
        }
        return newTab;
    }

    public static int[] usunElementZDowolnej(int [] tab, int element){
        return usunElementNaIIndexie(tab, znajdzIndex(tab,element));
    }

    public static int[] usunElementZPosortowanej(int [] tab, int element, boolean rosnaco){
        return usunElementNaIIndexie(tab, znajdzIndexPosortowana(tab, element, rosnaco));
    }

    public static int suma(int [] tab){
        int suma=0;
        for(int i: tab){
            suma+=i;
        }
        return suma;
    }

    public static double srednia(int [] tab){
        return (double)suma(tab)/tab.length;
    }

    public static void main(String[] args) {
        int[] tab = {1, 7, 4, 6, 2, 0, 9};

        System.out.println(Tablice.toString(tab));
    }
}
