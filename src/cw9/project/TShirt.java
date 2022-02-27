package cw9.project;

public class TShirt extends Cloth{
    public TShirt(int size){
        super(size);
        setWb(new TShirtWB());
    }
}

