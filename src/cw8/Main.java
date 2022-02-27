package cw8;

public class Main {
    public static void main(String[] args) {
        Pracownik r = new Robotnik("Wengrzyn", 1, 20);
        Pracownik u = new Urzednik("Kozak", 1);

        Firma f = new Firma(10);
        f.zatrudnijPracownika(r);
        f.zatrudnijPracownika(u);
        f.wypiszPracownikow();

        f.sortuj();
        System.out.println();

        f.wypiszPracownikow();

        //System.out.println(u.compareTo(r));
    }
}
