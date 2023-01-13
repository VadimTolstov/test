package Igri.Saxmati;

public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return a*a+b*b;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public double getHeight() {
        if (a>b)
        return b;
        else return a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
