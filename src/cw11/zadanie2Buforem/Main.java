package cw11.zadanie2Buforem;

import java.io.*;

public class Main {
    public static void kopiujPlik(String zPliku, String doPliku){
        File f1 = new File(zPliku);
        File f2 = new File(doPliku);

        byte[] b = new byte[512];
        int size = 0;
        try(FileInputStream fis = new FileInputStream(f1); FileOutputStream fos = new FileOutputStream(f2)){
            while ((size= fis.read(b, 0, 512))!=-1){
                fos.write(b, 0, size);
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
