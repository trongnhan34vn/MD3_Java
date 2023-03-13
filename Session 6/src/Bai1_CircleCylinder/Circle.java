package Bai1_CircleCylinder;

public class Circle {
    private final double PI = Math.PI;
    private int radius = 5;
    private String color = "red";

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", color='" + color + '\''+
                ", area=" + getArea() +
                '}';
    }
}
