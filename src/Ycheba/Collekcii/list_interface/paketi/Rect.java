package Ycheba.Collekcii.list_interface.paketi;

public class Rect extends Shape {
    public Rect(double storonaA, double storonaB) {
        super(storonaA, storonaB);
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB()) * 2;
    }
}
