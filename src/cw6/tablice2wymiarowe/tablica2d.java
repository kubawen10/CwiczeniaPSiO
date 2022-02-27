package cw6.tablice2wymiarowe;

public class tablica2d {
    public static void main(String[] args) {
        int [][]tab2d = new int[3][3];
        for (int i=0;i< tab2d.length;i++){
            for (int j=0;j<tab2d[i].length;j++){
                tab2d[i][j]=(i+1)*(j+1);
            }
        }

        for (int i=0;i< tab2d.length;i++){
            for (int j=0;j<tab2d[i].length;j++){
                System.out.print(tab2d[i][j]+" ");
            }
            System.out.println();
        }

        //-------------------------------------------------

        //różne rozmiary wierszy
        int[][] tab = new int[4][];
        for (int i=0;i< tab.length;i++){
            tab[i]=new int[tab.length-i];
            for (int j=0;j<tab[i].length;j++){
                tab[i][j]=i+j;
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }

    }
}
