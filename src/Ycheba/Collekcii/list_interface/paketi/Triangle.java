package Ycheba.Collekcii.list_interface.paketi;

public class Triangle extends Shape {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB() + c) ;

    }
}
