package cw9.project;

public abstract class Cloth {
    private int size;
    private WearBehaviour wb;

    public Cloth(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWb(WearBehaviour wb) {
        this.wb = wb;
    }

    public void performWear(){
        wb.wear();
    }
}
