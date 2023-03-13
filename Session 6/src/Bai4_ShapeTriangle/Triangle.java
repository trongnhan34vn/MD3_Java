package Bai4_ShapeTriangle;

public class Triangle extends Shape {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getArea() {
        double halfPermeter = getPerimeter() / 2;
        return Math.sqrt(halfPermeter * (halfPermeter - a) * (halfPermeter - b) * (halfPermeter - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
