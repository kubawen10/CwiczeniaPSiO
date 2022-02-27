package cw5.hotel;

public class Pokoj {
    private final int numer;
    private boolean wynajety;

    public Pokoj(int numer, boolean wynajety){
        this.numer=numer;
        this.wynajety=wynajety;
    }

    public void setWynajety(boolean wynajety) {
        this.wynajety = wynajety;
    }

    public boolean isWynajety() {
        return wynajety;
    }

    public int getNumer() {
        return numer;
    }
}
