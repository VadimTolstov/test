package Igri.Saxmati;

public class Square extends Quadrangle implements Figure {
    public Square(int a,  String color) {
        super(a, a, color);

    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return a*4;
    }

    @Override
    public double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
