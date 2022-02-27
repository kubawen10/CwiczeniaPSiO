package cw11.zadanie2;

import java.io.*;

public class Main {
    public static void kopiujPlik(String zPliku, String doPliku){
        File f1 = new File(zPliku);
        File f2 = new File(doPliku);

        int obecnyByte;
        try(FileInputStream fis = new FileInputStream(f1); FileOutputStream fos = new FileOutputStream(f2)){
            while ((obecnyByte= fis.read())!=-1){
                fos.write(obecnyByte);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        kopiujPlik("src/cw11/pudzian.jpg", "src/cw11/pudziankopia.jpg");
    }
}
