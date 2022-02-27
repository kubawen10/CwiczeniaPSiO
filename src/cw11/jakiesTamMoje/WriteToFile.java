package cw11.jakiesTamMoje;

import java.io.*;
import java.util.Random;

public class WriteToFile {
    private byte[] generateBytes(){
        int numberOfBytes = 2000;
        byte[] bytes = new byte[numberOfBytes];
        Random r = new Random();
        r.nextBytes(bytes);

        return bytes;
    }

    public void writeToFile() {
        File file = new File("src/cw11/input.txt");

        byte[] data = generateBytes();

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
