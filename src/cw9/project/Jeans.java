package cw9.project;

public class Jeans extends Cloth{
    public Jeans(int size){
        super(size);
        setWb(new JeansWB());
    }
}
