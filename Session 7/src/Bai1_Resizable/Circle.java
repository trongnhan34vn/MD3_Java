package Bai1_Resizable;

public class Circle extends Shape implements Resizable {
    @Override
    public double resize() {
        double newRadius = getRadius() * (1 + Math.random());
        setRadius(newRadius);
        return getRadius();
    }

    private final double PI = Math.PI;
    public double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius,2) * PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                "area=" + getArea() +
                ", radius=" + radius +
                '}' + super.toString();
    }
}
