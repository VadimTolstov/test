package Nasledovanie;

public class CollorPoint extends Super {
    private int color;


    public CollorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }
    public  void print(){
        super.print();
        System.out.println("и цвет" + color);
    }
}

