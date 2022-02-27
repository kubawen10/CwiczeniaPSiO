package cw10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EO {
    public static void main(String[] args){
        int ile;
        String co;
        String str = "Ala ma 3 koty oraz 4 psy";
        Scanner s = new Scanner(str).useDelimiter(" ");
        while(s.hasNext()){
            if(s.hasNextInt()){
                ile=s.nextInt();
                co=s.next();
                System.out.println(ile+" "+co);
            }
            else
            {
                s.next();
            }


        }



    }
}
