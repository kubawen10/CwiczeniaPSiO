package cw11.jakiesTamMoje;

public class Main {
    public static void main(String[] args) {
        WriteToFile w = new WriteToFile();
        ReadFromFile r = new ReadFromFile();

        w.writeToFile();

        r.readFile();

    }
}
