package Ycheba.Collekcii.list_interface.paketi;

public abstract class Shape {
    private double a;
    private double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimeter();

    public final void showPerimeter() {
        System.out.println(getPerimeter());
    }

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }
}
