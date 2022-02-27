package cw11.jakiesTamMoje;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
    public void readFile(){
        int bytee;
        try (FileInputStream fis = new FileInputStream("src/cw11/input.txt")) {
            while((bytee = fis.read()) != -1){
                System.out.println((char)bytee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
