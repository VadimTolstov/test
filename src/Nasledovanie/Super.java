package Nasledovanie;

public class Super {
    private double x, y;
    public Super(double x, double y) {

        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.print("Point with coords " + x + ", " + y);
    }
}

